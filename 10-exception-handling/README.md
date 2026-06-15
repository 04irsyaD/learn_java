# ⚠️ Modul 10: Exception Handling
Exception adalah kondisi tidak normal (error) yang terjadi saat program berjalan (runtime). Exception handling memungkinkan program untuk menangani error tanpa harus terhenti secara tiba-tiba (crash).

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep Exception di Java
- Mampu menggunakan block `try-catch-finally`
- Memahami perbedaan Checked dan Unchecked Exception
- Mampu melempar exception menggunakan `throw` dan `throws`
- Mampu membuat Custom Exception sendiri

## Teori / Penjelasan
- **try-catch**: `try` membungkus kode yang berpotensi error, `catch` menangkap dan menangani error tersebut.
- **finally**: Blok yang akan selalu dieksekusi, tidak peduli apakah terjadi exception atau tidak. Berguna untuk menutup koneksi atau file.
- **Checked Exception**: Exception yang harus ditangani saat compile time (contoh: `FileNotFoundException`).
- **Unchecked Exception**: Exception yang terjadi saat runtime (contoh: `NullPointerException`, `ArithmeticException`).
- **throw**: Digunakan untuk melempar exception secara manual.
- **throws**: Digunakan di deklarasi method untuk menandakan bahwa method tersebut mungkin melempar exception.

## Contoh Program
- `TryCatchExample.java`: Menunjukkan penggunaan try-catch untuk menangani pembagian dengan nol, multiple catch, dan finally.
- `CustomException.java`: Menunjukkan cara membuat exception class sendiri dan penggunaannya (`throw` dan `throws`).

## Latihan
1. Buat program kalkulator dengan penanganan exception untuk pembagian dengan nol.
2. Buat class `SaldoTidakCukupException` untuk menangani kasus penarikan uang di ATM yang melebihi saldo.

## Referensi
- [Oracle Java Docs - Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)
