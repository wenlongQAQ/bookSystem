package com.zzut.domain;

public class Money {
    private String name;
    private Integer money;
    private Integer id;

    @Override
    public String toString() {
        return "Money{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", id=" + id +
                '}';

    }

    public Money() {
    }

    public Money(String name, Integer money, Integer id) {
        this.name = name;
        this.money = money;
        this.id = id;
    }

    public Money(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
