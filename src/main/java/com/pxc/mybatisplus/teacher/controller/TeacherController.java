package com.pxc.mybatisplus.teacher.controller;


import com.github.pagehelper.PageInfo;
import com.pxc.mybatisplus.teacher.entity.Teacher;
import com.pxc.mybatisplus.teacher.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 浦希成
 * @since 2018-11-02
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;
    @GetMapping("testPaging/{pageNum}/{pageSize}")
    public PageInfo<Teacher> testPaging(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
        return teacherService.getTeacherByAge(pageNum,pageSize);
    }
}
