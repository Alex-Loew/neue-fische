public class Student {

    private String name;
    private int SemesterCount;
    private boolean active;

    public String getName(){
        return this.name;
    }

    public void setName(String expected) {

        this.name = expected;

    }


    public void setSemesterCount(int expected) {
        this.SemesterCount = expected;
    }

    public int getSemesterCount() {
        return this.SemesterCount;
    }

    public void setActive(boolean expected) {
        this.active = expected;
    }

    public boolean getActive() {
        return this.active;
    }
}
