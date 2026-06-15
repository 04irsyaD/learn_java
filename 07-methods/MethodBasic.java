public class MethodBasic {
    public static void main(String[] args) {
        // Memanggil method tanpa parameter / calling method without parameter
        sayHello();
        
        // Memanggil method dengan parameter / calling method with parameter
        greetUser("Alice");
        
        // Memanggil method yang mengembalikan nilai / calling method returning a value
        int sum = calculateSum(5, 10);
        System.out.println("Hasil penjumlahan: " + sum);
    }

    // Method void tanpa parameter
    public static void sayHello() {
        System.out.println("Hello, welcome to Java Programming!");
    }

    // Method void dengan parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method dengan return value
    public static int calculateSum(int a, int b) {
        return a + b;
    }
}
