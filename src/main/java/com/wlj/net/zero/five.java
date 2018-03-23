package com.wlj.net.zero;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 9:58 2018/2/28
 */
public class five {
    public static void main(String[] args) {
        System.out.println("请输入N的值：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(a>=90?"A":(a>=60?"B":"C"));
    }
}
