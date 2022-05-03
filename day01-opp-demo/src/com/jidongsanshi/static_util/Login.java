package com.jidongsanshi.static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        //开发一个验证码
        System.out.println(Util.createVerifyCode(6));
//        Util u = new Util();//报错 工具类把构造器用private 修饰 这样就无法创建对象 只能用类名访问方法
    }
}
