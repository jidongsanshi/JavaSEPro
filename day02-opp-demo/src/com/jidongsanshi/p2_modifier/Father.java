package com.jidongsanshi.p2_modifier;

public class Father {
    /*
    定义私有成员 private 只能在本类中访问
     */
    private void privateMethod() {
        System.out.println("private");
    }

    /*
    定义缺省修饰的成员 只能本类中 同包下其他类访问 （包访问权限）
     */
    void method() {
        System.out.println("缺省");
    }

    /*
       protected修饰的成员 本类中 同包的其他类中 其他包的子类中
        */
    protected void protectedMethod() {
        System.out.println("protected");
    }

    /*
   protected修饰的成员 本类中 同包的其他类中 其他包的子类中 其他包的无关类中
    */
    public void publicMethod() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.method();
        f.protectedMethod();
        f.privateMethod();
        f.publicMethod();
    }
}
