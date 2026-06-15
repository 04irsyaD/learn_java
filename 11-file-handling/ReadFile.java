import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "output.txt";
        File file = new File(fileName);

        // Cek apakah file exists sebelum membaca
        if (!file.exists()) {
            System.out.println("File " + fileName + " tidak ditemukan!");
            return;
        }

        // Menggunakan try-with-resources untuk membaca file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Isi file " + fileName + ":");
            System.out.println("-------------------------");
            
            // Membaca baris demi baris sampai habis (null)
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            System.out.println("-------------------------");
        } catch (IOException e) {
            System.out.println("Terjadi error saat membaca file: " + e.getMessage());
        }
    }
}
