package com.dingding.rbac.dao;

import com.dingding.rbac.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpDaoTest {

    @Autowired
    EmpDao empDao;

    @Test
    public void getEmpList() {
        List<Emp> empList = empDao.getEmpList();
        empList.forEach(System.out::println);
    }

    @Test
    public void queryById() {
//        Emp emp = empDao.queryById(1);
//        System.out.println(emp);
    }
}