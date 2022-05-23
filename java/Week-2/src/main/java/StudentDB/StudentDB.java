package StudentDB;

import java.util.Arrays;

public class StudentDB {

    private Student[] studenten;

    public StudentDB(Student[] input) {

        this.studenten = input;
    }

    public Student[] list() {
        return studenten;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studenten=" + Arrays.toString(studenten) +
                '}';
    }
}
