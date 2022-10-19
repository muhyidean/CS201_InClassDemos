package lesson5;

public class StudentImpl {

    public static void main(String[] args) {

        Student std1 = new Student(111,"Mira",3.5);
        std1.setCourses(new String[]{"CS201", "CS203", "MT234"});

        Student std2 = new Student(112,"Yasmeen",3.9);
        std2.setCourses(new String[]{"CS545", "CS201", "MT234"});

        Student std3 = new Student(113, "Zaineh",3.7);
        std3.setCourses(new String[]{"CS545", "CS552", "CS401"});

        Student [] students = {std1,std2,std3};

        System.out.println("========");
        System.out.println( std1.hasCourse("CS201"));
        System.out.println("========");
        printClassRoster(students,"Cs545");


    }

    public static boolean hasCourse(Student std, String courseId){

        for( String course : std.getCourses()){
            if(courseId.equalsIgnoreCase(course))
                return true;
        }
        return false;
    }

    public static void printClassRoster(Student [] students, String courseId){
        for (Student student : students){
            if(student.hasCourse(courseId))
                System.out.println(student.getId() + "\t" + student.getName());
        }
    }
}
