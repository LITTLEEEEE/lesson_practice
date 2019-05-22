package cn.edu.entity;

import java.util.Date;
import java.util.List;

public class student {
    private int sid;
    private String sname;
    private int gender;
    private Date birthday;
    private String classname;
    private List<course> courseLists;
    public student() {
    }

    public student(int sid, String sname, int gender, Date birthday, String classname, List<course> courseLists) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.birthday = birthday;
        this.classname = classname;
        this.courseLists=courseLists;
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }


    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", classname='" + classname + '\'' +
                ", courseLists=" + courseLists +
                '}';
    }

    public List<course> getCourseLists() {
        return courseLists;
    }

    public void setCourseLists(List<course> courseLists) {
        this.courseLists = courseLists;
    }
}
