import java.util.ArrayList;
class ReservationSystem {
    private ArrayList<Event> eventList;
    private ArrayList<Customer> customerList;
    public ReservationSystem() {
        this.eventList = new ArrayList<>();
        this.customerList = new ArrayList<>();
    }
    public void addEvent(Event event) {
        eventList.add(event);
    }
    public void addEvent(String name, double price, String date, String location) {
        eventList.add(new Event(name, price, date, location));
    }
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }
    public void addCustomer(String firstName, String lastName, String email) {
        customerList.add(new Customer(firstName, lastName, email));
    }
    public void makeReservation(Customer customer, Event event) {
        if (eventList.contains(event) && customerList.contains(customer)) {
            customer.addReservation(event);
            event.reserveSeat();
            System.out.println("Reservation successful.");
        } else {
            System.out.println("Event or customer not found.");
        }
    }
    public Event findEvent(String name) {
        for (Event event : eventList) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }
    public Customer findCustomer(String lastName) {
        for (Customer customer : customerList) {
            if (customer.getLastName().equals(lastName)) {
                return customer;
            }
        }
        return null;
    }
    public void changeEventPrice(String name, double newPrice) {
        Event event = findEvent(name);
        if (event != null) {
            event.setPrice(newPrice);
            System.out.println("Event price changed.");
        } else {
            System.out.println("Event not found.");
        }
    }
}