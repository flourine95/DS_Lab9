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
        Course max = null;
        for (Course c : courses) {
            if (c.getType() == Type.PRACTICE) {
                if (max == null) {
                    max = c;
                } else {
                    if (c.isMoreStudents(max)) {
                        max = c;
                    }
                }
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
                if (!list.contains(student)) {
                    list.add(student);
                }
                map.put(year, list);
            }
        }
        return map;
    }

    public Set<Course> filterCourses(Type type) {
        Set<Course> sorted = new TreeSet<>(Comparator.comparingInt(o -> -o.getStudents().size()));
        for (Course course : courses) {
            if (course.getType() == type) {
                sorted.add(course);
            }
        }
        return sorted;
    }


}
