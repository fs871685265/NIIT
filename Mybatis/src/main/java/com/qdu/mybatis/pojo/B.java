package com.qdu.mybatis.pojo;

public class B {
    private int id;
    private String name;

    public B(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public B() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
