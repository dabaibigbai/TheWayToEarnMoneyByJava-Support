package com.xiaoliu.support.newObject;

/**
 * Builder 方式
 */
public class Person04 {

    // 姓名(必填)
    private final String name;

    // 年龄(必填)
    private final int age;

    // 身高(选填)
    private final int height;

    // 学校(选填)
    private final String school;

    // 爱好(选填)
    private final String hobby;

    /**
     * 这个私有构造函数的作用:
     * 1、成员变量的私有化，final 类型的变量必须进行初始化，否则无法编译成功
     * 2、私有构造函数能够保证该对象无法从外部创建，并且person类无法被继承
     * @param name
     * @param age
     * @param height
     * @param school
     * @param hobby
     */
    private Person04(String name, int age, int height, String school, String hobby) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.school = school;
        this.hobby = hobby;
    }

    public void doSomeThing(){
        //todo do what you want!
    }

    /**
     * 构建器
     * 为什么Builder是内部静态类？
     * 1、必须是person的内部类，否则，由于Person的构造函数私有，不能通过new的方式创建对象；
     * 2、必须是静态类，由于Person对象无法从外部创建，如果不是静态类，则外部无法引用Builder对象；
     * 注意：Builder的内部成员变量要与Person的成员变量保持一致
     */
    public static class Builder{

        // 【这里成员变量不能是final的】
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

        public Builder(String name,int age){
            this.name = name;
            this.age = age;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Builder setHobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        /**
         * 构建对象
         * 返回待够贱的对象本身
         * @return
         */
        public Person04 build(){
            return new Person04(name,age,height,school,hobby);
        }
    }
}
