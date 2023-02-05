package sol;

import java.util.LinkedList;

/**
 * Represents a student
 */
public class Student extends Person {
    LinkedList<Course> taking;
    LinkedList<Course> completed;

    /**
     * Create a student
     * @param name
     */
    public Student(String name) {
        super(name);
        this.taking = new LinkedList<Course>();
        this.completed = new LinkedList<Course>();
    }

    /**
     * determines whether student is taking a course from given faculty
     * @param f - a Faculty object
     * @return - true if f is teaching a course that student is taking
     */
    public boolean hasCourseFrom(Faculty f) {
        for (Course c : this.taking) {
            if (c.taughtBy.equals(f)) { 
                return true;
            }
        }
        return false;
    }
}

