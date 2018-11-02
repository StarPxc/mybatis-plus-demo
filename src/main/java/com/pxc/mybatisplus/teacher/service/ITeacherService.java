package com.pxc.mybatisplus.teacher.service;

import com.github.pagehelper.PageInfo;
import com.pxc.mybatisplus.teacher.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 浦希成
 * @since 2018-11-02
 */
public interface ITeacherService extends IService<Teacher> {

    PageInfo<Teacher> getTeacherByAge(Integer pageNum, Integer pageSize);
}
