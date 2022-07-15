package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String title;
    private String author;
    private int year;
    private String publisher;
    private int totalPages;
    private long isbn;
}
