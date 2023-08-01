package BookSorter;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> booksByName = new TreeSet<>();

        booksByName.add(new Book("Dorian Gray'in Portesi",180,"Oscar Wilde",1890));
        booksByName.add(new Book("İnsan Neyle Yaşar?",112,"Tolstoy",1885));
        booksByName.add(new Book("Ben Kirke",408,"Madeline Miller",2019));
        booksByName.add(new Book("Hayvan Çiftliği",152,"George Orwell",1945));
        booksByName.add(new Book("Satranç",80,"Stefan Zweig",1944));

        System.out.println("Books sorted by name:");
        for (Book book : booksByName) {
            System.out.println(book.toString());
        }

        Set<Book> booksByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }
        });

        booksByPageCount.add(new Book("Dorian Gray'in Portesi",180,"Oscar Wilde",1890));
        booksByPageCount.add(new Book("İnsan Neyle Yaşar?",112,"Tolstoy",1885));
        booksByPageCount.add(new Book("Ben Kirke",408,"Madeline Miller",2019));
        booksByPageCount.add(new Book("Hayvan Çiftliği",152,"George Orwell",1945));
        booksByPageCount.add(new Book("Satranç",80,"Stefan Zweig",1944));

        System.out.println("\nBooks sorted by page count:");
        for (Book book : booksByPageCount) {
            System.out.println(book.toString());
        }

    }
}
