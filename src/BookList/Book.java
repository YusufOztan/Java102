package BookList;

import java.time.LocalDate;

public class Book {
    private String title;
    private int numPage;
    private String author;
    private int pubDate;

    public Book(String title, int numPage, String author, int pubDate) {
        this.title = title;
        this.numPage = numPage;
        this.author = author;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPage() {
        return numPage;
    }

    public String getAuthor() {
        return author;
    }
}
