package com.jidongsanshi.thisconstrutor;

public class Test {
    /*
    理解this()调用兄弟构造器的方法
     */

    Student s1 = new Student("张三","北京大学");
    Student s2 = new Student("李四");

    public static void main(String[] args) {
        Student s1 = new Student("张三","北京大学");
        Student s2 = new Student("李四");
        System.out.println(s1.getSchoolName());
        System.out.println(s2.getSchoolName());
    }
}
