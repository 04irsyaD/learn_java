// Demonstrasi penggunaan Do-While Loop

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("=== 1. Do-While Dasar ===");
        int count = 1;
        do {
            System.out.println("Hitungan: " + count);
            count++;
        } while (count <= 3);

        System.out.println("\n=== 2. Perbedaan dengan While ===");
        // Kondisi awalnya false, while tidak akan mengeksekusi apapun
        int x = 10;
        while (x < 5) {
            System.out.println("While: Blok ini tidak akan pernah dijalankan");
        }

        // Do-while akan mengeksekusi minimal 1 kali
        do {
            System.out.println("Do-While: Dieksekusi 1 kali walaupun kondisi (10 < 5) itu false");
        } while (x < 5);

        System.out.println("\n=== 3. Simulasi Menu Program ===");
        int menuChoice = 1;
        // Asumsi user selalu memilih 3 untuk keluar pada percobaan ketiga
        int loopSim = 0; 
        
        do {
            loopSim++;
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");
            
            // Simulasi pilihan input user
            if (loopSim == 1) menuChoice = 2;
            else if (loopSim == 2) menuChoice = 1;
            else menuChoice = 3;
            
            System.out.println("Pilihan Anda: " + menuChoice);
            
            switch (menuChoice) {
                case 1: System.out.println("> Membuka form tambah data..."); break;
                case 2: System.out.println("> Menampilkan tabel data..."); break;
                case 3: System.out.println("> Keluar dari program. Terima kasih!"); break;
                default: System.out.println("> Pilihan tidak valid!");
            }
        } while (menuChoice != 3);
    }
}
