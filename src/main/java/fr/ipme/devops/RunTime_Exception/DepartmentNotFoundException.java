package fr.ipme.devops.RunTime_Exception;

public class DepartmentNotFoundException extends RuntimeException {
    public DepartmentNotFoundException(Long id) {
        super("No account found for the id : " + id);
    }
}

