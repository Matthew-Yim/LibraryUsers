package com.teksystem.models;

public class KidUser implements LibraryUser{
     int age;
     String bookType;

    @Override
    public void registerAccount() {
        if ((age < 12) && (age >= 0))
            System.out.println("You have successfully registered under a Kid's Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a Kid");
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids"))
            System.out.println("Book issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
