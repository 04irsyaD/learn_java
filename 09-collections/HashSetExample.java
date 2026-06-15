import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Membuat HashSet / Creating HashSet
        HashSet<String> cars = new HashSet<>();

        // Menambah elemen / Adding elements
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("BMW");
        
        // Menambah elemen duplikat (akan diabaikan) / Adding duplicate
        cars.add("Toyota");

        // Cek keberadaan elemen / Checking element existence
        if (cars.contains("Honda")) {
            System.out.println("Honda ada di dalam HashSet");
        }

        // Menghapus elemen / Removing element
        cars.remove("Ford");

        // Iterasi HashSet / Iterating HashSet
        System.out.println("\nDaftar Mobil (Tidak Berurutan & Unik):");
        for (String car : cars) {
            System.out.println("- " + car);
        }
    }
}
