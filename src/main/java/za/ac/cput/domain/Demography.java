package za.ac.cput.domain;

public class Demography {

    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String emailAddress;

    public Demography(String firstName, String lastName, String address, String contactNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Optional: Implement setter methods if necessary

    @Override
    public String toString() {
        return "Demography{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
    Demography demography = new Demography("John", "Doe", "123 Main St", "1234567890", "john.doe@example.com");
}
