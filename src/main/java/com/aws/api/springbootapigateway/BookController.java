package com.aws.api.springbootapigateway;


import com.aws.api.springbootapigateway.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private List<Book> books=new ArrayList<>();



    @PostMapping
    public Book addBook(@RequestBody Book book){
        books.add(book);
        return book;
    }


    @GetMapping
    public  List<Book> bookList(){
        return books;
    }



}
