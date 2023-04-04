package com.zhenghou.baozhuag;


import java.util.Scanner;

/**
 * length()     获取字符串的长度
 * equals()     比较内容是否相等
 * toLowerCase()   将字符串转换为小写
 * toUpperCase()将字符串转换为大写
 * equalsIgnoreCase()  不区分大小写 进行比较
 *
 * indexof(int c)          获取一个字符串制定内容的下标
 * index(String value)
 * lastIndexof(int c)    获取字符串执行内容的最后一个下标
 * subString(int s)    截取制定内容到最后的内容
 * subString(int beginIndex,int endindex)   截取制定区间的内容
 * String trim()        去掉前后空格  ,中间的空格是不可以截取的
 *
 * split();   分割
 */

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件");
        String file = scanner.next();
        System.out.println("请输入邮箱");
        String emil = scanner.next();


        String[] a =file.split("\\.");
        String[] b = emil.split("@");
        String[] c = b[b.length-1].split("\\.");
       if("java".equals(a[a.length-1])&&c.length==2){
            System.out.println("success");
        }else {
            System.out.println("false");
        }


        int i = file.lastIndexOf(".");
        String m = file.substring(i+1);
        int j = emil.lastIndexOf("@");
        String n = emil.substring(j+1);
        String[] sp = n.split("\\.");


        if("java".equals(m)&&sp.length==2){
            System.out.println("success");
        }else {
            System.out.println("false");
        }





    }
}
