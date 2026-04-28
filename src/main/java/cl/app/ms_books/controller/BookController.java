package cl.app.ms_books.controller;

import cl.app.ms_books.model.Book;
import cl.app.ms_books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    BookService bookService;


   /* @GetMapping
    public ResponseEntity<String> getSaludo(){
        return ResponseEntity.ok("Hola desde MS-CTM-BOOKS");
    }*/


    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBook());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }
}