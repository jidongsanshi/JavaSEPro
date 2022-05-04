package com.jidongsanshi.extends_override;

public class Test {
    /*
        认识方法重写
     */
    public static void main(String[] args) {
        NewPhone hw = new NewPhone();
        hw.call();
        hw.sendMsg();
    }
}

/*
    新手机：子类
 */

class NewPhone extends Phone{

/*    重写方法 override
    @Override 重写校验注解 加上之后 方法必须是正确重写的 这样更加安全 同时也可以提高程序的可读性 代码优雅
    重写方法的名称 形参列表 与被重写方法的名称和参数列表一致
    私有的方法不能被重写
    子类不能重写父类的静态方法 如果重写会报错*/
    @Override
    public void call(){
        super.call();
        System.out.println("开始视频通话");
    }

    @Override
    public void sendMsg(){
        super.sendMsg();
        System.out.println("发送图片");
    }
}

/*
    旧手机：父类
 */
class Phone{
    public void call(){
        System.out.println("打电话");
    }

    public void sendMsg(){
        System.out.println("发短信");
    }
}
