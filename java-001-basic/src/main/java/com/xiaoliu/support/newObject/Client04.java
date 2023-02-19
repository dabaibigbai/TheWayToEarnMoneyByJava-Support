package com.xiaoliu.support.newObject;

/**
 * 使用 Person04 对象的客户端
 */
public class Client04 {
    public static void main(String[] args) {
        /**
         * 通过链式调用的方式创建Person对象，非常优雅！
         */
        Person04 person04 = new Person04
                .Builder("xiaoliu",25)
                .setHeight(175)
                .setSchool("北京大学")
                .setHobby("reading")
                .build();
        person04.doSomeThing();

        StringBuilder sb = new StringBuilder();
    }
}
