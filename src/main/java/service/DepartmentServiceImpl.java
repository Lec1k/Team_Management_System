package service;

import dao.DepartmentDAO;
import domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alvo0416 on 8/23/2016.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Transactional
    public void addDepartment(Department department) {
        departmentDAO.addDepartment(department);
    }

    @Transactional
    public List<Department> listDepartment() {
        return departmentDAO.listDepartment();
    }

    @Transactional
    public void removeDepartment(Integer deptno) {
        departmentDAO.removeDepartment(deptno);
    }
}
