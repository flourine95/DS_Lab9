package Task1;

import java.util.*;

public class Faculty {
    private String name;
    private String address;
    private List<Course> courses;

    public Faculty(String name, String address, List<Course> courses) {
        this.name = name;
        this.address = address;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Course getMaxPracticalCourse() {
        Course max = courses.get(0);
        for (int i = 1; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.isMoreStudents(max)) {
                max = course;
            }
        }
        return max;
    }

    public Map<Integer, List<Student>> groupStudentsByYear() {
        Map<Integer, List<Student>> map = new HashMap<>();
        for (Course cours : courses) {
            List<Student> students = cours.getStudents();
            for (Student student : students) {
                int year = student.getYear();
                List<Student> list = map.containsKey(year) ? map.get(year) : new ArrayList<>();
                list.add(student);
                map.put(year, list);
            }
        }
        return map;
    }

    public Set<Course> filterCourses(String type) {
        Set<Course> sorted = new TreeSet<>(Comparator.comparingInt(o -> -o.getStudents().size()));
        for (Course course : courses) {
            if (course.getType().equals(type)) {
                sorted.add(course);
            }
        }
        return sorted;
    }


}
