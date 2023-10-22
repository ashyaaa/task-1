class Address {
    public String street;
    public String city;
    public String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}

class Person {
    private String name;
    private Address address; // Aggregation

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.street + ", " + address.city + ", " + address.state);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Address johnsAddress = new Address("123 Main St", "New York", "NY");
        Person john = new Person("John", johnsAddress);

        john.displayInfo();
        System.out.println("Hello, World!");
    }
}
