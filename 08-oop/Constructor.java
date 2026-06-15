class Buku {
    String judul;
    String pengarang;

    // Default constructor
    public Buku() {
        this.judul = "Belum Ada Judul";
        this.pengarang = "Anonim";
    }

    // Parameterized constructor
    public Buku(String judul, String pengarang) {
        this.judul = judul; // this keyword merujuk pada atribut class
        this.pengarang = pengarang;
    }

    // Method cetak info
    public void cetakInfo() {
        System.out.println("Judul: " + judul + " | Pengarang: " + pengarang);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Menggunakan default constructor
        Buku buku1 = new Buku();
        buku1.cetakInfo();

        // Menggunakan parameterized constructor
        Buku buku2 = new Buku("Belajar Java", "Budi Santoso");
        buku2.cetakInfo();
    }
}
