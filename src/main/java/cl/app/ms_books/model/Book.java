package cl.app.ms_books.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {

    private Long id;
    private String name;
    private String autor;
}