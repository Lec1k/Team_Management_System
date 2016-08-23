package dao;

import domain.Department;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alvo0416 on 8/23/2016.
 */
@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addDepartment(Department department) {
        sessionFactory.getCurrentSession().save(department);
    }

    public List<Department> listDepartment() {

        return sessionFactory.getCurrentSession().createQuery("from Department").list();
    }

    public void removeDepartment(Integer deptno) {

        Department department = sessionFactory.getCurrentSession().load(Department.class,deptno);

        if(null != department){
            sessionFactory.getCurrentSession().delete(department);
        }

    }
}
