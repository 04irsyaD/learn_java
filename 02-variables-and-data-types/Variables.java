// Demonstrasi penggunaan variabel di Java

public class Variables {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        String studentName = "Budi Santoso";
        int studentAge = 20;
        
        // Menampilkan nilai variabel
        System.out.println("Nama Mahasiswa: " + studentName);
        System.out.println("Umur: " + studentAge);
        
        // Reassignment (Mengubah nilai variabel)
        studentAge = 21;
        System.out.println("Umur setelah ulang tahun: " + studentAge);
        
        // Konstanta (nilai tidak bisa diubah) menggunakan final
        // Menggunakan UPPER_SNAKE_CASE untuk konstanta
        final double PI = 3.14159;
        System.out.println("Nilai PI: " + PI);
        
        // PI = 3.14; // Error: cannot assign a value to final variable PI

        // Contoh penamaan yang salah (akan error jika di-uncomment):
        // int 1number = 10; // Tidak boleh diawali angka
        // String student name = "Budi"; // Tidak boleh ada spasi
        // int class = 5; // Tidak boleh menggunakan reserved word
    }
}
