package cn.edu.dao;

import cn.edu.entity.student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface studentDao {

    //按照学号查询学生基本信息
    @Select("select * from student where sid = #{sid}")
    student inquireByid(@Param("sid")int sid);

    //根据班级名称查询学生信息
    @Select("select * from student where classname = #{classname}")
    List<student> inquireByclassname (@Param("classname")String classname);

    //根据名字关键字查询学生信息
    List<student> inquireBykeyname(String keyname);

    //根据课程号查询选修了该课程的学生信息及成绩
    List<student> inquireBycid(int cid);

    //根据学号查询某个学生选修的所有课程及成绩
    student inquireallByid(int sid);
}
