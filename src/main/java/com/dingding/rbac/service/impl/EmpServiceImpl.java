package com.dingding.rbac.service.impl;

import com.dingding.rbac.dao.BaseDao;
import com.dingding.rbac.dao.EmpDao;
import com.dingding.rbac.entity.Emp;
import com.dingding.rbac.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Emp)表服务实现类
 *
 * @author liudingding
 * @since 2020-06-27 10:37:58
 */
@Service("empService")
public class EmpServiceImpl extends BaseServiceImpl<Emp> implements EmpService{

    //实例化empDao对象，通过注入的方式
    @Autowired
    private EmpDao empDao;

    protected BaseDao<Emp> baseDao(){
        return empDao;
    }
}