import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistem Manajemen Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Cari Mahasiswa (NIM)");
            System.out.println("4. Update Data Mahasiswa");
            System.out.println("5. Hapus Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String major = scanner.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double gpa = scanner.nextDouble();
                    
                    manager.addStudent(new Student(nim, name, major, gpa));
                    break;
                case 2:
                    manager.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String searchNim = scanner.nextLine();
                    Student found = manager.searchStudentByNim(searchNim);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan NIM yang akan diupdate: ");
                    String updateNim = scanner.nextLine();
                    System.out.print("Masukkan Nama baru: ");
                    String newName = scanner.nextLine();
                    System.out.print("Masukkan Jurusan baru: ");
                    String newMajor = scanner.nextLine();
                    System.out.print("Masukkan IPK baru: ");
                    double newGpa = scanner.nextDouble();
                    
                    if (manager.updateStudent(updateNim, newName, newMajor, newGpa)) {
                        System.out.println("Data berhasil diupdate.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    String deleteNim = scanner.nextLine();
                    if (manager.deleteStudent(deleteNim)) {
                        System.out.println("Mahasiswa berhasil dihapus.");
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 0:
                    running = false;
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
