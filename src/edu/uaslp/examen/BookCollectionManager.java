package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {
    private List<BookCollection> collections;
    private String bookName;
    private String name;


     public BookCollectionManager(){
         collections = new ArrayList<>();
     }

    public BookCollection createCollection(String bookName) {
        BookCollection bookCollection=new BookCollection(bookName);
        collections.add(bookCollection);
        return bookCollection;
    }

    public void addBookToCollection(String collectionName, Book book) {
         BookCollection bookCollection= getCollectionByName(collectionName);
       if(bookCollection == null){
           bookCollection=createCollection(collectionName);
       }
       bookCollection.addBook(book);
    }

    public BookCollection getCollectionByName(String bookName) {
       for(BookCollection bookCollection:collections){
           if(bookCollection.getBookName().equals(name)){
               return bookCollection;
           }
       }
          return null;
    }

    public List<String> getCollectionNames() {
         List<String> collectionNames =new ArrayList<>();
         for (BookCollection bookCollection:collections){
             collectionNames.add(bookCollection.getBookName());
         }
         return collectionNames;
    }

    public void deleteCollectionByName(String bookName){
        for(BookCollection bookCollection:collections){
            if(bookCollection.getBookName().equals(name)){
                collections.remove(bookCollection);
                return;
            }
        }
    }
}
