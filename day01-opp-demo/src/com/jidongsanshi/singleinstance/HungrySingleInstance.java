package com.jidongsanshi.singleinstance;

/*
    使用饿汉单例实现单例类
 */
public class HungrySingleInstance {
    /*
    饿汉单例是在获取对象前 对象已经提前准备好了一个
    这个对象只能是一个 所以定义为静态成员变量
     */
    public static HungrySingleInstance instance = new HungrySingleInstance();

    /*
    私有化构造器
     */
    private HungrySingleInstance(){

    }


}
