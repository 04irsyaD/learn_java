import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingManager manager = new BookingManager();
        boolean running = true;

        // Data dummy
        manager.addDestination(new Destination("D01", "Bali", "Indonesia", 1500000));
        manager.addDestination(new Destination("D02", "Tokyo", "Jepang", 7500000));
        
        while (running) {
            System.out.println("\n=== Travel Booking System ===");
            System.out.println("1. Tampilkan Destinasi");
            System.out.println("2. Registrasi Customer");
            System.out.println("3. Tampilkan Customer");
            System.out.println("4. Buat Booking Baru");
            System.out.println("5. Tampilkan Semua Booking");
            System.out.println("6. Batalkan Booking");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.displayDestinations();
                    break;
                case 2:
                    System.out.print("Masukkan ID Customer: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan No HP: ");
                    String phone = scanner.nextLine();
                    manager.addCustomer(new Customer(id, name, phone));
                    break;
                case 3:
                    manager.displayCustomers();
                    break;
                case 4:
                    System.out.print("Masukkan ID Customer: ");
                    String custId = scanner.nextLine();
                    System.out.print("Masukkan ID Destinasi: ");
                    String destId = scanner.nextLine();
                    manager.createBooking(custId, destId);
                    break;
                case 5:
                    manager.displayAllBookings();
                    break;
                case 6:
                    System.out.print("Masukkan ID Booking yang ingin dibatalkan: ");
                    String bookId = scanner.nextLine();
                    manager.cancelBooking(bookId);
                    break;
                case 0:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
