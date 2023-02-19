package com.xiaoliu.support.builderPattern;

import lombok.Data;

import java.util.Date;

@Data
public class User1 {

    // 真正的属性都是不可变的
    private final int id;
    private final String name;
    private final String job;
    private final String address;
    private final Date birthday;

    // 私有构造方法，只被 Builder 类调用
    private User1(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.job = builder.job;
        this.address = builder.address;
        this.birthday = builder.birthday;
    }

    public static class Builder {

        //必须参数
        private int id;
        private String name;
        private Date birthday;

        // 可选参数
        private String job;
        private String address;

        public Builder(int id, String name, Date birthday) {
            this.id = id;
            this.name = name;
            this.birthday = birthday;
        }
        //使用设置好的参数值新建 OperateLog 对象
        public User1 build(){
            return new User1(this);
        }

        // 每个 setter 方法都返回当前的对象，做到链式调用
        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
    }
}