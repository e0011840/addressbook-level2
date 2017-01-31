package seedu.addressbook.data.person;

public class PostalCode {
    private String postalcode;
    
    public PostalCode(String postalnumber) {
        this.postalcode = postalnumber;
    }
    
    public String getPostalCode() {
        return this.postalcode;
    }
}
