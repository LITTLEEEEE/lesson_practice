package cn.edu.dao;

import cn.edu.entity.student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
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

    //动态sql,根据多个关键字进行查询
    public List<student> getMore(@Param("nameKey")String nameKey , @Param("gender")Integer gender ,
                                 @Param("birthday")Date birthday , @Param("classname")String classname) ;
    //动态sql，使用trim
    public List<student> getMoreTrim(@Param("nameKey")String nameKey , @Param("gender")Integer gender ,
                                     @Param("birthday") Date birthday , @Param("classname")String classname) ;

    //更新学生信息
    public int update(@Param("student")student student) ;

    //更新学生信息，使用trim
    public int updateTrim(@Param("student")student student) ;

    //批量插入
    public int addMore(@Param("listStudent") List<student> listStudent) ;

    //批量删除
    public int deleteMore(@Param("ids") String[] ids) ;
}
