package HospitalManagementSystem;

import java.sql.*;
import java.util.Scanner;

public class HospitalManagementSystem {
    private static final String URL = "jdbc:mysql://localhost:port/databaseName";
    private static final String USERNAME = "userName";
    private static final String PASSWORD = "password";

    static void main() {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            Patient patient = new Patient(connection, scanner);
            Doctor doctor = new Doctor(connection);
            while (true){
                System.out.println("HOSPITAL MANAGEMENT SYSTEM");
                System.out.println("1. Add Patient");
                System.out.println("2. View Patients");
                System.out.println("3. View Doctors");
                System.out.println("4. Book Appointment");
                System.out.println("5. Exit");
                System.out.print("Enter your choice(1,2,...): ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        // add patient
                        patient.addPatient();
                        System.out.println();
                        break;
                    case 2:
                        // view patients
                        patient.viewPatients();
                        System.out.println();
                        break;

                    case 3:
                        // view doctors
                        doctor.viewDoctors();
                        System.out.println();
                        break;

                    case 4:
                        // book appointment
                        bookAppointment(patient, doctor, connection, scanner);
                        System.out.println();
                        break;

                    case 5:
                        // exit
                        return;

                    default:
                        System.out.print("Enter valid choice: ");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void bookAppointment(Patient patient, Doctor doctor, Connection connection, Scanner scanner) {
        System.out.println();
        System.out.print("Enter Patient ID: ");
        int patientID = scanner.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorID = scanner.nextInt();
        System.out.print("Enter Appointment date: ");
        String appointmentDate = scanner.next();

        if (patient.getPatientById(patientID) && doctor.getDoctorById(doctorID)){
//            System.out.println("Executed");
            if (checkAvailabilityOfDoctor(patientID, doctorID, appointmentDate, connection)){
                System.out.println("Your Appointment BOOKED successfully");
            } else{
                System.out.println("Sorry Doctor is NOT available...");
            }
        }
    }

    private static boolean checkAvailabilityOfDoctor(int patientID, int doctor_id, String appointmentDate, Connection connection) {
        String query = "SELECT COUNT(*) FROM appointments WHERE doctor_id = ? AND appointment_date = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,doctor_id);
            preparedStatement.setString(2, appointmentDate);
            ResultSet set = preparedStatement.executeQuery();
            if (set.next()){
                int count = set.getInt(1);
                if (count == 0){
                    String appointmentQuery = "INSERT INTO appointments(patient_id, doctor_id, appointment_date) VALUES(?,?,?)";
                    PreparedStatement insertAp = connection.prepareStatement(appointmentQuery);
                    insertAp.setInt(1,patientID);
                    insertAp.setInt(2,doctor_id);
                    insertAp.setString(3,appointmentDate);
                    insertAp.executeUpdate();
                    return true;
                }else return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
