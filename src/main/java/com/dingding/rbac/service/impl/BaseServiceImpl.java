package com.dingding.rbac.service.impl;

import com.dingding.rbac.dao.BaseDao;
import com.dingding.rbac.service.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author liudingding
 * @ClassName BaseServiceImpl
 * @description
 * @date 2020/6/27 4:11 下午
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * service调用mapper层，该属性需要子类实例化
     * 定义成抽象方法原因是强制子类复写，否则无法编译
     */
    protected abstract BaseDao<T> baseDao();    //只是声明,需要实例化


    @Override
    public T queryById(Integer id) {
        return baseDao().queryById(id);
    }


    @Override
    public PageInfo<T> queryAllByLimit(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<T> list = baseDao().queryAllByLimit();
        return new PageInfo<>(list);
    }

    @Override
    public int insert(T t) {
        return baseDao().insert(t);
    }

    @Override
    public int update(T t) {
        return baseDao().update(t);
    }

    @Override
    public int deleteById(Integer id) {
        return baseDao().deleteById(id);
    }

    @Override
    public List<T> getEmpList() {
        return null;
    }
}
