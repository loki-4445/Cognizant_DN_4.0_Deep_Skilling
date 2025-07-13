package com.example.company.dao;

import com.example.company.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DepartmentDao {

    public static List<Department> DEPARTMENT_LIST;

    public DepartmentDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        Department d1 = (Department) context.getBean("dept1");
        Department d2 = (Department) context.getBean("dept2");
        DEPARTMENT_LIST = Arrays.asList(d1, d2);
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
