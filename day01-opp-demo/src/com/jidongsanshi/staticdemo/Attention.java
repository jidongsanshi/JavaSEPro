package com.jidongsanshi.staticdemo;

public class Attention {
    // 理解static 访问相关的语法 面试笔试题 或者以后理解程序很重要的知识

    public static int onlineNumber = 10;
    public static void test2(){
        System.out.println("test2");
    }

    private String name;
    public void run(){
        System.out.println(name+"跑到看");
    }
    //3 静态方法中不可以出现this 关键字
    public static void test3(){
//        System.out.println(this.name);//报错 this代表当前对象而静态方法可以不用对象调用
    }

    //2实力方法可以访问静态成员 也可以访问实例成员
    public void go (){
        System.out.println(Attention.onlineNumber);
        System.out.println(onlineNumber);
        test2();
        System.out.println(name);
        run();
        System.out.println(this);
    }

    //1 静态方法只能访问静态成员 不能直接访问实例成员
    public static void test(){
        System.out.println(Attention.onlineNumber);
        System.out.println(onlineNumber);
        test2();
//        System.out.println(name);//报错 不能直接访问实例成员
        Attention a = new Attention();
        System.out.println(a.name);//间接访问
//        run();//报错 实例方法也不能访问
    }
    public static void main(String[] args) {
        test();
    }
}
