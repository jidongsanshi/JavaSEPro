package com.jidongsanshi.p1_package;


import com.jidongsanshi.p1_package.test.Student;

public class Test {
    /*
    两点知识
    1 同一个包下的类 互相可以直接访问
    2 不同包下的类必须先导包才能再访问
    3 如果这个类中使用不同包下的相同类名 此时默认只能导入另一个类的包 另一个类要用全名访问
     */
    public static void main(String[] args) {
        System.out.println(User.onlineNumber);

        Student s = new Student();

        com.jidongsanshi.p1_package.test2.Student student = new com.jidongsanshi.p1_package.test2.Student();
    }
}
