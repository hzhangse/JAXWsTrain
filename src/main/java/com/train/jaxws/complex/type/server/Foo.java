package com.train.jaxws.complex.type.server;

/**
 * Created by IntelliJ IDEA.
 *
 *
 */
public class Foo {
    private String name;
    private String sex;

    public Foo() {
    }

    public Foo(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
