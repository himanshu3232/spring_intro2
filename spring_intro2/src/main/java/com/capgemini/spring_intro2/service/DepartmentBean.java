package com.capgemini.spring_intro2.service;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
