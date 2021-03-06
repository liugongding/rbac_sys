package com.dingding.rbac.dao;

import java.util.List;


public interface BaseDao<T>{
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
    List<T> queryAllByLimit();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param t 实例对象
     * @return 对象列表
     */
    List<T> queryAll(T t);

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
