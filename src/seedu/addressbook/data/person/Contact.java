package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * to represent commonalities from Phone, Email and Address
 */

public class Contact {
    
    public final String value;
    public boolean isPrivate;
    
    public Contact(String contact, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        this.value = contact;
    }
    
    public String toString() {
        return value;
    }
    
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
}
