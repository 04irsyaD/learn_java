import java.util.Arrays;

// Demonstrasi Array 1 Dimensi

public class OneDimensionalArray {
    public static void main(String[] args) {
        System.out.println("=== 1. Deklarasi dan Inisialisasi ===");
        // Cara 1: Menentukan ukuran (default isinya 0)
        int[] scores = new int[5];
        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 78;
        scores[3] = 92;
        scores[4] = 88;
        
        // Cara 2: Inisialisasi langsung
        String[] students = {"Andi", "Budi", "Caca"};

        System.out.println("Siswa pertama: " + students[0]);
        System.out.println("Nilai siswa pertama: " + scores[0]);

        System.out.println("\n=== 2. Iterasi Array ===");
        System.out.println("Menggunakan For Loop:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Siswa ke-" + (i+1) + " : " + students[i]);
        }

        System.out.println("\nMenggunakan For-Each Loop:");
        int sum = 0;
        for (int score : scores) {
            System.out.println("Nilai: " + score);
            sum += score;
        }
        System.out.println("Rata-rata: " + ((double)sum / scores.length));

        System.out.println("\n=== 3. Method Bawaan (java.util.Arrays) ===");
        // Arrays.toString() untuk cetak array tanpa loop
        System.out.println("Array sebelum di-sort: " + Arrays.toString(scores));
        
        // Arrays.sort() untuk mengurutkan array (Ascending)
        Arrays.sort(scores);
        System.out.println("Array setelah di-sort : " + Arrays.toString(scores));

        System.out.println("\n=== 4. Mencari Nilai Max & Min ===");
        // Karena sudah di-sort, min ada di index 0, max di index terakhir
        System.out.println("Nilai Minimum: " + scores[0]);
        System.out.println("Nilai Maximum: " + scores[scores.length - 1]);

        System.out.println("\n=== 5. Exception (Error) ===");
        try {
            // Error karena index maksimal adalah 4
            System.out.println(scores[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Anda mengakses indeks yang tidak ada! (" + e.getMessage() + ")");
        }
    }
}
