package com.jidongsanshi.singleinstance;

public class Test01 {
    public static void main(String[] args) {
        //理解饿汉单例的设计
        HungrySingleInstance s1 = HungrySingleInstance.instance;
        HungrySingleInstance s2 = HungrySingleInstance.instance;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        //理解懒汉单例的设计

        LazySingleInstance l1 = LazySingleInstance.getInstance();
        LazySingleInstance l2 = LazySingleInstance.getInstance();
        System.out.println(l1==l2);
    }
}
