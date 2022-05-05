package com.jidongsanshi.p4_constant;

public class ConstantDemo01 {
    /*
        常量的作用
        常量的好处 编译的时候会进行宏替换 把使用常量的地方全部替换成真实的字面量
        这样使用常量的程序的执行性能和直接使用字面量是一样的
     */

    public static final String SCHOOL_NAME = "武汉大学";
    public static final String USER_NAME = "季冬三十";
    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(USER_NAME);
        System.out.println(USER_NAME);
        System.out.println(USER_NAME);
    }
}
