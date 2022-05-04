package com.jidongsanshi.thisconstrutor;

public class Student {
    private String name;
    private String schoolName;

    public Student() {
    }
    /*
        需求当 没有填学校名字时 默认使用武大
     */

    public Student(String name){
        this(name,"武汉大学");
    }
    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
