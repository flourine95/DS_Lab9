package Task2;

public class Chapter {
    private String title;
    private int pages;

    public Chapter(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }



    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "\n\tChapter{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
    public boolean isLongestChapter(Chapter that) {
        return this.pages > that.pages;
    }

}
