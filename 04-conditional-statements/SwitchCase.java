// Demonstrasi penggunaan Switch Case di Java

public class SwitchCase {
    public static void main(String[] args) {
        // 1. Switch dengan tipe int (Nama hari)
        int dayOfWeek = 3;
        String dayName;

        System.out.println("--- Hari ---");
        switch (dayOfWeek) {
            case 1:
                dayName = "Senin";
                break;
            case 2:
                dayName = "Selasa";
                break;
            case 3:
                dayName = "Rabu";
                break; // Break mencegah program mengeksekusi case selanjutnya
            case 4:
                dayName = "Kamis";
                break;
            case 5:
                dayName = "Jumat";
                break;
            case 6:
                dayName = "Sabtu";
                break;
            case 7:
                dayName = "Minggu";
                break;
            default: // Dijalankan jika tidak ada case yang cocok
                dayName = "Hari tidak valid";
        }
        System.out.println("Hari ke-" + dayOfWeek + " adalah " + dayName);

        // 2. Switch dengan tipe String
        String month = "Feb";
        int daysInMonth = 0;

        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                daysInMonth = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                daysInMonth = 30;
                break;
            case "Feb":
                daysInMonth = 28; // Abaikan tahun kabisat untuk penyederhanaan
                break;
            default:
                System.out.println("Bulan tidak valid");
        }
        
        if (daysInMonth != 0) {
            System.out.println("Jumlah hari di bulan " + month + " adalah " + daysInMonth);
        }

        // 3. Fall-through Example (Tanpa Break)
        System.out.println("\n--- Fall-through ---");
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("Satu");
                // Tidak ada break, jadi akan mengeksekusi case 2 dan 3
            case 2:
                System.out.println("Dua");
            case 3:
                System.out.println("Tiga");
                break;
        }
    }
}
