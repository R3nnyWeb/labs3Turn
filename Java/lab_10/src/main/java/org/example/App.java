package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        final  String USERNAME = "root";
        final  String PASSWORD = "root";
        final  String URL = "jdbc:mysql://localhost:3306/lab10";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название города");
        String city = sc.nextLine();
        System.out.println("Введите название языка");
        String language = sc.nextLine();
        System.out.println("Вывести информацию обо" +
                        " всех жителях заданного города, " +
                        "разговаривающих на заданном языке:");
        System.out.println(DBAction.executeCitiesByLanguageQuery(city, language));
       System.out.println("Вывести информацию обо всех городах," +
                " в которых проживают жители выбранного типа: ");
       System.out.println("Введите название типа");
       String type = sc.nextLine();
        System.out.println(DBAction.executeCitiesByTypeQuery(type));
       System.out.println();
       System.out.println("Вывести информацию о городе с заданным количеством населения" +
                " и всех типах жителей, в нем проживающих: ");
        System.out.println("Введите количество людей");
        Integer value = sc.nextInt();

        System.out.println(DBAction.executeCitiesAndTypeByValueQuery(value.toString()));

        sc.close();
    }
}
