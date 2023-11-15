package Task2;

public class Magazine extends Publication {
    private String name;

    public Magazine(Chapter chapter, int yearPublishing, String author, double price, String name) {
        super(chapter, yearPublishing, author, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean isSameNameMagazine(String name) {
        return this.name.equals(name);
    }
}
