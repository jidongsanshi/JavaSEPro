package com.jidongsanshi.static_code;

public class StaticDemo01 {
    /*
    静态代码块 由static修饰 属于类 与类一起优先加载一次 自动触发执行
    可以用于初始化静态资源
     */
    public static String name;
    static {
        System.out.println("静态代码块触发了");
        name="季冬三十";
    }

    public static void main(String[] args) {
        System.out.println("main方法执行了");
        System.out.println(name);
    }
}
