package com.zhenghou.baozhuag;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        username=scanner.next();
        System.out.println("请输入密码");
        password=scanner.next();
        if(password.length()>=6 && username.length()>=3) {
            System.out.println("请再次输入密码");
            String passwrd2=scanner.next();
            if(password.equals(passwrd2)){
                System.out.println("注册成功");
                //登录
                String username3;
                System.out.println("请输入用户名");
                username3=scanner.next();
                String password3;
                System.out.println("请输入密码");
                password3=scanner.next();
                if(password.equals(password3)&&username3.equals(username))
                    System.out.println("登录成功");
                else
                    System.out.println("登录失败");
            }

            else
                System.out.println("密码不一致，注册失败");
        }else{
            System.out.println("长度不够");
        }



    }
}
