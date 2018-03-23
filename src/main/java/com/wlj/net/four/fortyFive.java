package com.wlj.net.four;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 14:45 2018/3/1
 * 1）判断几个9能被一个素数整除。（2）判断一个整数能被几个9整除。（原题：一个素数能被几个9整除）
 */
public class fortyFive {
    public static void main(String[] args) {
        System.out.println("判断几个9能被一个素数整除?");
        f1();
        System.out.println("-----------------------------------------------------------");
        System.out.println("判断一个整数能被几个9整除?");
        f2();
    }
    public static void f1(){
        int[] a = new int[100];
        int n = 0;
        int num = 0;
        // 长度100的素数数组
        while (n < 100) {
            if (isSuShu(num)) {
                a[n] = num;
                n++;
                num++;
            } else {
                num++;
            }
        }
        /* for (int t : a) {
         System.out.println(t);
         }*/
        String s = "9";
        int index = 0;
        while (s.length() < 9) {
            if (new Integer(s).intValue() % a[index] == 0) {
                System.out.println(s + "%" + a[index] + "=0");
                if (index < 100 - 1) {
                    index++;
                } else {
                    index = 0;
                    s = s + "9";
                }
                // System.exit(0);
            } else {
                if (index < 100 - 1) {
                    index++;
                } else {
                    index = 0;
                    s = s + "9";
                }
            }
        }
    }

    public static void f2(){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = in.nextInt();
        int tmp = num;
        int count = 0;
        for(int i = 0 ; tmp%9 == 0 ;){
            tmp = tmp/9;
            count ++;
        }
        System.out.println(num+" 能够被 "+count+" 个9 整除。");
    }

    public static boolean isSuShu(int x) {
        if (x == 0 || x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
