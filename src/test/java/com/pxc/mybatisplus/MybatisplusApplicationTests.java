package com.pxc.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pxc.mybatisplus.teacher.entity.Teacher;
import com.pxc.mybatisplus.teacher.mapper.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplusApplicationTests {
    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    public void contextLoads() {

    }
    @Test
    public void testSelect() {
        Teacher teacher=new Teacher();
        teacher.setAge(10);
        teacher.setName("pxc");
        teacherMapper.insert(teacher);
        teacherMapper.deleteById(1);

    }
    @Test
    public void wrapper(){
        List<Teacher> teachers=teacherMapper.selectList(new QueryWrapper<Teacher>().eq("id",2));
        System.out.println(teachers);
        List<Teacher> teacherList=teacherMapper.selectTeachersByAge(10);
        System.out.println(teacherList);

    }


}
