package BookSorter;

public class Book implements Comparable<Book>{
    private String bookName;
    private int pageNum;

    private String authorName;

    private int publishYear;


    public Book(String bookName, int pageNum,String authorName,int publishYear) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    @Override
    public int compareTo(Book otherBookName) {
        return this.bookName.compareTo(otherBookName.getBookName());
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Title: " + this.bookName + "\t| Pages: " + this.pageNum + "\t| Author: " + this.authorName + "\t| Publish Year: " + this.publishYear;
    }
}
