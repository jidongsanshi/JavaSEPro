package com.jidongsanshi.p3_final;

public class Test {
    /*
        final的用法
        1 final修饰类 类不能被继承(绝育了）
        2 final修饰方法 方法不能重写
        3 final修饰变量 变量有且仅能被赋值一次
     */
}

class Student extends People{
//    @Override
//    public void eat() {
//        System.out.println("学生吃的更多");
//    }
}
class People{
    public final void eat(){
        System.out.println("人都要写东西");
    }
}
//class Wolf extends Animal{
//
//}

final class Animal{

}
