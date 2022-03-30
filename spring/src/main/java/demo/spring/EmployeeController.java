package demo.spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import Mypkg.model.Employee;
import mypkgservice.impl.Employeeservice;
@RestController
public class EmployeeController {
    
    @Autowired
    private Employeeservice employeeservice;
    
    @GetMapping("/")
    public String add(Model model) {
        model.addAttribute("employee", new Employee());
        return "add";
    }
    
    @GetMapping("/save")
    public String save(@ModelAttribute("employee") Employee employee) {
        employeeservice.add(employee);
        return "list.jsp";
    }
    
    
}