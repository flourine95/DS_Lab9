package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Util {

    public static void printEntrySizeCourses(Faculty faculty) {
        System.out.println("ID \t\tSize");
        for (Course course : faculty.getCourses()) {
            System.out.println(course.getId() + ": " + course.getStudents().size());
        }
    }

    public static List<Student> createRandomStudents(List<Student> students) {
        Collections.shuffle(students);
        List <Student> list = new ArrayList<>();
        for (int i = 0; i < random(students.size()); i++) {
            Student student = students.get(i);
            list.add(student);
        }
        return list;
    }

    public static String createIDStudent() {
        return
                Const.PREFIX_ID_STUDENT +
                random(Const.SCHOOL_YEAR + 1) +
                Const.CAREER_CODES[random(Const.CAREER_CODES.length)] +
                Const.CLASS_CODES[random(Const.CLASS_CODES.length)];
    }

    public static String createNameStudent() {
        return Const.NAMES[random(Const.NAMES.length)] + ((char) random('A', 'Z'));
    }

    public static int createYearStudent() {
        return random(Const.SCHOOL_YEAR - 18 - Const.MAXIMUM_YEARS_RESERVATION, Const.SCHOOL_YEAR - 18);
    }

    public static String createIDCourse() {
        return String.valueOf(random(99999) + 200000);
    }

    public static Type createTypeCourse() {
        return Type.values()[random(Type.values().length)];
    }

    public static String createTitleCourse() {

        return Const.TITLES[random(Const.TITLES.length)];
    }

    public static String createLecturerCourse() {
        return Const.LECTURERS[random(Const.LECTURERS.length)];
    }

    public static int random(int threshold) {
        return new Random().nextInt(threshold);
    }

    public static int random(int from, int to) {
        return new Random().nextInt(from, to);
    }

}
