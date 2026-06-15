// Definisi class / Class definition
class Mahasiswa {
    // Atribut / Attributes
    String nama;
    String nim;
    String jurusan;

    // Method / Behavior
    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        // Membuat object dari class Mahasiswa / Creating object
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Andi";
        mhs1.nim = "123456";
        mhs1.jurusan = "Teknik Informatika";

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Budi";
        mhs2.nim = "654321";
        mhs2.jurusan = "Sistem Informasi";

        // Mengakses atribut dan method / Accessing attributes and methods
        System.out.println("Nama: " + mhs1.nama + ", NIM: " + mhs1.nim);
        mhs1.belajar();

        System.out.println("Nama: " + mhs2.nama + ", NIM: " + mhs2.nim);
        mhs2.belajar();
    }
}
