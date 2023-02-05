package sol;

/**
 * Represents a Course
 */
public class Course {
    String nameNum;
    Faculty taughtBy;

    /**
     * Create a student
     * @param nameNum Course name
     * @param prof    Faculty member who is teaching
     */
    public Course(String nameNum, Faculty prof) {
        this.nameNum = nameNum;
        this.taughtBy = prof;
    }

}
