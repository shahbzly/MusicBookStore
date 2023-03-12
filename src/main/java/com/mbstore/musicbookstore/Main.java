/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mbstore.musicbookstore;

import com.mbstore.config.Config;
import static com.mbstore.util.MenuUtil.*;

/**
 *
 * @author nizam
 */
public class Main {

    public static void main(String[] args) {
        Config.registerInitialize();
        Config.initialize();
        selectMenu();
    }
}
