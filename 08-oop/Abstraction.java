// Abstract class
abstract class Bentuk {
    // Abstract method (tanpa body)
    public abstract double hitungLuas();
}

// Interface
interface Drawable {
    void draw();
}

// Concrete class Persegi
class Persegi extends Bentuk implements Drawable {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Persegi");
    }
}

// Concrete class Lingkaran
class Lingkaran extends Bentuk {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Persegi p = new Persegi(4);
        System.out.println("Luas Persegi: " + p.hitungLuas());
        p.draw();

        Lingkaran l = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
    }
}
