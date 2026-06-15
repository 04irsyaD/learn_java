import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Tampilkan Anggota");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Kembalikan Buku");
            System.out.println("7. Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan Pengarang: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(isbn, title, author));
                    break;
                case 2:
                    System.out.print("Masukkan ID Anggota: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    library.addMember(new Member(memberId, name));
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    library.displayMembers();
                    break;
                case 5:
                    System.out.print("Masukkan ID Anggota: ");
                    String borrowerId = scanner.nextLine();
                    System.out.print("Masukkan ISBN Buku: ");
                    String bookIsbn = scanner.nextLine();
                    library.borrowBook(borrowerId, bookIsbn);
                    break;
                case 6:
                    System.out.print("Masukkan ISBN Buku yang dikembalikan: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;
                case 7:
                    library.showHistory();
                    break;
                case 0:
                    running = false;
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
