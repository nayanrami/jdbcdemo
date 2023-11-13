package in.ac.adit.practice;

import in.ac.adit.practice.dao.EmployeeDAOImpl;
import in.ac.adit.practice.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 * Hello world!
 *127.0.0.1
 */
public class App 
{
    public static void main( String[] args )  {
            EmployeeDAOImpl employeeDAOimpl =  new EmployeeDAOImpl();
            Employee employee = employeeDAOimpl.getEmployee(1);
            if(employee!=null){
                System.out.println(employee);
            }
    }
}
