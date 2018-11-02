package com.pxc.mybatisplus.teacher.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxc.mybatisplus.teacher.entity.Teacher;
import com.pxc.mybatisplus.teacher.mapper.TeacherMapper;
import com.pxc.mybatisplus.teacher.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 浦希成
 * @since 2018-11-02
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public PageInfo<Teacher> getTeacherByAge(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Teacher> teachers=teacherMapper.selectTeachersByAge(10);
        PageInfo<Teacher> pageInfo = new PageInfo<>(teachers);

        return pageInfo;
    }
}
