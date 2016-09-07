package dao;

import domain.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alvo0416 on 8/23/2016.
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    public List<Employee> listEmployee() {
        return sessionFactory.getCurrentSession().createQuery("from Employee").list();
    }

    public void removeEmployee(Integer id) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        if(null!= employee){
            sessionFactory.getCurrentSession().delete(employee);
        }
    }
}
