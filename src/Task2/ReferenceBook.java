package Task2;

import java.util.List;

import static Task2.Type.REFERENCE_BOOK;

public class ReferenceBook extends Publication {
    private String field;
    private List<Chapter> chapters;
    public ReferenceBook(String title, int pages, int yearPublishing, String author, double price, String field, List<Chapter> chapters) {
        super(title, pages, yearPublishing, author, price);
        this.field = field;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "\n\tReferenceBook{" +
                "field='" + field + '\'' +
                ", chapters=" + chapters +
                "} " + super.toString();
    }

    @Override
    public boolean isSameNameMagazine(String name) {
        return false;
    }

    @Override
    public Type getType() {
        return REFERENCE_BOOK;
    }

    @Override
    public boolean isLongestChapter(Publication other) {
        ReferenceBook that = (ReferenceBook) other;
        Chapter maxThis = this.chapters.get(0);
        Chapter maxThat = that.chapters.get(0);
        for (int i = 1; i < this.chapters.size(); i++) {
            if (this.chapters.get(i).isLongestChapter(maxThis)) {
                maxThis = this.chapters.get(i);
            }
        }
        for (int i = 1; i < this.chapters.size(); i++) {
            if (this.chapters.get(i).isLongestChapter(maxThat)) {
                maxThat = this.chapters.get(i);
            }
        }
        return maxThis.isLongestChapter(maxThat);
    }
}
