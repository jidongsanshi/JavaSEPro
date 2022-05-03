package com.jidongsanshi.static_code;

import java.util.ArrayList;

public class StaticTest03 {
    //模拟游戏启动前初始化54张牌数据

    /*
    定义一个静态的集合 这样这个集合只加载一个 因为一个房间只需要一副牌
     */

    public static ArrayList<String> cards = new ArrayList<>();

    /*
    在程序正直运行main方法前把54张牌放进去 后续就可以直接使用了
     */

    static {
        //正式做牌 放到集合中
        //a 定义一个数组存储全部数组 类型确定 个数确定

        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //定义一个数组 存储全部的花色
        String[] colors = {"♥", "♠", "♦", "♣"};

        //先遍历点数
        for (int i = 0; i < sizes.length; i++) {
            //遍历花色
            for (int j = 0; j < colors.length; j++) {
                String card = colors[j] + sizes[i];
                cards.add(card);
            }
        }

        cards.add("大王");
        cards.add("小王");
    }

    public static void main(String[] args) {
        System.out.println("新牌" + cards);
    }
}
