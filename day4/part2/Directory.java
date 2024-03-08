import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueId;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueId) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueId = uniqueId;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nTelephone Number: " + telephoneNumber
                + "\nMobile Number: " + mobileNumber + "\nHead of Family: " + headOfFamily + "\nUnique ID: " + uniqueId + "\n";
    }

    public String getName() {
        return name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setTelephoneNumber(String newTelephoneNumber) {
        telephoneNumber = newTelephoneNumber;
    }

    public void setMobileNumber(String newMobileNumber) {
        mobileNumber = newMobileNumber;
    }
}

public class Directory {
    private ArrayList<Person> directory;

    public Directory() {
        directory = new ArrayList<>();
    }

    public void addEntry(Person person) {
        directory.add(person);
        System.out.println("Entry added successfully.");
    }

    public void editEntry(String uniqueId, String newAddress, String newTelephoneNumber, String newMobileNumber) {
        for (Person person : directory) {
            if (person.getUniqueId().equals(uniqueId)) {
                person.setAddress(newAddress);
                person.setTelephoneNumber(newTelephoneNumber);
                person.setMobileNumber(newMobileNumber);
                System.out.println("Entry edited successfully.");
                return;
            }
        }
        System.out.println("Entry not found with Unique ID: " + uniqueId);
    }

    public void search(String keyword) {
        for (Person person : directory) {
            if (person.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    person.getAddress().toLowerCase().contains(keyword.toLowerCase()) ||
                    person.getTelephoneNumber().toLowerCase().contains(keyword.toLowerCase()) ||
                    person.getMobileNumber().toLowerCase().contains(keyword.toLowerCase()) ||
                    person.getHeadOfFamily().toLowerCase().contains(keyword.toLowerCase()) ||
                    person.getUniqueId().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(person);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter telephone number: ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter head of family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter unique ID: ");
                    String uniqueId = scanner.nextLine();
                    Person newPerson = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueId);
                    directory.addEntry(newPerson);
                    break;
                case 2:
                    System.out.print("\nEnter unique ID of entry to edit: ");
                    String editId = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new telephone number: ");
                    String newTelephoneNumber = scanner.nextLine();
                    System.out.print("Enter new mobile number: ");
                    String newMobileNumber = scanner.nextLine();
                    directory.editEntry(editId, newAddress, newTelephoneNumber, newMobileNumber);
                    break;
                case 3:
                    System.out.print("\nEnter keyword to search: ");
                    String keyword = scanner.nextLine();
                    directory.search(keyword);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
