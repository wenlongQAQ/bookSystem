package com.zzut.service;

import com.zzut.domain.Book;
import com.zzut.domain.Money;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public interface BookService {
    List<Book> selectAll();
    Integer updateBook(Book book);
    Book selectById(Integer id);

    Integer deleteById(@Param("id") Integer id);
    Integer addOneBook(Book book);
}
