# Getting Started

Selamat datang di Java Learning Repository! Panduan ini akan membantu Anda memulai langkah pertama menggunakan repository ini.

## 1. Clone Repository
Buka terminal (atau Git Bash/Command Prompt di Windows), arahkan ke folder di mana Anda ingin menyimpan repository ini, lalu jalankan:
```bash
git clone https://github.com/username/learn_java.git
```
*(Ganti URL sesuai dengan URL repository ini).*

## 2. Membuka Project di VS Code
Setelah proses clone selesai, masuk ke folder repository dan buka menggunakan VS Code:
```bash
cd learn_java
code .
```

## 3. Navigasi Struktur Folder
Repository ini diatur berdasarkan nomor modul. Anda bisa melihatnya di bagian Explorer di VS Code.
- `docs/`: Berisi dokumentasi dan panduan.
- `01-hello-world/`, `02-variables-and-data-types/`, dst: Folder materi pembelajaran.
- `exercises/`, `challenges/`, `projects/`: Folder untuk berlatih.

## 4. Compile dan Run Program Pertama
Mari coba jalankan program pertama Anda:
1. Buka terminal di dalam VS Code dengan menekan `` Ctrl + ` ``.
2. Masuk ke folder modul pertama:
   ```bash
   cd 01-hello-world
   ```
3. Compile file Java:
   ```bash
   javac HelloWorld.java
   ```
4. Jalankan program yang sudah dicompile:
   ```bash
   java HelloWorld
   ```
Anda akan melihat output `Hello, World!` di terminal.

## 5. Tips Belajar yang Efektif
- **Ikuti Urutan**: Mulailah dari Modul 01 dan ikuti urutan modul secara berurutan.
- **Baca Teori**: Baca penjelasan di setiap file `README.md` dalam modul.
- **Coba Sendiri**: Jangan hanya membaca kode, ketik ulang dan cobalah ubah kodenya untuk melihat apa yang terjadi.
- **Kerjakan Latihan**: Setiap modul dilengkapi dengan soal latihan. Kerjakan latihan tersebut sebelum pindah ke modul berikutnya.

## 6. Menggunakan Terminal di VS Code
- Gunakan perintah `ls` (Mac/Linux) atau `dir` (Windows) untuk melihat daftar file di direktori saat ini.
- Gunakan `cd nama_folder` untuk masuk ke folder tertentu.
- Gunakan `cd ..` untuk kembali ke folder sebelumnya.
