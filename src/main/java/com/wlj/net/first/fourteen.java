package com.wlj.net.first;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 13:18 2018/2/28
 */
public class fourteen {
    public static void main(String[] args) {
        System.out.println("请输入年,月,日：");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        Calendar cal = Calendar.getInstance();//取得一个Calendar的实例
        cal.set(year, month - 1, day);
        int sum = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println("这一天是这一年的第" + sum +"天");
    }
}