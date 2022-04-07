package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRagistation {
    static Scanner scanner = new Scanner(System.in);

    public void firstName() {
        System.out.println("Enter the first name: ");
        String name = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);

        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid, Try with another name.");
        }
    }

    public static void main(String[] args) {

        UserRagistation check = new UserRagistation();
        check.firstName();
    }
}
