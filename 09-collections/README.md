# 📚 Modul 09: Collections
Collection Framework adalah sekumpulan class dan interface di Java yang digunakan untuk menyimpan dan memanipulasi sekumpulan data. Berbeda dengan Array yang ukurannya tetap, Collection memiliki ukuran dinamis.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep Collection Framework
- Mampu menggunakan `ArrayList`, `HashSet`, dan `HashMap`
- Mengetahui perbedaan dan kapan harus menggunakan masing-masing tipe Collection
- Memahami cara kerja Generics di Java

## Teori / Penjelasan
- **List (ArrayList)**: Menyimpan elemen berurutan, mengizinkan duplikat. Berguna ketika Anda butuh akses cepat menggunakan index.
- **Set (HashSet)**: Tidak mengizinkan elemen duplikat, tidak berurutan. Berguna untuk menyimpan himpunan nilai unik.
- **Map (HashMap)**: Menyimpan data dalam format key-value pair. Setiap key harus unik. Berguna untuk pencarian cepat berdasarkan key.
- **Generics `<T>`**: Menentukan tipe data apa yang boleh masuk ke dalam collection (misalnya `<String>`, `<Integer>`).

## Contoh Program
- `ArrayListExample.java`: Operasi dasar pada ArrayList (add, get, remove, sort).
- `HashSetExample.java`: Operasi dasar pada HashSet dan demonstrasi elemen unik.
- `HashMapExample.java`: Operasi dasar pada HashMap (put, get, remove, iterasi key-value).

## Latihan
1. Buat program daftar belanja menggunakan `ArrayList` yang memungkinkan user menambah, menghapus, dan melihat item.
2. Buat program kontak telepon menggunakan `HashMap` dengan key nama dan value nomor telepon.

## Referensi
- [Oracle Java Docs - Collections](https://docs.oracle.com/javase/tutorial/collections/index.html)
