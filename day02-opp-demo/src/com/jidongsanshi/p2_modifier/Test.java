package com.jidongsanshi.p2_modifier;

public class Test {
    /*
        理解修饰符的修饰范围
     */
    public static void main(String[] args) {
        Father f = new Father();
        f.publicMethod();
        f.method();
        f.protectedMethod();
    }
}
