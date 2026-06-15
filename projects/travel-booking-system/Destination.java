public class Destination {
    private String id;
    private String name;
    private String location;
    private double price;

    public Destination(String id, String name, String location, double price) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "ID: " + id + " | Tujuan: " + name + " (" + location + ") | Harga: Rp" + price;
    }
}
