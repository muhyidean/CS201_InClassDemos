package Quizzes.MockExam;

public class Student{

    private String stdName;
    private int stdId;
    private double gpa;
    private Course course;

    public Student(String stdName, int stdId, double gpa, Course course) {
        this.stdName = stdName;
        this.stdId = stdId;
        this.gpa = gpa;
        this.course = course;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student Name: " + this.getStdName() + " " + this.getStdId() + " \nCourse Name: " + this.getCourse().getCourseName() + " " + this.getCourse().getCourseId();
    }

}
