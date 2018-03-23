package com.wlj.net.zero;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 10:30 2018/2/28
 */
public class eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = in.nextInt();
        System.out.println("请输入n个数");
        int n = in.nextInt();
//        int s = 0,t=0;
//        for (int i = 1; i <= n; i++) {
//            t += a;
//            a = a*10;
//            s += t;
//        }
//        System.out.println(s);
        f(a,n);
    }
    public static void f(int a,int n){
        String c="";
        int sum=0;
        for(int i=1;i<=n;i++){
            c+=a;
            sum +=Integer.parseInt(c);
            if(i==n){
                System.out.println(c);
            }else {
                System.out.print(c+"+");
            }
        }
        System.out.println(sum);
    }
}
