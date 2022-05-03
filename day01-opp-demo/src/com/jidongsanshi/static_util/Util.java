package com.jidongsanshi.static_util;

import java.util.Random;

/*
    工具类
 */
public class Util {
    /*
    注意 由于工具类无需创建对象 所以把其构造器私有化会显得专业
     */
    private Util(){
    }
    /*
    静态方法
     */
    public static String createVerifyCode(int n){
        //开发一个验证码
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQESTUVWXYZ0123456789";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(data.length());
            code+=data.charAt(index);
        }
        return  code;
    }
}
