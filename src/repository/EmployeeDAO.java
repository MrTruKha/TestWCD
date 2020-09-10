package repository;

import entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public static Boolean insertEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO employee (fullname, birthday, address, position) VALUES (?, ?, ?, ?)";

        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, employee.getFullName());
        statement.setString(2, employee.getBirthday());
        statement.setFloat(3, employee.getAddress());
        statement.setString(4, employee.getPosition());

        return statement.executeUpdate() > 0;
    }

    public static List<Employee> selectAllEmployee() throws SQLException {
        List<Employee> listEmployee = new ArrayList<Employee>();

        String sql = "SELECT * FROM employee";

        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String fullname = resultSet.getString("fullname");
            String birthday = resultSet.getString("birthday");
            String address = resultSet.getString("address");
            String position = resultSet.getString("position");

            Employee employee = new Employee(fullname, birthday, address, position);
            listEmployee.add(employee);
        }
        return listEmployee;
    }
}
