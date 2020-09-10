package controller;

import entity.Employee;
import repository.EmployeeDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String birthday = request.getParameter("birthday");
        float address =  request.getParameter("address");
        String position = request.getParameter("position");

        try {
            Employee employee = new Employee(fullname, birthday, address, position);
            EmployeeDAO.insertEmployee(employee);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

        response.sendRedirect("/WCDPractical_war_exploded");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = null;
        try {
            employeeList = EmployeeDAO.selectAllEmployee();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("listemployee.jsp").include(request, response);
    }
}
