// Demonstrasi penggunaan berbagai operator di Java

public class Operators {
    public static void main(String[] args) {
        System.out.println("=== 1. Operator Aritmatika ===");
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        // Pembagian integer akan membuang nilai desimal
        System.out.println("a / b (integer) = " + (a / b));
        // Pembagian dengan double untuk hasil desimal
        System.out.println("a / b (double) = " + ((double) a / b));
        System.out.println("a % b (modulus) = " + (a % b));

        System.out.println("\n=== 2. Operator Assignment ===");
        int c = 5;
        c += 3; // Sama dengan c = c + 3
        System.out.println("c += 3 -> " + c);
        c *= 2; // Sama dengan c = c * 2
        System.out.println("c *= 2 -> " + c);

        System.out.println("\n=== 3. Operator Perbandingan ===");
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println("a > b  : " + (a > b));  // true

        System.out.println("\n=== 4. Operator Logika ===");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y)); // AND: false
        System.out.println("x || y : " + (x || y)); // OR: true
        System.out.println("!x     : " + (!x));     // NOT: false

        // Short-circuit evaluation
        int divisor = 0;
        // Tidak terjadi error pembagian dengan nol karena kondisi pertama (b == 5) bernilai false
        boolean result = (b == 5) && ((a / divisor) > 0);
        System.out.println("Short-circuit result: " + result);

        System.out.println("\n=== 5. Operator Unary ===");
        int i = 5;
        System.out.println("Postfix (i++): " + (i++)); // Output: 5, setelah itu i menjadi 6
        System.out.println("Current i: " + i);         // Output: 6
        System.out.println("Prefix (++i): " + (++i));  // i menjadi 7, lalu di-output: 7

        System.out.println("\n=== 6. Operator Ternary ===");
        int number = 10;
        // Jika number modulo 2 == 0, maka "Genap", else "Ganjil"
        String status = (number % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + number + " adalah " + status);
    }
}
