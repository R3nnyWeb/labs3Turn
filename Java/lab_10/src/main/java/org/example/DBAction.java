package org.example;


import org.example.models.City;
import org.example.models.Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBAction{
    final private static String USERNAME = "root";
    final private static String PASSWORD = "root";
    final private static String URL = "jdbc:mysql://localhost:3306/lab10";
    final private static String SELECT_FROM_CITY = "select * from city";
    final private static String SELECT_FROM_TYPE = "select * from type";
    final private static String FIRST_QUERY = "select c.name, t.name, t.language, ct.value " +
            "from city c join city_type ct on c.id = ct.city_id " +
            "join type t on ct.type_id = t.id " +
            "where c.name = ? and t.language = ? ";
    final private static String SECOND_QUERY = "select c.*, t.name, ct.value " +
            "from city c join city_type ct on c.id = ct.city_id " +
            "join type t on ct.type_id = t.id " +
            "where t.name = ? ";
    final private static String THIRD_QUERY = "select c.*, t.*, ct.value \n" +
            "            from city c join city_type ct on c.id = ct.city_id\n" +
            "            join type t on ct.type_id = t.id\n" +
            "            where c.id in (select c.id\n" +
            "                           from city c join city_type ct on c.id = ct.city_id\n" +
            "                           group by c.id\n" +
            "                           having sum(ct.value) = ?)";
    public static void printAllCities() {
        List<City> cities = new ArrayList<>();
        try {
            Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);
            Statement statement = connection.createStatement();
            try {
                ResultSet resultSet = statement.executeQuery(SELECT_FROM_CITY);
                while (resultSet.next()) {
                    City city = new City();
                    city.setId(resultSet.getInt("id"));
                    city.setName(resultSet.getString("name"));
                    city.setYear(resultSet.getInt("year"));
                    city.setSquare(resultSet.getInt("square"));

                    cities.add(city);
                }
                System.out.println();
                System.out.println("Все города: ");
                cities.forEach(System.out::println);
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Ошибка выполнения запроса");
            }finally {
                connection.close();
                statement.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка подключения");
        }
    };

        public static void printAllTypes(){
            List<Type> types = new ArrayList<>();
            try {
                Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);
                Statement statement = connection.createStatement();
                try {
                    ResultSet resultSet = statement.executeQuery(SELECT_FROM_TYPE);
                    while (resultSet.next()){
                        Type type = new Type();
                        type.setId(resultSet.getInt("id"));
                        type.setName(resultSet.getString("name"));
                        type.setLanguage(resultSet.getString("language"));

                        types.add(type);
                    }
                    System.out.println();
                    System.out.println(" Все типы жителей: ");
                    types.forEach(System.out::println);
                    resultSet.close();
                } catch (SQLException e){
                    e.printStackTrace();
                    System.err.println("Ошибка выполнения запроса");
                }  finally {
                    connection.close();
                    statement.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Ошибка подключения");
            }
    };
    public static void printFirstQuery(String city, String language){
        try {
            Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);
            PreparedStatement preparedStatement = connection.prepareStatement(FIRST_QUERY);
            try {
                preparedStatement.setString(1,city);
                preparedStatement.setString(2,language);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    System.out.println("[" + resultSet.getString("c.name") + " " +
                            resultSet.getString("t.name") + " " +
                            resultSet.getString("t.language") + " " +
                            resultSet.getString("ct.value") + "]");
                }
                resultSet.close();
            } catch (SQLException e){
                e.printStackTrace();
                System.err.println("Ошибка выполнения запроса");
            }finally {
                connection.close();
                preparedStatement.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка подключения");
        }

    };
    public static void printSecondQuery(String type){
        try {
            Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);
            PreparedStatement preparedStatement = connection.prepareStatement(SECOND_QUERY);
            try {
                preparedStatement.setString(1,type);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    System.out.println("[" + resultSet.getString("c.name") + " " +
                            resultSet.getInt("c.year") + " " +
                            resultSet.getInt("c.square") + " " +
                            resultSet.getString("t.name") + " "+
                            resultSet.getString("ct.value") + "]");
                }
                resultSet.close();
            } catch (SQLException e){
                e.printStackTrace();
                System.err.println("Ошибка выполнения запроса");
            }finally {
                connection.close();
                preparedStatement.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка подключения");
        }

    };
    public static void printThirdQuery(String value){
        try {
            Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);
            PreparedStatement preparedStatement = connection.prepareStatement(THIRD_QUERY);
            try {
                preparedStatement.setString(1,value);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    System.out.println("[" + resultSet.getString("c.name") + " " +
                            resultSet.getInt("c.year") + " " +
                            resultSet.getInt("c.square") + " " +
                            resultSet.getString("t.name") + " "+
                            resultSet.getString("t.language") + " "+
                            resultSet.getString("ct.value") + "]");
                }
                resultSet.close();
            } catch (SQLException e){
                e.printStackTrace();
                System.err.println("Ошибка выполнения запроса");
            }finally {
                connection.close();
                preparedStatement.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка подключения");
        }

    };

}
