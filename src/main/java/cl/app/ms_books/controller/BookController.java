package cl.app.ms_books.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @GetMapping
    public ResponseEntity<String> getSaludo(){
        return ResponseEntity.ok("Hola desde MS-CTM-BOOKS");
    }
}
