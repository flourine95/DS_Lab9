package Task2;

public abstract class Publication {

    private final Chapter chapter;
    private final int yearPublishing;
    private final String author;
    private final double price;

    public boolean isLongestChapter(Publication publication) {
        return this.chapter.isLongestChapter(publication.getChapter());
    }

    public abstract boolean isSameNameMagazine(String name);

    public enum Type {
        MAGAZINE, REFERENCE_BOOK, PUBLICATION
    }

    public Publication(Chapter chapter, int yearPublishing, String author, double price) {
        this.chapter = chapter;
        this.yearPublishing = yearPublishing;
        this.author = author;
        this.price = price;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public int getYearPublishing() {
        return yearPublishing;
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


    public Type getType() {
        if (this.getClass() == Magazine.class) {
            return Type.MAGAZINE;
        }
        if (this.getClass() == ReferenceBook.class) {
            return Type.REFERENCE_BOOK;
        }
        return Type.PUBLICATION;
    }

    public boolean isMazagine10YearPublishing(Publication publication) {
        return publication.getType() == Type.MAGAZINE && publication.is10YearPublishing();
    }

    public boolean isSameTypeAndAuthor(Publication other) {
        return this.getType() == other.getType() && this.getAuthor().equals(other.getAuthor());
    }

}
