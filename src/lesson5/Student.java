package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private double gpa;

    private boolean status;

    private String [] courses;

    public Student(){

    }
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isActive(){
        return this.status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public boolean hasCourse(String courseId){
        for( String course : this.courses){
            if(courseId.equalsIgnoreCase(course))
                return true;
        }
        return false;
    }
}
