package com.dingding.rbac.dao;

import com.dingding.rbac.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * (Emp)表数据库访问层
 *
 * @author liudingding
 * @since 2020-06-27 10:37:55
 */
@Mapper
@Repository
public interface EmpDao<T> extends BaseDao<Emp>{


}