package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollectionManager {
    private ArrayList<BookCollection> collections;
    private String bookName;
    private String name;


    public BookCollection createCollection(String bookName) {
        this.bookName=bookName;
        collections = new ArrayList<>();
    }

    public void addBookToCollection(String name, Book book) {
       this.name=name;
       book.getAuthor();
       book.getIsbn();
       book.getTitle();
       book.getStars();
       collections.add(book);
    }

    public BookCollection getCollectionByName(String bookName) {
       this.bookName=bookName;

    }

    public ArrayList<BookCollection> getCollectionNames() {

       return collections;

    }
}
