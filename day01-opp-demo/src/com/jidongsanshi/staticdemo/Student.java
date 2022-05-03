package com.jidongsanshi.staticdemo;

public class Student {
    private String name;

    //静态成员方法
    public static int getMax(int age1,int age2){
        return age1>age2?age1:age2;

    }

    //实例方法 属于对象 只能用对象访问

    public void study(){
        System.out.println(name+"在好好学习");
    }

    public static void main(String[] args) {
        System.out.println(Student.getMax(10,3));
        //同一个类中 访问静态方法 类名可以省略不写
        System.out.println(getMax(10,32));

//        study();//报错

        Student s = new Student();
        s.name="张三";
        s.study();//对象调用实例方法

        System.out.println(s.getMax(45,25));
    }

}
