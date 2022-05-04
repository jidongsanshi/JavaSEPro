package com.jidongsanshi.extends_field_method;

public class Test {
    /*
        理解继承后成员的访问特点：就近原则
     */
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.lookDoor();
        d.showName();
    }
}
