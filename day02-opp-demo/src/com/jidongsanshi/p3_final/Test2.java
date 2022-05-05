package com.jidongsanshi.p3_final;

public class Test2 {
    public static final String schoolName = "武大";
    private final String name = "猪八戒";//几乎不用 每个对象的name都会变成猪八戒 还无法修改
    public static void main(String[] args) {
        //理解final修饰变量
        /*
        1 局部变量
        2 静态成员变量
        3 实例成员变量
         */

        /*
         final修饰基本变量 基本变量的值不能改变
         final修饰引用变量 引用变量指向的地址不能改变
         */
       final double rate = 3.14;
//       rate = 3.156;//第二次不能赋值了
        buy(0.8);
//        schoolName = "北大";//第二次不能赋值了


        final Teacher t = new Teacher();
//        t = null;
        t.setHobby("运动");
        System.out.println(t.getHobby());
    }

    public static void buy(final double z){
//        z = 0.1;//不能再修改
    }
}

class Teacher{
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}