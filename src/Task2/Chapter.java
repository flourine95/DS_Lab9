package Task2;

public class Chapter {
    private String title;
    private int pages;

    public Chapter(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    public boolean isLongestChapter(Chapter chapter) {
        return this.pages > chapter.pages;
    }

    public String getTitle() {
        return title;
    }
}
