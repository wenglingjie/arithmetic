package com.wlj.net.four;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 15:12 2018/3/1
 * 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5，
 * 然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
public class fortyEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个4位数字：");
        String str = in.next();
        if (!((str).matches("\\d{4}"))) {
            System.out.println("输入的不是4位数字！");
            System.exit(0);
        }

        char[] c = str.toCharArray();
        int[] a = new int[4];
        for(int i=0;i<4;i++){
          a[i]=((int)(c[i]-'0')+5)%10;
        }
        str="";
        for(int j=0;j<4;j++){
            str+=a[j];
        }
        System.out.println(str);
        int t=a[0];
        a[0]=a[3];
        a[3]=t;
        t=a[1];
        a[1]=a[2];
        a[2]=t;

        str="";
        for(int j=0;j<4;j++){
            str+=a[j];
        }
        System.out.println(str);
    }
}
