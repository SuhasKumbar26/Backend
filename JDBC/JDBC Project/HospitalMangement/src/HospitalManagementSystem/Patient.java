package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {
    private Connection connection;
    private Scanner scanner;

    public Patient(Connection connection, Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public void addPatient(){
        System.out.print("Enter Patient Name: ");
        String name = scanner.next();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Patient Gender(Male, Female, Other): ");
        String gender = scanner.next();
        String addPatientQuery = "INSERT INTO patients(name, age, gender) VALUES(?, ?, ?)";

        try {
            PreparedStatement psAddPatient = connection.prepareStatement(addPatientQuery);
            psAddPatient.setString(1, name);
            psAddPatient.setInt(2, age);
            psAddPatient.setString(3, gender);

            int affected_rows = psAddPatient.executeUpdate();
            if (affected_rows > 0){
                System.out.println("Patient ADDED SUCCESSFULLY...");
            }else{
                System.out.println("Patient INSERTION FAILED");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void viewPatients(){
        String viewPatientQuery = "SELECT * FROM patients";
        try {
            PreparedStatement psViewPatient = connection.prepareStatement(viewPatientQuery);
            ResultSet resultSet = psViewPatient.executeQuery();
            System.out.println("Patients: ");
            System.out.println("+-------------+---------------------+------------+--------------+");
            System.out.println("| Patient id  | Name                | Age        |  Gender      |");
            System.out.println("+-------------+---------------------+------------+--------------+");

            while (resultSet.next()){
                int id = resultSet.getInt("pid");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                System.out.printf("| %-12d| %-20s| %-11d| %-13s|\n",id, name, age, gender);
                System.out.println("+-------------+---------------------+------------+--------------+");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean getPatientById(int id){
        String getPatientQuery = "SELECT * FROM patients WHERE pid = ?";
        try {
            PreparedStatement psGetPatient = connection.prepareStatement(getPatientQuery);
            psGetPatient.setInt(1, id);
            ResultSet resultSet = psGetPatient.executeQuery();

            if (resultSet.next()) return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
