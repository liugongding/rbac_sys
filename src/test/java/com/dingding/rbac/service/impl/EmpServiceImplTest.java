package com.dingding.rbac.service.impl;

import com.dingding.rbac.entity.Emp;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpServiceImplTest {

    @Autowired
    private EmpServiceImpl empService;

    @Test
    public void baseDao() {
        PageInfo<Emp> pageInfo = empService.queryAllByLimit(1,10);
        System.out.println(pageInfo.getList());
    }
}