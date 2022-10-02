package com.zzut.dao;

import com.zzut.domain.Book;

import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookDao {
    @Results(
            {
                    @Result(property = "bookName",column = "book_name"),
                    @Result(property = "bookMoney",column = "book_money"),
                    @Result(property = "bookDescription",column = "book_description"),
                    @Result(property = "bookClassify",column = "book_classify"),

            }
    )
    @Select("select * from book")
    List<Book> selectAll();

    @Update("update book set book_name=#{bookName},book_money=#{bookMoney},book_description=#{bookDescription},book_classify=#{bookClassify} where id=#{id}")
    Integer updateBook(Book book);
    @Results(
            {
                    @Result(property = "bookName",column = "book_name"),
                    @Result(property = "bookMoney",column = "book_money"),
                    @Result(property = "bookDescription",column = "book_description"),
                    @Result(property = "bookClassify",column = "book_classify"),

            }
    )
    @Select("select * from book where id =#{id}")
    Book selectById(@Param("id") Integer id);
    @Delete("delete from book where id =#{id}")
    Integer deleteById(@Param("id") Integer id);

    @Insert("insert into book(book_name,book_money,book_description,book_classify) values(#{bookName},#{bookMoney},#{bookDescription},#{bookClassify})")
    Integer addOneBook(Book book);
    @Results(
            {
                    @Result(property = "bookName",column = "book_name"),
                    @Result(property = "bookMoney",column = "book_money"),
                    @Result(property = "bookDescription",column = "book_description"),
                    @Result(property = "bookClassify",column = "book_classify"),

            }
    )
    @Select("select * from book where book_name like '%${name}%'")
    List<Book> selectByName(@Param("name") String name);
}
