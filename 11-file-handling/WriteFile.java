import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "output.txt";

        // Menggunakan try-with-resources agar file otomatis tertutup
        // Parameter kedua FileWriter (false) berarti overwrite. Jika true, maka append.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))) {
            
            writer.write("Halo, ini baris pertama.");
            writer.newLine(); // Membuat baris baru
            writer.write("Ini baris kedua hasil dari program Java.");
            writer.newLine();
            
            System.out.println("Berhasil menulis ke file " + fileName);

        } catch (IOException e) {
            System.out.println("Terjadi error saat menulis file: " + e.getMessage());
        }

        // Contoh mode Append (menambahkan di akhir file)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("Ini baris ketiga yang ditambahkan (append).");
            writer.newLine();
            System.out.println("Berhasil menambahkan teks ke file " + fileName);
        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
