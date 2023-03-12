/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.util;

import com.mbstore.service.impl.MenuShowAllSongService;
import com.mbstore.service.impl.MenuAddBookService;
import com.mbstore.service.impl.MenuLoginService;
import com.mbstore.service.impl.MenuShowAllBookService;
import com.mbstore.service.impl.MenuAddSongService;
import com.mbstore.service.impl.MenuExitService;
import com.mbstore.service.impl.MenuRegisterService;
import com.mbstore.service.inter.MenuService;

/**
 *
 * @author nizam
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_BOOK(3, "Add Book", new MenuAddBookService()),
    ADD_SONG(4, "Add Song", new MenuAddSongService()),
    SHOW_ALL_BOOK(5, "Show All Books", new MenuShowAllBookService()),
    SHOW_ALL_SONG(6, "Show All Songs", new MenuShowAllSongService()),
    EXIT(7, "Exit", new MenuExitService()),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;

    private Menu() {
    }

    private Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.selectMenu();
    }

    public static Menu find(int choice) {
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (choice == m[i].getNumber()) {
                return m[i];
            }

        }
        return UNKNOWN;

    }
}
