# 🏆 Challenge 02: Sistem Login Sederhana

**Deskripsi:**
Buat program simulasi form login yang meminta username dan password dari user, serta membatasi jumlah percobaan login jika terjadi kesalahan.

## Requirements:
1. Simpan username dan password dummy di dalam variabel atau konstanta (contoh: "admin" dan "12345").
2. Minta input username dan password menggunakan `Scanner`.
3. Jika login sukses, tampilkan "Login Berhasil! Selamat Datang".
4. Jika gagal, beritahu sisa percobaan login (maksimal 3 kali percobaan).
5. Jika sudah gagal 3 kali, tampilkan "Akun Terblokir" dan program berhenti.

## Fitur Bonus:
1. **Registrasi User Baru:** Saat program dimulai, tanya apakah ingin Login atau Register.
2. **Enkripsi Password:** Walaupun sederhana, simpan password yang diregister menggunakan enkripsi sederhana (misal base64 atau membalik string).

## Hint / Panduan Langkah:
1. Gunakan loop `while` atau `for` untuk menghitung sisa percobaan login.
2. Gunakan method `.equals()` untuk membandingkan string (username dan password).
3. Gunakan percabangan `if-else` untuk mengecek kecocokan kredensial.
