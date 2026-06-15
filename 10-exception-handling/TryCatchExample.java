public class TryCatchExample {
    public static void main(String[] args) {
        // Contoh try-catch dasar / Basic try-catch
        try {
            int result = 10 / 0; // Membagi dengan 0 akan menyebabkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak dapat membagi dengan nol!");
        }

        System.out.println("---");

        // Contoh multiple catch / Multiple catch blocks
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Error aritmatika.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index array di luar batas!");
        } catch (Exception e) { // Catch exception umum diletakkan terakhir
            System.out.println("Terjadi error yang tidak diketahui.");
        }

        System.out.println("---");

        // Contoh blok finally / Finally block
        try {
            System.out.println("Mencoba membuka koneksi...");
            // Asumsikan proses berhasil
            System.out.println("Koneksi berhasil dibuka.");
        } catch (Exception e) {
            System.out.println("Gagal membuka koneksi.");
        } finally {
            // Blok ini selalu dieksekusi
            System.out.println("Menutup koneksi di blok finally.");
        }
    }
}
