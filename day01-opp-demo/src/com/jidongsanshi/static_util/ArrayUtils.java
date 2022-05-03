package com.jidongsanshi.static_util;

/*
    练习 设计数组的工具类
 */
public class ArrayUtils {
    /*
        私有构造器
     */
    private ArrayUtils() {
    }

    /*
        静态的工具方法
     */
    public static String toString(int[] arr) {
        //校验
        if (arr == null) {
            return null;
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        result += "]";
        return result;
    }
}
