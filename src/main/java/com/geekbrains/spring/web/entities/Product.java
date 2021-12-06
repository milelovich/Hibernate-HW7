package com.geekbrains.spring.web.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // говорим, что Product явл сущностью
@Table(name = "products") // сущности живут в табл, кот наз products
public class Product {
    @Id // есть айди - праймари кей (без которого jpa работать не может)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // значение id генерируется в базе (база генерит - мы принимаем)
    @Column(name = "id") // праймари кей лежит в столбце, кот наз id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Product() {
    }
}
