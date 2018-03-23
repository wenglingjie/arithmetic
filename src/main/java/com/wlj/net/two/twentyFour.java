package com.wlj.net.two;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 15:31 2018/2/28
 */
public class twentyFour {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        if (a < 0 || a >= 100000) {
            System.out.println("Error Input, please run this program Again!");
            System.exit(0);
        }
        if (a >= 0 && a <= 9) {
            System.out.println(a + "是一位数");
            System.out.println("按逆序输出是:"  + a);
        } else if (a >= 10 && a <= 99) {
            System.out.println(a + "是二位数");
            System.out.println("按逆序输出是:");
            converse(a);
        } else if (a >= 100 && a <= 999) {
            System.out.println(a + "是三位数");
            System.out.println("按逆序输出是:");
            converse(a);
        } else if (a >= 1000 && a <= 9999) {
            System.out.println(a + "是四位数");
            System.out.println("按逆序输出是:");
            converse(a);
        } else if (a >= 10000 && a <= 99999) {
            System.out.println(a + "是五位数");
            System.out.println("按逆序输出是:");
            converse(a);
        }
        /*System.out.println("输入一个不多于5位的正整数！");
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
        System.out.println(b+"是"+b.length()+"位数");
        StringBuffer buf = new StringBuffer(b);
        System.out.println(buf.reverse());*/
    }
    public static void converse(long l) {
        String s = Long.toString(l);
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
