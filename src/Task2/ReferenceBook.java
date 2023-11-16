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
        return "\n\tReferenceBook{" + super.toString() +
                "field='" + field + '\'' +
                ", chapters=" + chapters +
                "} ";
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
        return findLongestChapter() > ((ReferenceBook) other).findLongestChapter();
    }

    public int findLongestChapter() {
        if (chapters.isEmpty()) {
            return 0;
        }
        int max = 0;
        for (Chapter chapter : chapters) {
            if (chapter.getPages() > max) {
                max = chapter.getPages();
            }
        }
        return max;
    }
}
