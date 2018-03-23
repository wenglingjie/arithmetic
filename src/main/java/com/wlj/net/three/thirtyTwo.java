package com.wlj.net.three;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 17:08 2018/2/28
 */
public class thirtyTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个7位以上的正整数：");
//        String str = in.nextLine();
//        System.out.println(str.substring(3,7));
        long b = in.nextLong();
        int a = (int) (b % 10000);
        System.out.println(a);
    }
}
