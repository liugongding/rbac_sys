package com.dingding.rbac.service.impl;

import com.dingding.rbac.dao.BaseDao;
import com.dingding.rbac.entity.Dept;
import com.dingding.rbac.service.DeptService;

/**
 * @author liudingding
 * @ClassName DeptServiceImpl
 * @description
 * @date 2020/6/27 3:19 下午
 */
public class DeptServiceImpl extends BaseServiceImpl<Dept> implements DeptService {

    @Override
    protected BaseDao<Dept> baseDao() {
        return null;
    }
}
