// Membuat Custom Exception
class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String message) {
        super(message);
    }
}

// Class Rekening
class RekeningBank {
    private double saldo;

    public RekeningBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method menggunakan throws untuk menandakan kemungkinan exception
    public void tarikUang(double jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            // Melempar exception manual
            throw new SaldoTidakCukupException("Saldo Anda tidak mencukupi untuk menarik Rp " + jumlah);
        }
        saldo -= jumlah;
        System.out.println("Berhasil menarik Rp " + jumlah + ". Sisa saldo: Rp " + saldo);
    }
}

public class CustomException {
    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank(500000); // Saldo awal 500rb

        try {
            System.out.println("Saldo saat ini: Rp " + rekening.getSaldo());
            rekening.tarikUang(200000); // Berhasil
            rekening.tarikUang(400000); // Akan melempar SaldoTidakCukupException
        } catch (SaldoTidakCukupException e) {
            System.out.println("Error Transaksi: " + e.getMessage());
        }
    }
}
