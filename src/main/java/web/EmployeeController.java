package web;

import domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.EmployeeService;

import java.util.Map;

/**
 * Created by alvo0416 on 8/23/2016.
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/emps")
    public String listEmployees(Map<String ,Object> map){

        map.put("employee", new Employee());
        map.put("employeeList", employeeService.listEmployee());

        return "employee";

    }

    @RequestMapping(value = "/addEmpl", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.addEmployee(employee);
        return "redirect:/emps";

    }

    @RequestMapping("/deleteEmpl/{employeeId}")
    public String removeEmployee(@PathVariable("employeeId") Integer employeeId){

        employeeService.removeEmployee(employeeId);
        return "redirect:/emps";
    }


}
