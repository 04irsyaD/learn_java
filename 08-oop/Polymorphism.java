class Kendaraan {
    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }
}

class Mobil extends Kendaraan {
    // Overriding method parent
    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak di jalan raya.");
    }

    // Overloading method
    public void bergerak(int kecepatan) {
        System.out.println("Mobil bergerak dengan kecepatan " + kecepatan + " km/jam.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        k.bergerak();

        Mobil m = new Mobil();
        m.bergerak(); // Memanggil method overriding
        m.bergerak(80); // Memanggil method overloading

        // Polymorphism dengan referensi parent
        Kendaraan k2 = new Mobil();
        k2.bergerak(); // Akan memanggil implementasi di child (Mobil)
    }
}
