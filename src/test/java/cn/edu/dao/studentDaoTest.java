package cn.edu.dao;

import cn.edu.entity.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class studentDaoTest {
    @Test
    public void test(){
        SqlSession session = null ;
        try {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml")) ;
            session = factory.openSession() ;
            // 使用接口代理
            studentDao studentDao = session.getMapper(studentDao.class);
            student student=new student(3016002,null,null,null,"软工1班",null);
           // student studentList=studentDao.inquireallByid(3016001);
            //List<student> cidlist = studentDao.getMoreTrim(null,null,null,"软工1班");
            List<student> studentList = new ArrayList<student>();
            studentList.add(new student(3016011,"刘德华",1, new GregorianCalendar(1980, Calendar.FEBRUARY, 11).getTime(),"软工2班",null));
            studentList.add(new student(3016014,"许嵩",1, new GregorianCalendar(1984, Calendar.MAY, 11).getTime(),"软工4班",null));
            List<String> ids= new ArrayList<String>();
            ids.add("3016011");
            ids.add("3016014");
            System.out.println(studentDao.deleteMore(new String[]{"3016010","3016009"}));
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != session) {
                session.close();
            }
        }

    }


}