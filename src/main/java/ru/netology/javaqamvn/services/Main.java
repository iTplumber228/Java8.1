package ru.netology.javaqamvn.services;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "John";
        post.passport = "00 00 № 000 000";
        post.patronymic = "Johnsonson";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Johnson";
        post.subscription = Boolean.parseBoolean("true");
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;



    }
}
