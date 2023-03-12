/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.service.impl;

import com.mbstore.bean.Book;
import com.mbstore.config.Config;
import com.mbstore.exceptions.NegativeException;
import com.mbstore.service.inter.MenuAddBookServiceInter;
import com.mbstore.service.inter.MenuService;
import com.mbstore.util.FileUtility;
import com.mbstore.util.SystemUtility;
import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class MenuAddBookService implements MenuAddBookServiceInter {

    @Override
    public void process() {

        try {
            String bookName = SystemUtility.inputString("Please enter Book name: ");
            int bookPrice = SystemUtility.inputNumber("Please enter Book price: ");
            if (bookPrice < 0) {
                throw new NegativeException();
            }
            
            String bookWriter = SystemUtility.inputString("Please enter Book writer: ");
            int bookPage = SystemUtility.inputNumber("Please enter Book pages: ");
            if (bookPage < 0) {
                throw new NegativeException();
            }

            Book book = new Book(bookName, bookPrice, bookWriter, bookPage);

            Config config = new Config();
            Config.instance().setBooks(book);
            Config.save();

        } catch (NegativeException ex) {

            System.out.println("Can not be negative!");
        }

    }

}
