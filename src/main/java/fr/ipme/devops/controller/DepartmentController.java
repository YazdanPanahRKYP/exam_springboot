package fr.ipme.devops.controller;

import fr.ipme.devops.entity.Department;
import fr.ipme.devops.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        List<Department> departments = departmentService.getAll();
        modelAndView.addObject("departments", departments);
        modelAndView.setViewName("department.html");
        return modelAndView;
    }

}
