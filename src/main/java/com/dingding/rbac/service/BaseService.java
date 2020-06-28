package com.dingding.rbac.service;

import com.dingding.rbac.entity.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author liudingding
 * @ClassName BaseService
 * @description
 * @date 2020/6/27 3:17 下午
 */
public interface BaseService<T> {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    T queryById(Integer id);

    /**
     * 分页查询指定行数据
     *
     * @return 对象列表
     */
    PageInfo<T> queryAllByLimit(int pageNum, int pageSize);


    /**
     * 新增数据
     *
     * @param t 实例对象
     * @return 影响行数
     */
    int insert(T t);

    /**
     * 修改数据
     *
     * @param t 实例对象
     * @return 影响行数
     */
    int update(T t);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<T> getEmpList();
}
