package com.xiaoliu.support.newObject;

/**
 * 单一构造函数
 */
public class Person01 {

    // 姓名(必填)
    private String name;

    // 年龄(必填)
    private int age;

    // 身高(选填)
    private int height;

    // 学校(选填)
    private String school;

    // 爱好(选填)
    private String hobby;


    public Person01(String name, int age, int height, String school, String hobby) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.school = school;
        this.hobby = hobby;
    }
}
