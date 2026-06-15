// Parent class
class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Child class Kucing
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama); // Memanggil constructor parent
    }

    public void meong() {
        System.out.println(nama + " bersuara: Meong!");
    }
}

// Child class Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    public void guk() {
        System.out.println(nama + " bersuara: Guk guk!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Kucing k = new Kucing("Milo");
        k.makan(); // Method dari parent
        k.meong(); // Method sendiri

        Anjing a = new Anjing("Rex");
        a.makan();
        a.guk();
    }
}
