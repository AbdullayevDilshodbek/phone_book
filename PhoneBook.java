public class PhoneBook {
    private String name;
    private int length = 5;
    private Contact[] contacts = new Contact[this.length];
    private int currentIndex = 0;

    /*
     * Create phoneBook
     */
    public PhoneBook(String name) {
        this.name = name;
    }

    /*
     * Get phoneBook name
     */
    public String getName() {
        return this.name;
    }

    /*
     * Add new contact
     */
    public void add(String firstName, String lastName, String phoneNumber) {
        if (this.currentIndex + 1 == this.length) {
            this.length += 5;
            Contact newContacts[] = new Contact[this.length];
            for (int i = 0; i < this.currentIndex; i++) {
                newContacts[i] = contacts[i];
            }
            this.contacts = newContacts;
        }
        this.contacts[this.currentIndex] = new Contact(firstName, lastName, phoneNumber);
        this.currentIndex++;
    }

    /*
     * Find first contact
     */
    public String first() {
        Contact contact = this.contacts[0];
        if (contact == null)
            return "Contact is empty";
        return contact.toString();
    }

    /*
     * Show contact on any index
     */
    public String get(int index) {
        if (index < 1)
            return "Index is more then 0";
        Contact contact = this.contacts[index - 1];
        if (contact == null)
            return index + "-contact is not found";
        return contact.toString();
    }

    /*
     * Show contacts list
     */
    public String toString() {
        String text = "( ";
        Contact contact = new Contact();
        for (int i = 0; i < this.currentIndex; i++) {
            contact = this.contacts[i];
            text += contact.toString() + ", ";
        }
        return text + ")";
    }

    /*
     * Search contacts by part of any filed
     */
    public String find(String text) {
        for (Contact contact : contacts) {
            if (contact.isContains(text))
                return contact.toString();
        }
        return "Not found";
    }
}
