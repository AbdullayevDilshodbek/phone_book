public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("Book");
        String name = phoneBook.getName();
        System.out.println(name);
        for (int i = 0; i < 10; i++) {
            phoneBook.add("Ali" + i + "" + i, "Aliyev", "+998901234567");
        }
        String contact = phoneBook.first();
        contact = phoneBook.get(3);
        System.out.println(contact);
        System.out.println(phoneBook.toString());
        System.out.println("Find: " + phoneBook.find("99"));
    }
}