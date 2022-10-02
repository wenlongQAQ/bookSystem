package com.zzut.domain;

public class Book {
    private String bookName;
    private Integer bookMoney;
    private String bookDescription;
    private String bookClassify;
    private Integer Id;

    public Book() {
    }

    public Book(String bookName, Integer bookMoney, String bookDescription, String bookClassify, Integer id) {
        this.bookName = bookName;
        this.bookMoney = bookMoney;
        this.bookDescription = bookDescription;
        this.bookClassify = bookClassify;
        Id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookMoney=" + bookMoney +
                ", bookDescription='" + bookDescription + '\'' +
                ", bookClassify='" + bookClassify + '\'' +
                ", Id=" + Id +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookMoney() {
        return bookMoney;
    }

    public void setBookMoney(Integer bookMoney) {
        this.bookMoney = bookMoney;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookClassify() {
        return bookClassify;
    }

    public void setBookClassify(String bookClassify) {
        this.bookClassify = bookClassify;
    }
}
