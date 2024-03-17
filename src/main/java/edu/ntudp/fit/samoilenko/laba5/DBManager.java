package edu.ntudp.fit.samoilenko.laba5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static final String URL = "jdbc:mysql://localhost:3306/StudentDB";
    private static final String USER = "diana";
    private static final String PASSWORD = "81v8p9atpsvn";
    private static Connection connection;

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        if(!connection.isClosed()) {
            System.out.println("The connection to the database is established.");
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        String sqlQuery = "SELECT * FROM students";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            return getStudents(resultSet);
        }
    }

    public List<Student> getStudentsByBirthMonth(int month) throws SQLException {
        String sqlQuery = "SELECT * FROM students WHERE MONTH(birthdate) = ?";

        try (PreparedStatement statement = connection.prepareStatement(sqlQuery)) {
            statement.setInt(1, month);
            try (ResultSet resultSet = statement.executeQuery()) {
                return getStudents(resultSet);
            }
        }
    }

    private Student createStudent(ResultSet resultSet) throws SQLException {
        return new Student(
                resultSet.getInt("id"),
                resultSet.getString("firstName"),
                resultSet.getString("lastName"),
                resultSet.getString("patronymic"),
                resultSet.getDate("birthDate"),
                resultSet.getInt("recordBookNumber")
        );
    }

    private List<Student> getStudents(ResultSet resultSet) throws SQLException {
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            students.add(createStudent(resultSet));
        }
        return students;
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("The connection to the database is closed.");
        }
    }
}