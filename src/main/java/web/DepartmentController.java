package web;

import domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.DepartmentService;

import java.util.Map;

/**
 * Created by alvo0416 on 8/23/2016.
 */

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/deps")
    public String listDepartments(Map<String,Object> map){

        map.put("department", new Department());
        map.put("departmentList", departmentService.listDepartment());

        return "department";

    }

    @RequestMapping(value = "/addDept", method = RequestMethod.POST)
    public String addDepartment(@ModelAttribute("department") Department department){

        departmentService.addDepartment(department);
        return "redirect:/deps";

    }

    @RequestMapping("/deleteDept/{departmentId}")
    public String deleteDepartment(@PathVariable("departmentId") Integer departmentId){

        departmentService.removeDepartment(departmentId);
        return "redirect:/deps";

    }


}
