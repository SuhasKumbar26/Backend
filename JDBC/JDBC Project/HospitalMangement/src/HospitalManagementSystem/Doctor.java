package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Doctor {
    private Connection connection;

    public Doctor(Connection connection){
        this.connection = connection;
    }


    public void viewDoctors(){
        String viewPatientQuery = "SELECT * FROM doctors";
        try {
            PreparedStatement psViewPatient = connection.prepareStatement(viewPatientQuery);
            ResultSet resultSet = psViewPatient.executeQuery();
            System.out.println("Doctors: ");
            System.out.println("+-------------+---------------------+--------------------------+");
            System.out.println("| Doctor id   | Name                | Specialization           |");
            System.out.println("+-------------+---------------------+--------------------------+");

            while (resultSet.next()){
                int id = resultSet.getInt("did");
                String name = resultSet.getString("name");
                String specialization = resultSet.getString("specialization");
                System.out.printf("| %-12d| %-20s| %-25s|\n",id, name, specialization);
                System.out.println("+-------------+---------------------+--------------------------+");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean getDoctorById(int id){
        String getPatientQuery = "SELECT * FROM doctors WHERE did = ?";
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
