package com.jidongsanshi.extends_constructor;

public class Dog extends Animal{
    public Dog(){
//        super();//写不写都有 默认存在
        System.out.println("子类Dog的无参构造器被执行");
    }

    public Dog(String name){
        System.out.println("子类Dog的有参构造器被执行");
    }
}
