package sol;

/**
 * Represents a person
 */
public class Person {
    String name;

    /**
     * Create a person
     * @param nm Name of the person
     */
    public Person(String nm) {
        this.name = nm;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
