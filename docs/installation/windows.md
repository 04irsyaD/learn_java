# Panduan Instalasi Java di Windows

Panduan ini akan membantu Anda menginstall JDK, Visual Studio Code, dan Git di Windows.

## 1. Download dan Install JDK
1. Download JDK 17 dari [Oracle](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) atau [Adoptium (Eclipse Temurin)](https://adoptium.net/).
2. Jalankan file installer (`.exe`) yang sudah didownload.
3. Ikuti wizard instalasi, biarkan lokasi instalasi secara default.

## 2. Setup `JAVA_HOME`
1. Buka Start Menu, cari "Environment Variables", lalu pilih **Edit the system environment variables**.
2. Klik tombol **Environment Variables...**.
3. Di bagian **System variables**, klik **New**.
4. Isi Variable name dengan `JAVA_HOME`.
5. Isi Variable value dengan lokasi instalasi JDK Anda (contoh: `C:\Program Files\Java\jdk-17`).
6. Klik **OK**.

## 3. Tambahkan Java ke `PATH`
1. Masih di bagian **System variables**, cari variabel bernama `Path`, lalu pilih dan klik **Edit**.
2. Klik **New**, lalu ketik `%JAVA_HOME%\bin`.
3. Klik **OK** pada semua jendela yang terbuka untuk menyimpan pengaturan.

## 4. Install Visual Studio Code
1. Download VS Code dari [situs resminya](https://code.visualstudio.com/).
2. Jalankan installer dan ikuti instruksi. Centang "Add to PATH" saat instalasi.

## 5. Install Extension Pack for Java
1. Buka VS Code.
2. Buka panel Extensions (ikon kotak-kotak di sebelah kiri atau tekan `Ctrl+Shift+X`).
3. Cari "Extension Pack for Java" (oleh Microsoft).
4. Klik **Install**.

## 6. Install Git
1. Download Git for Windows dari [git-scm.com](https://git-scm.com/download/win).
2. Jalankan installer dan ikuti instruksi secara default.

## 7. Verifikasi Instalasi
Buka Command Prompt atau PowerShell, lalu ketik perintah berikut:
```bash
java -version
javac -version
git --version
```
Jika semuanya menampilkan versi yang diinstall, berarti instalasi berhasil!

## 8. Troubleshooting Umum
- **`'java' is not recognized...`**: Pastikan Anda sudah menambahkan Java ke `PATH` dengan benar dan restart terminal Anda.
- **`'javac' is not recognized...`**: Sama seperti di atas, pastikan `PATH` mengarah ke folder `bin` di dalam folder instalasi JDK.
