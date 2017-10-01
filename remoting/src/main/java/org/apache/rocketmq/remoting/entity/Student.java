package org.apache.rocketmq.remoting.entity;

public class Student {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String id;
    private int age;

    public Student() {
    }

    public Student(String id, int age) {
        this.id = id;
        this.age = age;
    }
}
