import java.util.Date;

public class Booking {
    private String bookingId;
    private Customer customer;
    private Destination destination;
    private Date bookingDate;
    private boolean isCancelled;

    public Booking(String bookingId, Customer customer, Destination destination) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.destination = destination;
        this.bookingDate = new Date(); // Current date
        this.isCancelled = false;
    }

    public String getBookingId() { return bookingId; }
    public Customer getCustomer() { return customer; }
    public Destination getDestination() { return destination; }
    public boolean isCancelled() { return isCancelled; }

    public void cancel() {
        this.isCancelled = true;
    }

    public void printReceipt() {
        System.out.println("==================================");
        System.out.println("        RECEIPT PEMESANAN        ");
        System.out.println("==================================");
        System.out.println("Booking ID  : " + bookingId);
        System.out.println("Tanggal     : " + bookingDate);
        System.out.println("Status      : " + (isCancelled ? "DIBATALKAN" : "BERHASIL"));
        System.out.println("----------------------------------");
        System.out.println("Customer    : " + customer.getName());
        System.out.println("Destinasi   : " + destination.getName() + " (" + destination.getLocation() + ")");
        System.out.println("Total Bayar : Rp" + destination.getPrice());
        System.out.println("==================================");
    }
}
