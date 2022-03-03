package com.teksystem;

import com.teksystem.models.AdultUser;
import com.teksystem.models.KidUser;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
	// write your code here
        KidUser kid = new KidUser();
        AdultUser adult = new AdultUser();
        kid.setAge(10);
        kid.setBookType("Kids");
        kid.registerAccount();
        kid.requestBook();
        System.out.println();
        kid.setAge(10);
        kid.setBookType("Fiction");
        kid.registerAccount();
        kid.requestBook();
        System.out.println();
        kid.setAge(18);
        kid.setBookType("Kids");
        kid.registerAccount();
        kid.requestBook();
        System.out.println();
        kid.setAge(18);
        kid.setBookType("Fiction");
        kid.registerAccount();
        kid.requestBook();
        System.out.println();
        adult.setAge(5);
        adult.setBookType("Kids");
        adult.registerAccount();
        adult.requestBook();
        System.out.println();
        adult.setAge(5);
        adult.setBookType("Fiction");
        adult.registerAccount();
        adult.requestBook();
        System.out.println();
        adult.setAge(23);
        adult.setBookType("Kids");
        adult.registerAccount();
        adult.requestBook();
        System.out.println();
        adult.setAge(23);
        adult.setBookType("Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}
