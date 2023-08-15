package BookList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books= new ArrayList<>();
        books.add(new Book("Dorian Gray'in Portesi",180,"Oscar Wilde",1890));
        books.add(new Book("İnsan Neyle Yaşar?",112,"Tolstoy",1885));
        books.add(new Book("Ben Kirke",408,"Madeline Miller",2019));
        books.add(new Book("Hayvan Çiftliği",152,"George Orwell",1945));
        books.add(new Book("1984",80,"George Orwell",1949));
        books.add(new Book("Otomatik Portakal",171,"Anthony Burgess",1962));
        books.add(new Book("Altıncı Koğuş",68,"Anton Çehov",1982));
        books.add(new Book("Yeraltından Notlar",160,"Dostoyevski",1864));
        books.add(new Book("Suç ve Ceza",704,"Dostoyevski",1866));

        Map<String, String> booksDict = books.stream().collect(Collectors.toMap(Book::getTitle,Book::getAuthor));
        System.out.println("Kitaplık: " + booksDict);

        List<Book> filteredBooks = books.stream().filter(book -> book.getNumPage() > 100)
                        .collect(Collectors.toList());
        Iterator<Book> iterator = filteredBooks.stream().iterator();
        while(iterator.hasNext()){
            Book next = iterator.next();
            System.out.println(next.getTitle());
        }
    }
}
