class Person {
    // Private fields (Encapsulation)
    private String nama;
    private int umur;

    // Public getter untuk nama
    public String getNama() {
        return nama;
    }

    // Public setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Public getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Public setter untuk umur dengan validasi
    public void setUmur(int umur) {
        if (umur < 0) {
            System.out.println("Umur tidak boleh negatif!");
        } else {
            this.umur = umur;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setNama("Citra");
        
        // Validasi encapsulation
        p.setUmur(-5); // Akan menampilkan error
        p.setUmur(20);

        System.out.println("Nama: " + p.getNama());
        System.out.println("Umur: " + p.getUmur());
    }
}
