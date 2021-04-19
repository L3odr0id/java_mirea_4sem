package com.company.PR1;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PR1 {

    private static final String PATTERN = "^[_A-z0-9-]+(\\.[_A-z0-9-]+)*@[A-z0-9_-]+(\\.[A-z0-9_-]+)*(\\.[A-z]{2,})$";

    public static void main(String[] args) {
        testEmail("valid.email@edu.mirea.ru");
        testEmail("invalid@wrong");
    }

    public static boolean validate(String email) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void testEmail(String email) {
        Predicate<String> isEmail = PR1::validate;
        System.out.print(email + " - ");
        if (isEmail.test(email))
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }
}
