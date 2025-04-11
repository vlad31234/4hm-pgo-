class Event {
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats;
    private int availableSeats;
    private double price;
    public Event(String name, double price) {
        this(name, price, null, null);
    }
    public Event(String name, double price, String date) {
        this(name, price, date, null);
    }
    public Event(String name, double price, String date, String location) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.location = location;
        this.maxNumberOfSeats = 100;
        this.availableSeats = maxNumberOfSeats;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }
    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Event: " + name + ", Date: " + date + ", Location: " + location + ", Price: " + price;
    }
    public void reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        } else {
            System.out.println("No available seats for this event.");
        }
    }
}