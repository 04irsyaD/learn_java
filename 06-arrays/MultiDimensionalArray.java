// Demonstrasi Array Multi Dimensi (2D)

public class MultiDimensionalArray {
    public static void main(String[] args) {
        System.out.println("=== 1. Deklarasi Array 2D (Matriks) ===");
        // Matriks 3 baris, 4 kolom
        int[][] matrixA = new int[3][4]; 
        
        // Inisialisasi matriks langsung
        int[][] numbers = {
            {1, 2, 3}, // Baris 0
            {4, 5, 6}, // Baris 1
            {7, 8, 9}  // Baris 2
        };

        // Mengakses elemen (Baris 1, Kolom 2 -> nilai 6)
        System.out.println("Elemen di baris 1, kolom 2: " + numbers[1][2]);

        System.out.println("\n=== 2. Iterasi Matriks dengan Nested Loop ===");
        // numbers.length mengembalikan jumlah baris
        for (int i = 0; i < numbers.length; i++) {
            // numbers[i].length mengembalikan jumlah kolom di baris ke-i
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Pindah baris
        }

        System.out.println("\n=== 3. Penjumlahan 2 Matriks ===");
        int[][] mat1 = {
            {1, 2},
            {3, 4}
        };
        int[][] mat2 = {
            {5, 6},
            {7, 8}
        };
        // Menyiapkan matriks hasil dengan ukuran yang sama
        int[][] result = new int[2][2];

        System.out.println("Matriks Hasil Penjumlahan:");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
