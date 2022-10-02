package com.zzut.controller;

import com.zzut.domain.Book;
import com.zzut.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books" )
public class UserController {
    @Autowired
    private BookService bookService;
    @GetMapping("/{id}")
    public Book selectById(@PathVariable Integer id){
        System.out.println(id);
        Book book = bookService.selectById(id);
        System.out.println(book);
        return book;
    }
    @GetMapping()
    public List<Book> selectAll(){

        List<Book> books = bookService.selectAll();
        System.out.println(books);
        return books;
    }
    @PutMapping()
    public Integer updateByid(@RequestBody Book book){
        return bookService.updateBook(book);
    }
    @DeleteMapping("/{id}")
    public Integer deleteById(@PathVariable Integer id){
        return bookService.deleteById(id);
    }
    @PostMapping()
    public Integer addOneBook(@RequestBody Book book){
        return bookService.addOneBook(book);
    }

}
