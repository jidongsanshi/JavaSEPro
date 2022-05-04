package com.jidongsanshi.extends_constructor;

public class Test {
    /*
        认识继承后子类的构造器特点
        子类的全部构造器都会默认先访问父类的无参构造器在执行自己
     */
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog dog = new Dog("Tom");
    }
}
