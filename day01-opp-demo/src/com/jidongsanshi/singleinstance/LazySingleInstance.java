package com.jidongsanshi.singleinstance;

public class LazySingleInstance {
    /*
    准备好一个静态变量存储一个对象 只加载一次
     */
    private static LazySingleInstance instance;
    /*
    构造器私有
     */
    private LazySingleInstance(){}
    /*
        提供一个方法 对外返回单例对象
     */
    public static LazySingleInstance getInstance(){
        if(instance==null){
            instance = new LazySingleInstance();
        }
        return instance;
    }
}
