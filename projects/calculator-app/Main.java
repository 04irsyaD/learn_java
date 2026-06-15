import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean isRunning = true;

        System.out.println("=== Selamat Datang di Aplikasi Kalkulator ===");

        while (isRunning) {
            System.out.println("\nPilih Operasi:");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Pangkat (^)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Terima kasih telah menggunakan Kalkulator.");
                isRunning = false;
                continue;
            }

            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();

            try {
                double result = 0;
                switch (choice) {
                    case 1:
                        result = calc.add(num1, num2);
                        System.out.println("Hasil: " + result);
                        break;
                    case 2:
                        result = calc.subtract(num1, num2);
                        System.out.println("Hasil: " + result);
                        break;
                    case 3:
                        result = calc.multiply(num1, num2);
                        System.out.println("Hasil: " + result);
                        break;
                    case 4:
                        result = calc.divide(num1, num2);
                        System.out.println("Hasil: " + result);
                        break;
                    case 5:
                        result = calc.modulo(num1, num2);
                        System.out.println("Hasil: " + result);
                        break;
                    case 6:
                        result = calc.power(num1, num2);
                        System.out.println("Hasil: " + result);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
