package Task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < Const.STUDENTS_SIZE; i++) {
            Student student = new Student(
                    Util.createIDStudent(),
                    Util.createNameStudent(),
                    Util.createYearStudent()
            );
            students.add(student);
        }
        for (int i = 0; i < Const.COURSES_SIZE; i++) {
            Course course = new Course(
                    Util.createIDCourse(),
                    Util.createTitleCourse(),
                    Util.createTypeCourse(),
                    Util.createRandomStudents(students),
                    Util.createLecturerCourse()
            );
            courses.add(course);
        }
        Faculty faculty = new Faculty("NLU", "Thu Duc", courses);
        Util.printEntrySizeCourses(faculty);
        System.out.println(faculty.getMaxPracticalCourse());
        System.out.println(faculty.groupStudentsByYear());
        System.out.println(faculty.filterCourses(Const.TYPES[1]));
    }
}
