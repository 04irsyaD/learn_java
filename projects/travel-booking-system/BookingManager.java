import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Destination> destinations;
    private List<Customer> customers;
    private List<Booking> bookings;
    private int bookingCounter = 1;

    public BookingManager() {
        destinations = new ArrayList<>();
        customers = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addDestination(Destination d) {
        destinations.add(d);
        System.out.println("Destinasi ditambahkan.");
    }

    public void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Customer ditambahkan.");
    }

    public void displayDestinations() {
        if (destinations.isEmpty()) {
            System.out.println("Tidak ada destinasi.");
            return;
        }
        for (Destination d : destinations) {
            System.out.println(d);
        }
    }

    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("Tidak ada customer.");
            return;
        }
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public Customer findCustomer(String id) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(id)) return c;
        }
        return null;
    }

    public Destination findDestination(String id) {
        for (Destination d : destinations) {
            if (d.getId().equals(id)) return d;
        }
        return null;
    }

    public void createBooking(String customerId, String destinationId) {
        Customer c = findCustomer(customerId);
        Destination d = findDestination(destinationId);

        if (c == null) {
            System.out.println("Customer tidak ditemukan.");
            return;
        }
        if (d == null) {
            System.out.println("Destinasi tidak ditemukan.");
            return;
        }

        String bookingId = "BKG" + String.format("%03d", bookingCounter++);
        Booking booking = new Booking(bookingId, c, d);
        bookings.add(booking);
        System.out.println("Booking berhasil dibuat!");
        booking.printReceipt();
    }

    public void cancelBooking(String bookingId) {
        for (Booking b : bookings) {
            if (b.getBookingId().equals(bookingId)) {
                if (!b.isCancelled()) {
                    b.cancel();
                    System.out.println("Booking " + bookingId + " telah dibatalkan.");
                } else {
                    System.out.println("Booking sudah dalam status dibatalkan.");
                }
                return;
            }
        }
        System.out.println("Booking ID tidak ditemukan.");
    }

    public void displayAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("Tidak ada data booking.");
            return;
        }
        for (Booking b : bookings) {
            System.out.println(b.getBookingId() + " | Customer: " + b.getCustomer().getName() + " | Destinasi: " + b.getDestination().getName() + " | Status: " + (b.isCancelled() ? "Batal" : "Aktif"));
        }
    }
}
