package seedu.addressbook.data.person;

import seedu.addressbook.data.tag.Tag;

/**
 * A record of ADD/DEL Persons
 *
 */
public class Tagging {

    private static final String ADD_NOTATION = "+";
    private static final String DEL_NOTATION = "-";
    private static final String BOX_PREFIX = "[";
    private static final String BOX_SUFFIX = "]";
    private static final String DELIMITER = " ";

    private Person person;
    private Tag tag;
    private boolean isAdd_NOTATION;

    public Tagging(Person person, Tag tag, boolean isAdd) {
        this.person = person;
        this.tag = tag;
        this.isAdd_NOTATION = isAdd;
    }

    public String getPerson() {
        return person.toString();
    }

    public String getTag() {
        return tag.toString();
    }

    public String toString() {

        if (isAdd_NOTATION) {
            return ADD_NOTATION + DELIMITER + this.getPerson() + DELIMITER + BOX_PREFIX + this.getTag() + BOX_SUFFIX;
        } else {
            return DEL_NOTATION + DELIMITER + this.getPerson() + DELIMITER + BOX_PREFIX + this.getTag() + BOX_SUFFIX;
        }
    }
}
