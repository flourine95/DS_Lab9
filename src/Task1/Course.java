package Task1;

import java.util.List;

public class Course {
    private String id;
    private String title;
    private String type;
    private List<Student> students;
    private String lecturer;

    public Course(String id, String title, String type, List<Student> students, String lecturer) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.students = students;
        this.lecturer = lecturer;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean isMoreStudents(Course other){
        return this.students.size() > other.students.size();
    }

    @Override
    public String toString() {
        return "Task1.Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", lecturer='" + lecturer + '\'' +
                ", students=" + students +
                '}';
    }
}
