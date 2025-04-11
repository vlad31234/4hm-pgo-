import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();
        Event concert = new Event("Symphony Concert", 120.0);
        Event theater = new Event("Hamlet", 85.0);
        system.addEvent(concert);
        system.addEvent(theater);
        Customer customer1 = new Customer("John", "Smith", "john@example.com");
        Customer customer2 = new Customer("Anna", "Johnson", "anna@example.com");
        system.addCustomer(customer1);
        system.addCustomer(customer2);
        system.makeReservation(customer1, concert);
        system.makeReservation(customer2, theater);
        customer1.displayReservations();
        customer2.displayReservations();
    }
}