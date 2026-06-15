import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<String> borrowingHistory;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        borrowingHistory = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku ditambahkan.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Anggota ditambahkan.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku di perpustakaan.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("Tidak ada anggota.");
            return;
        }
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMember(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void borrowBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null) {
            System.out.println("Anggota tidak ditemukan.");
            return;
        }
        if (book == null) {
            System.out.println("Buku tidak ditemukan.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Buku sedang dipinjam.");
            return;
        }

        book.setAvailable(false);
        String history = "Peminjaman: " + member.getName() + " meminjam " + book.getTitle();
        borrowingHistory.add(history);
        System.out.println(history);
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            System.out.println("Buku tidak ditemukan.");
            return;
        }
        if (book.isAvailable()) {
            System.out.println("Buku ini tidak sedang dipinjam.");
            return;
        }

        book.setAvailable(true);
        String history = "Pengembalian: " + book.getTitle() + " telah dikembalikan.";
        borrowingHistory.add(history);
        System.out.println(history);
    }

    public void showHistory() {
        if (borrowingHistory.isEmpty()) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }
        for (String record : borrowingHistory) {
            System.out.println(record);
        }
    }
}
