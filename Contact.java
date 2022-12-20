public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact() {

    }

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /*
     * return contact data on the beautify
     */
    @Override
    public String toString() {
        return this.firstName + ", " + this.lastName + ", " + this.phoneNumber;
    }

    /*
     * Check included text from contact fields
     */
    public boolean isContains(String text) {
        if (this.firstName.contains(text) || this.lastName.contains(text) || this.phoneNumber.contains(text))
            return true;
        return false;
    }
}
