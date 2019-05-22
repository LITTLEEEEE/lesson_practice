package cn.edu.dao;

import cn.edu.entity.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

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
            student studentList=studentDao.inquireallByid(3016001);
            List<student> cidlist = studentDao.inquireBycid(00001);
            System.out.print(cidlist);
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