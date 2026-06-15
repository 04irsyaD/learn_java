import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // Membuat ArrayList of String / Creating ArrayList of String
        ArrayList<String> fruits = new ArrayList<>();

        // Menambah elemen / Adding elements
        fruits.add("Apel");
        fruits.add("Pisang");
        fruits.add("Jeruk");
        fruits.add("Mangga");

        // Mengambil elemen berdasarkan index / Getting element by index
        System.out.println("Buah pertama: " + fruits.get(0));

        // Mengubah elemen / Updating element
        fruits.set(1, "Anggur");

        // Menghapus elemen / Removing element
        fruits.remove("Jeruk");

        // Mengetahui jumlah elemen / Getting size
        System.out.println("Jumlah buah: " + fruits.size());

        // Mengurutkan elemen / Sorting elements
        Collections.sort(fruits);

        // Iterasi dengan for-each / Iterating with for-each
        System.out.println("\nDaftar Buah:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
