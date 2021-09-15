package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollection{

    private String bookName;
    private List<Book> books;

    public BookCollection(String bookName){
        this.bookName=bookName;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String getBookName() {

        return bookName;
    }

    public List<Book> getBooks() {

        return books;
    }

    public int getStars() {
        int average=0;
        for(Book book:books){
            average += book.getStars();
        }
        return average/books.size();
    }
}
