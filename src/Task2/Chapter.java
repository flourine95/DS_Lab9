package Task2;

public class Chapter {
    private String title;
    private int pages;

    public boolean isLongestChapter(Chapter chapter) {
        return this.pages > chapter.pages;
    }

    public String getTitle() {
        return title;
    }
}
