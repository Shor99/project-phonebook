import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook {
    private ArrayList<Contact> phoneBook;

    public PhoneBook(ArrayList<Contact> phoneBook) {
        this.phoneBook = new ArrayList<>();
        for (int i = 0 ; i <= phoneBook.size()-1; i++ )
        {
            this.phoneBook.add(new Contact(phoneBook.get(i).getAddress(),phoneBook.get(i).getPhoneNumber(),phoneBook.get(i).getFirstName(),phoneBook.get(i).getLastName()));
        }
    }

    public void addContact(Contact contact){
        if (this.phoneBook.size()==0)
            phoneBook.add(contact);
        for (int i = 0 ; i <= phoneBook.size()-1; i++ )
        {
            if (this.phoneBook.get(i).getAddress().equals(contact.getAddress())&&this.phoneBook.get(i).getPhoneNumber().equals(contact.getPhoneNumber())&&this.phoneBook.get(i).getFirstName().equals(contact.getFirstName())&&this.phoneBook.get(i).getLastName().equals(contact.getLastName())){
                break;
            }
            else {
                phoneBook.add(contact);
            }
        }
    }
    public void updateContact(Contact contact){
        for (int i =0 ; i<= this.phoneBook.size()-1;i++){
            if (this.phoneBook.get(i).getAddress().equals(contact.getAddress())||this.phoneBook.get(i).getPhoneNumber().equals(contact.getPhoneNumber())||this.phoneBook.get(i).getFirstName().equals(contact.getFirstName())||this.phoneBook.get(i).getLastName().equals(contact.getLastName())){
                this.phoneBook.get(i).setPhoneNumber(contact.getPhoneNumber());
                this.phoneBook.get(i).setFirstName(contact.getFirstName());
                this.phoneBook.get(i).setLastName(contact.getLastName());
            }
        }
    }
    public Contact findByPhoneNumber(String phoneNumber){
        for (int i =0 ; i<= this.phoneBook.size()-1;i++) {
            if(this.phoneBook.get(i).getPhoneNumber().equals(phoneNumber))
                return phoneBook.get(i);
        }
        return null;
    }
    public void sortByFirstName()
    {
        this.phoneBook.sort((lName1,lName2)->lName1.getFirstName().compareTo(lName2.getFirstName()));
    }

    public void printContact(PhoneBook phoneBook){
        this.phoneBook.forEach(item -> System.out.println("Name: " + item.getFirstName() + " " + item.getLastName() + "\nPhone Number: " + item.getPhoneNumber() + "\n"));
    }
}
