package com.zzut.service.imp;

import com.zzut.dao.BookDao;
import com.zzut.domain.Book;
import com.zzut.domain.Money;
import com.zzut.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImp implements BookService {

    @Autowired
    private BookDao bookdao;
    @Override
    public List<Book> selectAll() {
        List<Book> books = bookdao.selectAll();

        return books;
    }

    @Override
    public Integer updateBook(Book book) {
        return bookdao.updateBook(book);

    }

    @Override
    public Book selectById(Integer id) {
        return bookdao.selectById(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return bookdao.deleteById(id);
    }

    @Override
    public Integer addOneBook(Book book) {
        return bookdao.addOneBook(book);
    }

    @Override
    public List<Book> selectByName(String Name) {
        return bookdao.selectByName(Name);
    }


}
