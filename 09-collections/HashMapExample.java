import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Membuat HashMap dengan Key: String (Nama) dan Value: String (No Telp)
        HashMap<String, String> contacts = new HashMap<>();

        // Menambah data (put) / Adding data
        contacts.put("Andi", "081234567890");
        contacts.put("Budi", "089876543210");
        contacts.put("Citra", "085612349876");

        // Mengambil data berdasarkan key / Getting data by key
        System.out.println("Nomor telepon Andi: " + contacts.get("Andi"));

        // Menghapus data / Removing data
        contacts.remove("Budi");

        // Cek apakah key tertentu ada / Checking if key exists
        if (contacts.containsKey("Citra")) {
            System.out.println("Citra ada di daftar kontak.");
        }

        // Iterasi key dan value menggunakan entrySet / Iterating key-value pairs
        System.out.println("\nDaftar Kontak:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + " | No Telp: " + entry.getValue());
        }
    }
}
