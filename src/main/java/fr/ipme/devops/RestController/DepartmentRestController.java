package fr.ipme.devops.RestController;

import fr.ipme.devops.RunTime_Exception.DepartmentNotFoundException;
import fr.ipme.devops.entity.Department;
import fr.ipme.devops.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/department")
public class DepartmentRestController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentRestController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getDepartmentList() {
        return this.departmentService.getAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Department> getDepartment(@PathVariable Long id) {
        Optional<Department> department = this.departmentService.getById(id);
        if (department.isEmpty()) {
            throw new DepartmentNotFoundException(id);
        }
        return department;
    }

}
