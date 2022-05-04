package com.jidongsanshi.extends_field_method;

public class Dog extends Animal{
    private String name="狗名";//第二
    public void lookDoor(){
        System.out.println("狗可以看门");
    }

    public void run(){
        System.out.println("狗跑的贼快");
    }

    public void showName(){
        String  name= "局部名";//第一
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        run();
        super.run();
    }
}
