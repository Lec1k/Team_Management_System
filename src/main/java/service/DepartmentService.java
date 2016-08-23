package service;

import domain.Department;

import java.util.List;

/**
 * Created by alvo0416 on 8/23/2016.
 */
public interface DepartmentService {

    public void addDepartment(Department department);

    public List<Department> listDepartment();

    public void removeDepartment(Integer deptno);




}
