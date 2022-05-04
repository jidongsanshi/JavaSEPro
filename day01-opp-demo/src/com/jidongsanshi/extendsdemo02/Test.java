package com.jidongsanshi.extendsdemo02;

public class Test {
    //案例 理解继承思想
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.queryCourse();
        s.writeInfo();
    }
}
