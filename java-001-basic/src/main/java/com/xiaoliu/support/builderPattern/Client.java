package com.xiaoliu.support.builderPattern;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //第一种 建造者模式只有在调用build()之后才会创建OperateLog对象
        User1 user1 = new User1.Builder(1,"小明",new Date()).setJob("软件工程师").setAddress("北京").build();
        System.out.println(user1);

        //第二种
        User2 user2 = User2.builder().name("小明").job("软件工程师").build();
        System.out.println(user2);

        //第三种
        User3 user3 = User3.of("小明").setJob("软件工程师");
        System.out.println(user3);
    }
}
