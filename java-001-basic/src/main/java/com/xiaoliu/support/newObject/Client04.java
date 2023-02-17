package com.xiaoliu.support.newObject;

/**
 * 使用 Person04 对象的客户端
 */
public class Client04 {
    public static void main(String[] args) {
        Person04 person04 = new Person04
                .Builder("xiaoliu",25)
                .setHeight(175)
                .setSchool("北京大学")
                .setHobby("reading")
                .build();
        person04.doSomeThing();

    }
}
