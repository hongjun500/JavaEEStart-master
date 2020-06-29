package com.hongjun.chapter04web.controller;

import com.hongjun.chapter04web.dao.EmployeeDao;
import com.hongjun.chapter04web.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author hongjun500
 * @date 2020/6/1 22:05
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:员工控制器
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping(value = "/emps")
    public String list(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps", all);
        // classpath/templates
        return "success";
    }

    @GetMapping(value = "/emp")
    public String add(){
        return "emp/add";
    }
}
