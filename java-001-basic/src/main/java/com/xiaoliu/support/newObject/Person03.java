package com.xiaoliu.support.newObject;

/**
 * javaBean
 */
public class Person03 {

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

    public Person03(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
