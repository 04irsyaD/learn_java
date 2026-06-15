// Demonstrasi penggunaan If, Else, dan Else If

public class IfElse {
    public static void main(String[] args) {
        int age = 18;

        // 1. If sederhana
        if (age >= 17) {
            System.out.println("Anda sudah bisa membuat KTP.");
        }

        // 2. If-else
        int score = 65;
        if (score >= 75) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus, silahkan ikut remidi.");
        }

        // 3. Else-if ladder (Grade nilai A-E)
        int finalGrade = 82;
        System.out.print("Grade Anda: ");
        if (finalGrade >= 90) {
            System.out.println("A");
        } else if (finalGrade >= 80) {
            System.out.println("B");
        } else if (finalGrade >= 70) {
            System.out.println("C");
        } else if (finalGrade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        // 4. Nested if (If bersarang)
        boolean hasTicket = true;
        boolean isVip = false;

        System.out.println("\n--- Cek Akses Konser ---");
        if (hasTicket) {
            System.out.println("Tiket valid. Anda boleh masuk.");
            if (isVip) {
                System.out.println("Akses jalur VIP.");
            } else {
                System.out.println("Akses jalur Reguler.");
            }
        } else {
            System.out.println("Anda tidak boleh masuk, silahkan beli tiket.");
        }
    }
}
