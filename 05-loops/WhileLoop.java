// Demonstrasi penggunaan While Loop

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("=== 1. While Loop Dasar ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("Nilai i = " + i);
            i++; // Jangan lupa update kondisi agar tidak infinite loop
        }

        System.out.println("\n=== 2. Menghitung Jumlah Digit Angka ===");
        int number = 12345;
        int sum = 0;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10; // Ambil digit terakhir
            sum += digit;          // Tambahkan ke total
            temp /= 10;            // Buang digit terakhir
        }
        System.out.println("Jumlah digit dari " + number + " adalah " + sum);

        System.out.println("\n=== 3. Simulasi Validasi Input ===");
        // Dalam dunia nyata ini menggunakan Scanner
        boolean isValidPassword = false;
        int attempts = 0;
        
        while (!isValidPassword && attempts < 3) {
            attempts++;
            System.out.println("Mencoba login ke-" + attempts + "...");
            // Asumsikan di percobaan ke-3 berhasil
            if (attempts == 3) {
                isValidPassword = true;
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Password salah.");
            }
        }
    }
}
