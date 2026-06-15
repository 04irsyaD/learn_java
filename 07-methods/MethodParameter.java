public class MethodParameter {
    // Global/class scope variable
    static String className = "Java Learning";

    public static void main(String[] args) {
        // Method overloading calls
        printData("Budi");
        printData("Siti", 20);
        printData("Andi", 22, "Jakarta");

        // Recursion example: factorial
        int num = 5;
        System.out.println("Faktorial dari " + num + " adalah: " + factorial(num));
        
        // Demonstrating variable scope
        demonstrateScope();
    }

    // Overloading 1: One parameter
    public static void printData(String name) {
        System.out.println("Nama: " + name);
    }

    // Overloading 2: Two parameters
    public static void printData(String name, int age) {
        System.out.println("Nama: " + name + ", Umur: " + age);
    }

    // Overloading 3: Three parameters
    public static void printData(String name, int age, String city) {
        System.out.println("Nama: " + name + ", Umur: " + age + ", Kota: " + city);
    }

    // Rekursi / Recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Scope variabel / Variable scope
    public static void demonstrateScope() {
        // Local variable
        String localName = "Local Scope";
        System.out.println("Variabel global: " + className);
        System.out.println("Variabel lokal: " + localName);
    }
}
