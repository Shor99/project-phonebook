import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("berlin,germany","34523425", "aaa", "bbb");
        Contact contact2 = new Contact("budapest,hungary","345345", "ccc", "aaa");
        Contact contact3 = new Contact("bucharest,romania","435435345", "ddd", "ccc");
        Contact contact4 = new Contact("tel aviv,israel","0545454545", "fff", "fff");
        ArrayList<Contact> arrayList = new ArrayList<>();
        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        PhoneBook phoneBook = new PhoneBook(arrayList);
        phoneBook.printContact(phoneBook);
        phoneBook.sortByFirstName();
        phoneBook.printContact(phoneBook);
        Contact contact5 = new Contact("berlin,germany","34523425", "bbb", "bbb");
        phoneBook.updateContact(contact5);
        phoneBook.printContact(phoneBook);
    }
}