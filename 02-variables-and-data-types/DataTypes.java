// Demonstrasi tipe data dan type casting di Java

public class DataTypes {
    public static void main(String[] args) {
        // 1. Tipe Data Primitif
        // Bilangan Bulat (Integer types)
        byte minByte = -128;
        short minShort = -32768;
        int maxInt = 2147483647;
        long largeNumber = 9000000000000000000L; // Suffix 'L'

        // Bilangan Desimal (Floating-point types)
        float height = 175.5f; // Suffix 'f'
        double weight = 65.5;  // Default untuk desimal

        // Karakter dan Boolean
        char grade = 'A'; // Menggunakan petik tunggal
        boolean isStudent = true; // true atau false

        // 2. Tipe Data Referensi (String)
        String message = "Hello, ini adalah tipe referensi!"; // Menggunakan petik ganda

        // Print semua tipe data
        System.out.println("--- Tipe Data ---");
        System.out.println("Byte: " + minByte);
        System.out.println("Short: " + minShort);
        System.out.println("Int: " + maxInt);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + height);
        System.out.println("Double: " + weight);
        System.out.println("Char: " + grade);
        System.out.println("Boolean: " + isStudent);
        System.out.println("String: " + message);

        // 3. Type Casting
        System.out.println("\n--- Type Casting ---");
        
        // Implicit (Widening): int -> double
        int ageInt = 20;
        double ageDouble = ageInt; 
        System.out.println("Widening (int ke double): " + ageDouble);

        // Explicit (Narrowing): double -> int
        double priceDouble = 99.99;
        int priceInt = (int) priceDouble; // Kehilangan angka di belakang koma
        System.out.println("Narrowing (double ke int): " + priceInt);

        // 4. Overflow Example
        int maxValue = Integer.MAX_VALUE;
        System.out.println("\n--- Overflow ---");
        System.out.println("Max Int: " + maxValue);
        System.out.println("Max Int + 1: " + (maxValue + 1)); // Menjadi negatif karena batas atas terlampaui
    }
}
