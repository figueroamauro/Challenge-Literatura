package ar.com.old.literatura.services;

import ar.com.old.literatura.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final List<Book> list;

    public BookService() {
        this.list = new ArrayList<>();
    }

    public void add(Book book) {
        this.list.add(book);
    }

    public void remove(Book book) {
        this.list.remove(book);
    }

    public List<Book> getList() {
        return this.list;
    }
}
