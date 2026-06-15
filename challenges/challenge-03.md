# 🏆 Challenge 03: Aplikasi Todo List Console

**Deskripsi:**
Buat aplikasi untuk mencatat tugas-tugas (Todo List) yang harus dikerjakan secara interaktif di terminal.

## Requirements:
1. User dapat melakukan CRUD (Create, Read, Update, Delete) pada daftar todo.
2. Setiap todo memiliki status (Selesai / Belum Selesai).
3. Gunakan array atau `ArrayList` untuk menyimpan daftar todo.

## Fitur Bonus:
1. **Simpan ke File:** Simpan daftar todo ke file `todo.txt` sehingga data tidak hilang setelah program ditutup.
2. **Filter Status:** Tambahkan menu untuk melihat "Hanya Todo Selesai" atau "Hanya Todo Belum Selesai".

## Hint / Panduan Langkah:
1. Buat class model `Todo` dengan atribut `String task` dan `boolean isDone`.
2. Gunakan `ArrayList<Todo>` untuk menampung data.
3. Implementasikan infinite loop menu utama (Tambah, Hapus, Ubah Status, Lihat Semua, Keluar).
4. Gunakan package `java.io` (FileWriter/FileReader) jika ingin mengimplementasikan fitur bonus menyimpan ke file.
