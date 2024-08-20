package org.employee.employee_project_attempt2.Rest;

import org.employee.employee_project_attempt2.DAO.EmployeeDAO;
import org.employee.employee_project_attempt2.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;//Field
    //Quick and Dirty

    //Constructor
    public EmployeeRestController(EmployeeDAO theemployeeDAO) {
        this.employeeDAO = theemployeeDAO;
    }
    //Expose "/employee" endpoint to list out all employees

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployee();
    }

}
