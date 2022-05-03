package com.jidongsanshi.static_code;

public class StaticDemo02 {
    private String name;

    public StaticDemo02(){
        System.out.println("无参构造器执行");
    }
    /*
    实例(构造)代码块 无static修饰 属于对象 每次构造对象时 会触发执行一次
    初始化实例资源 但几乎不用
     */
    {
        name = "张三";
        System.out.println("实例代码块执行");
    }

    public static void main(String[] args) {
        StaticDemo02 sd1 = new StaticDemo02();
        System.out.println(sd1.name);
        StaticDemo02 sd2 = new StaticDemo02();
        System.out.println(sd2.name);
    }
}
