package com.jidongsanshi.p2_modifier.itcast;

import com.jidongsanshi.p2_modifier.Father;

public class Son extends Father {
    public static void main(String[] args) {
        Son s = new Son();
        s.publicMethod();
        s.protectedMethod();//protected子类权限是子类调用
    }
}
