package service;

import dao.EmployeeDAO;
import domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alvo0416 on 8/23/2016.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Transactional
    public List<Employee> listEmployee() {
        return employeeDAO.listEmployee();
    }

    @Transactional
    public void removeEmployee(Integer id) {
        employeeDAO.removeEmployee(id);
    }
}
