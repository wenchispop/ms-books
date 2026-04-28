package cl.app.ms_books.service;

import cl.app.ms_books.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BookService {

    private HashMap<Long, Book> data = new HashMap<>();

    public BookService(){
        data.put(1L, new Book(1L, "Java", "Autor 1"));
        data.put(2L, new Book(2L, "SpringBoot", "Autor 2"));
    }

    public List<Book> getAllBook(){
        return data.values().stream().toList();
    }

    public Book getBookById(Long id){
        return data.get(id);
    }
}