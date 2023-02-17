package com.xiaoliu.support.newObject;

/**
 * 使用Person03 对象的客户端
 */
public class Client03 {

    public static void main(String[] args) {
        Person03 person03 = new Person03("xiaoliu",12);
        person03.setHeight(170);
        person03.setSchool("北京大学");
        person03.setHobby("读书");
    }
}
