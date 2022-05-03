package com.jidongsanshi.staticdemo;

public class User {
    //static修饰的静态成员变量 内存中只有一份
    public static int onlineNumber = 161;

    //实例成员变量 属于每个对象 必须用对象名.访问

    private String name;
    private int age;
    public static void main(String[] args) {
        //理解 static 修饰成员变量的作用和访问特点
        System.out.println(User.onlineNumber);
//        System.out.println(User.name);//报错

        User u = new User();
        u.name="张三";
        u.age=21;
        System.out.println(u.name);
        System.out.println(u.age);
        System.out.println(u.onlineNumber);//对象访问不推荐
    }
}
