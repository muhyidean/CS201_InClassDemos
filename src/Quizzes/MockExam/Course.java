package Quizzes.MockExam;


class Course{
    private String courseName;
    private String courseId;
    private int creditHours;

    public Course(String courseName, String courseId, int creditHours) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

}
