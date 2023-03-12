/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.bean;

/**
 *
 * @author nizam
 */
public class Book extends Product {
    
    private String writer;
    private int pages;

    public Book() {
    }

    public Book(String name, double price, String writer, int pages) {
        super(name, price);
        this.writer = writer;
        this.pages = pages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book:" +getName()+"\nPrice:" +getPrice() +"\nWriter=" + writer + "\nPages=" + pages ;
    }
    
    
    
    
    
}
