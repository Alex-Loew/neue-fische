package model;

public class Student {

    private String name;
    private int semesterCount;
    private boolean active;

    public String getName(){
        return this.name;
    }

    public void setName(String expected) {

        this.name = expected;

    }


    public void setSemesterCount(int expected) {
        this.semesterCount = expected;
    }

    public int getSemesterCount() {
        return this.semesterCount;
    }

    public void setActive(boolean expected) {
        this.active = expected;
    }

    public boolean getActive() {
        return this.active;
    }

    public Student(String name, int semesterCount, boolean active) {
        this.name = name;
        this.semesterCount = semesterCount;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", SemesterCount=" + semesterCount +
                ", active=" + active +
                '}';
    }

}
