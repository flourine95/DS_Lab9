package Task1;

public class Student {
    private String id;
    private String name;
    private int year;

    public Student(String id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Task1.Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                "}\n";
    }
}
