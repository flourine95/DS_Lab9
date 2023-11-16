package Task2;

import static Task2.Type.MAGAZINE;

public class Magazine extends Publication {
    private String name;


    public Magazine(String title, int pages, int yearPublishing, String author, double price, String name) {
        super(title, pages, yearPublishing, author, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n\tMagazine{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean isSameNameMagazine(String name) {
        return this.name.equals(name);
    }

    @Override
    public Type getType() {
        return MAGAZINE;
    }

    @Override
    public boolean isLongestChapter(Publication other) {
        return false;
    }
}
