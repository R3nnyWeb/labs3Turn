package org.example;


import lombok.Value;
import org.example.models.City;
import org.example.models.Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBAction {
    final private static String USERNAME = "root";
    final private static String PASSWORD = "root";
    final private static String URL = "jdbc:mysql://localhost:3306/lab10";
    final private static String CITIES_BY_LANGUAGE_QUERY = "select c.*, t.*, ct.value " +
            "from city c join city_type ct on c.id = ct.city_id " +
            "join type t on ct.type_id = t.id " +
            "where c.name = ? and t.language = ? ";
    final private static String CITIES_BY_TYPE_QUERY = "select c.*, t.*, ct.value " +
            "from city c join city_type ct on c.id = ct.city_id " +
            "join type t on ct.type_id = t.id " +
            "where t.name = ? ";
    final private static String CITIES_AND_TYPE_BY_VALUE_QUERY = "select c.*, t.*, ct.value \n" +
            "            from city c join city_type ct on c.id = ct.city_id\n" +
            "            join type t on ct.type_id = t.id\n" +
            "            where c.id in (select c.id\n" +
            "                           from city c join city_type ct on c.id = ct.city_id\n" +
            "                           group by c.id\n" +
            "                           having sum(ct.value) = ?)";


    private static ArrayList<City> getResultArrayList (ResultSet resultSet) throws SQLException {
        ArrayList<City> result = new ArrayList<>();

        while (resultSet.next()) {
            Map<Type, String> typeValueMap = new HashMap<>();
            typeValueMap.put(new Type(resultSet.getInt("t.id"),
                            resultSet.getString("t.name"),
                            resultSet.getString("t.language")),
                    resultSet.getString("ct.value"));
            City resultCity = new City(resultSet.getInt("c.id"),
                    resultSet.getString("c.name"),
                    resultSet.getInt("c.year"),
                    resultSet.getInt("c.square"),
                    typeValueMap);
            result.add(resultCity);
        }
        return result;
    }

    public static ArrayList<City> executeCitiesByLanguageQuery(String city, String language) {
        ArrayList<City> result = new ArrayList<>();
        try (Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);) {

            PreparedStatement preparedStatement = connection.prepareStatement(CITIES_BY_LANGUAGE_QUERY);
            preparedStatement.setString(1, city);
            preparedStatement.setString(2, language);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
               result = getResultArrayList(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Ошибка выполнения запроса");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка подключения");
        }

        return result;
    }


    public static ArrayList<City> executeCitiesByTypeQuery(String type){
        ArrayList<City> result = new ArrayList<>();
        try (Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);) {

            PreparedStatement preparedStatement = connection.prepareStatement(CITIES_BY_TYPE_QUERY);
            preparedStatement.setString(1, type);

            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                result = getResultArrayList(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Ошибка выполнения запроса");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка подключения");
        }

        return result;
    }

    public static ArrayList<City> executeCitiesAndTypeByValueQuery(String value){
        ArrayList<City> result = new ArrayList<>();
        try (Connection connection = ConnectionCreator.getNewConnection(USERNAME, PASSWORD, URL);) {

            PreparedStatement preparedStatement = connection.prepareStatement(CITIES_AND_TYPE_BY_VALUE_QUERY);
            preparedStatement.setString(1, value);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                result = getResultArrayList(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Ошибка выполнения запроса");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ошибка подключения");
        }

        return result;
    }
}