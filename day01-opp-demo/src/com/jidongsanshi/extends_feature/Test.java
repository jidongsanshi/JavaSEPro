package com.jidongsanshi.extends_feature;

public class Test {
    /*
    继承的特点
    1子类不能继承父类的构造器
    2父类是否可以继承父类的私有成员?继承了但无法直接访问
    3子类是否可以继承父类的静态成员?不算继承 只是共享
    4Java只支持单继承 不支持多继承
    5Java支持多层继承
     */
    public static void main(String[] args) {
        Tiger t = new Tiger();
        System.out.println(Tiger.location);
    }
}
