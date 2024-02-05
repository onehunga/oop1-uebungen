package j.michels.uebungen.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Contact {
    private final String name;
    private final List<String> phoneNumbers;

    public Contact(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(String number) {
        this.phoneNumbers.add(number);
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    @Override
    public boolean equals(Object o) {
        return this.name.equals(((Contact) o).name);
    }

}
