package com.dingding.rbac.controller;

import com.dingding.rbac.dao.EmpDao;
import com.dingding.rbac.entity.Emp;
import com.dingding.rbac.service.impl.EmpServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * (Emp)表控制层
 *
 * @author liudingding
 * @since 2020-06-27 10:37:59
 */
@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    EmpDao empDao;

    @Autowired
    private EmpServiceImpl empService;
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("selectOne")
//    public Emp selectOne(Integer id) {
//        return this.empService.queryById(id);
//    }

    @GetMapping("/select")
    public List<Emp> select(){
        return empDao.getEmpList();
    }

    @RequestMapping("/getPage")
//    @ResponseBody
    public String selectLimit(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10")int pageSize, Model model){
         PageInfo<Emp> pageInfo = empService.queryAllByLimit(pageNum,pageSize);
         model.addAttribute("emps", pageInfo);
         return "empList";
//         return pageInfo;
    }

    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    @RequestMapping("/test")
    public String test1(){
        return "/common/page";
    }

}