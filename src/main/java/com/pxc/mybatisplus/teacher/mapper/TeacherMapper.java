package com.pxc.mybatisplus.teacher.mapper;

import com.pxc.mybatisplus.teacher.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 浦希成
 * @since 2018-11-02
 */
public interface TeacherMapper extends BaseMapper<Teacher> {
     List<Teacher> selectTeachersByAge(Integer age);

}
