package com.capgemini.spring_intro2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    @Autowired
    private DepartmentBean departmentBean;
    private int empId;
    private String empName;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean(){}

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean){
        logger.trace("*** Autowiring using @Autowired annotation on constructor ***");
        this.departmentBean = departmentBean;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void showDetails(){
        logger.debug("Emp id: {}", empId);
        logger.debug("Emp name : {}", empName);
        departmentBean.setDepartmentName("Information Technology");
        logger.debug("Department name: {}", departmentBean.getDepartmentName());
    }
}
