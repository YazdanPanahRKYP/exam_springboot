package fr.ipme.devops.service;



import fr.ipme.devops.entity.Department;
import fr.ipme.devops.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    public List<Department> departments;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAll() {
        return this.departmentRepository.findAll();
    }

    public Optional<Department> getById(Long id) {
        return this.departmentRepository.findById(id);
    }

    public Optional<Department> getDepartmentById(Long id) {
        return this.departmentRepository.findById(id);
    }
}
