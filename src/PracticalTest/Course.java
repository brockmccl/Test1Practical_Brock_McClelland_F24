package PracticalTest;

public class Course {
    private String name;
    private String code;
    private String startDate;
    private int numberOfStudents;
    private static int count = 0;

    Course(){
        this.name = "default";
        this.code = "default";
        this.startDate = "00/00/0000";
        this.numberOfStudents = 0;
        count += 1;

    }

    Course(String name, String code, String startDate, int numberOfStudents){
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.numberOfStudents = numberOfStudents;
        count += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return this.code + ", " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Course){
           Course otherCourse = (Course)obj;

           return this.code.equals(otherCourse.code);
        }
        else return false;
    }
}
