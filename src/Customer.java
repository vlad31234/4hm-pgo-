import java.util.ArrayList;

class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Event> reservationList;
    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.reservationList = new ArrayList<>();
    }
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Event> getReservationList() {
        return reservationList;
    }
    public void addReservation(Event event) {
        reservationList.add(event);
    }
    public void displayReservations() {
        System.out.println("Reservations for " + firstName + " " + lastName + ":");
        for (Event event : reservationList) {
            System.out.println(event.toString());
        }
    }
    public void cancelReservation(Event event) {
        reservationList.remove(event);
    }
}