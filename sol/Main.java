package sol;

import java.util.LinkedList;

/**
 * This class holds our main() function, which
 * is the starting point to run our code
 */
public class Main {

    /**
     * Main method:  program starts running here!
     * @param args Unused
     */
    public static void main(String[] args) {
        // Setup Data
        Faculty profA = new Faculty("Aarti");
        Faculty profB = new Faculty("Byron");
        Faculty profC = new Faculty("Cai");

        Course art = new Course("painting", profA);
        Course ski = new Course("skiing", profB);
        Course drum = new Course("drumming", profB);

        Student pedro = new Student("Pedro");
        pedro.taking.add(art);
        pedro.taking.add(drum);

        System.out.println("Data setup complete");

        // Check Program Behavior

        /* BLOCK 1
        System.out.println("Pedro taking a class from profA: " + pedro.hasCourseFrom(profA));
        System.out.println("Pedro taking a class from profB: " + pedro.hasCourseFrom(profB));
        System.out.println("Pedro took Courses From: " + pedro.tookCoursesFrom());
        */

        /* BLOCK 2
        // the semester finishes
        System.out.println("finish the semester");
        pedro.endSemester();
        System.out.println("Pedro took Courses From: " + pedro.tookCoursesFrom());
        */

        /* BLOCK 3
        // the next semester starts -- new profs teaching!
        System.out.println("change profs for the next semester");

        drum.taughtBy = profC;
        System.out.println("Pedro took Courses From: " + pedro.tookCoursesFrom());
        */
    }
}
