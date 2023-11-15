package Task2;

import java.util.List;

public class ReferenceBook extends Publication {
    private String field;
    private List<Chapter> chapters;

    public ReferenceBook() {
    }

    public ReferenceBook(Chapter chapter, int yearPublishing, String author, double price, String field, List<Chapter> chapters) {
        super(chapter, yearPublishing, author, price);
        this.field = field;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "ReferenceBook{" +
                "field='" + field + '\'' +
                ", chapters=" + chapters +
                "} " + super.toString();
    }

    @Override
    public boolean isSameNameMagazine(String name) {
        return false;
    }
}
