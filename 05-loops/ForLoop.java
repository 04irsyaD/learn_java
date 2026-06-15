// Demonstrasi penggunaan For Loop di Java

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("=== 1. For Loop Dasar (1-5) ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        System.out.println("\n=== 2. For Loop Terbalik (Countdown) ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("Liftoff!");

        System.out.println("\n=== 3. Enhanced For-Each Loop ===");
        String[] fruits = {"Apel", "Pisang", "Jeruk", "Mangga"};
        for (String fruit : fruits) {
            System.out.println("Buah: " + fruit);
        }

        System.out.println("\n=== 4. Nested For Loop (Tabel Perkalian) ===");
        // Tabel perkalian 1 sampai 3
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---");
        }

        System.out.println("\n=== 5. Break dan Continue ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Melewati angka 3 (continue)");
                continue; // Skip iterasi 3
            }
            if (i == 5) {
                System.out.println("Berhenti di angka 5 (break)");
                break; // Keluar dari loop saat i = 5
            }
            System.out.println("Angka: " + i);
        }
    }
}
