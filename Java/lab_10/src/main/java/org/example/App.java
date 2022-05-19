package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final  String USERNAME = "root";
        final  String PASSWORD = "root";
        final  String URL = "jdbc:mysql://localhost:3306/lab10";
        DBAction.printAllCities();
        DBAction.printAllTypes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название города");
        String city = sc.nextLine();
        System.out.println("Введите название языка");
        String language = sc.nextLine();
        DBAction.printFirstQuery(city, language);
        System.out.println("Введите название типа");
        String type = sc.nextLine();
        DBAction.printSecondQuery(type);

        sc.close();
    }
}
