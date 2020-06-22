package com.atguigu.bin;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

    private String name;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    private String sex;

    @Override
    public String toString() {
        return "重写了构造器{}";
    }

    public HelloWorld() {
        System.err.println(toString() + "重新定义了申明");
    }

    public static final int a = 0;

    public static void main(String[] args) {
        HelloWorld world = new HelloWorld();
        world.setName("111");
        world.setSex("男");
        for (int i = 0; i < 9; i++) { //for循环快捷模板 fori

        }

        System.err.println(world.toString());
        SimpleDateFormat sim = new SimpleDateFormat("yyyyMMdd");
        Thread t3 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.err.println("你好");
                    }
                }
        );
        Date date = new Date();
        t3.start();
        try {
            t3.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main============");
        System.out.println("args = [" + args + "]"); //打印main参数，soutp快捷模板
    }

    //这是单行注释
    public void method() {
        StringBuffer s = new StringBuffer();
        System.err.println("");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}