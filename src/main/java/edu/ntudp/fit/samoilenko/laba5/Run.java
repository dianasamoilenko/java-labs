package edu.ntudp.fit.samoilenko.laba5;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DBManager dbManager = new DBManager();
        dbManager.connect();

        int month = validationOfBirthMonth(scanner);

        List<Student> filteredStudents = dbManager.getStudentsByBirthMonth(month);
        printStudentsByMonth(filteredStudents);

        dbManager.closeConnection();
    }

    private static int validationOfBirthMonth(Scanner scanner) {
        int month;

        do {
            System.out.print("Enter the month number (1-12): ");
            month = Integer.parseInt(scanner.nextLine());

            if (month < 1 || month > 12) {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        } while (month < 1 || month > 12);

        return month;
    }

    private static void printStudentsByMonth(List<Student> students) {
        String message = students.isEmpty() ?
                "No students born this month were found..." :
                "Students born in this month:";
        System.out.println(message);

        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println("---------------------");
                System.out.println(student.toString());
            }
        }
    }
}