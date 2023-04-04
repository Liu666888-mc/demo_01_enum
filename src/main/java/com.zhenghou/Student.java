package com.zhenghou;

public class Student {
    private Gender sex;

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Stident{" +
                "sex=" + sex +
                '}';
    }
}
