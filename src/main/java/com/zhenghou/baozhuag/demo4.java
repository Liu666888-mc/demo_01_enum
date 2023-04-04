package com.zhenghou.baozhuag;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        str=scanner.next();
        char[] a=str.toCharArray();
        System.out.println("请输入字符");
        char m=scanner.next().charAt(0);
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(m==a[i])
                count++;
        }
        System.out.println(count);
    }
}
