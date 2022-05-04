package com.jidongsanshi.extends_constructorparam;

public class Test {
    /*
        学习子类构造器如何去访问父类有参构造器 清楚其作用
     */
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setAge(25);
        t.setName("张三");
        System.out.println(t.getAge());
        System.out.println(t.getName());

        Teacher teacher = new Teacher("李四",30);
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
    }
}
