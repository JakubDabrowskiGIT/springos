package pl.kurs2.springos.controller;


import pl.kurs2.springos.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Zosia","Zosia samosia",12.14));
        books.add(new Book("ala","ktoś",12.14));
        books.add(new Book("edek","edek",12.14));
        books.add(new Book("kur","kur",12.14));
        return books;

    }
}