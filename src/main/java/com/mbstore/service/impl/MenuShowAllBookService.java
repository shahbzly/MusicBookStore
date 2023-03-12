/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.service.impl;

import com.mbstore.bean.Book;
import com.mbstore.config.Config;
import com.mbstore.service.inter.*;
import java.util.ArrayList;

/**
 *
 * @author nizam
 */
public class MenuShowAllBookService implements MenuShowAllBookServiceInter{

    @Override
    public void process() {
        ArrayList<Book> book = Config.instance().getBooks();
        for ( Book b : book ){
            System.out.println(b);
        
    }
        
    }
    
}
