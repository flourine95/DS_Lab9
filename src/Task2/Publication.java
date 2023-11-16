package Task2;

public abstract class Publication {

    private String title;
    private int pages;
    private int yearPublishing;
    private String author;
    private double price;

    public Publication(String title, int pages, int yearPublishing, String author, double price) {
        this.title = title;
        this.pages = pages;
        this.yearPublishing = yearPublishing;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", yearPublishing=" + yearPublishing +
                ", author='" + author + '\'' +
                ", price=" + price;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean is10YearPublishing() {
        return yearPublishing >= 10;
    }


    public abstract boolean isSameNameMagazine(String name);

    public abstract Type getType();

    public abstract boolean isLongestChapter(Publication other);


    public boolean isMazagine10YearPublishing(Publication publication) {
        return publication.getType() == Type.MAGAZINE && publication.is10YearPublishing();
    }

    public boolean isSameTypeAndAuthor(Publication other) {
        return this.getType() == other.getType() && this.getAuthor().equals(other.getAuthor());
    }

}
