package problem1;

public class Book extends LibraryItem {

    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        numberOfPages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + " Pages: " + numberOfPages;
    }
}