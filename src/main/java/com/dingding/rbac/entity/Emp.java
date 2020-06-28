package com.dingding.rbac.entity;

import lombok.*;

import java.util.Date;
import java.io.Serializable;

/**
 * (Emp)实体类
 *
 * @author liudingding
 * @since 2020-06-27 10:38:42
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Emp implements Serializable {
    private static final long serialVersionUID = 719984127899768879L;
    /**
    * 主键id
    */
    private Integer id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 性别
    */
    private String sex;
    /**
    * 邮件
    */
    private String email;
    /**
    * 手机号
    */
    private String mobile;
    /**
    * 部门编号
    */
    private Integer deptNo;
    /**
    * 生日
    */
    private Date birthday;
    
    private Date createTime;

    private Date updateTime;

    private Emp createUser;

    private Emp updateUser;

    private String attr1;
    
    private String userPng;



}