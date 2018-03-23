package com.wlj.net.zero;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 10:05 2018/2/28
 */
public class sex {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("请再输入一个正整数：");
        int b = in.nextInt();
        commonDivisor use=new commonDivisor();
        int m=use.commonDivisor(a,b);
        int n=a*b/m;
        System.out.println("最大公约数："+m);
        System.out.println("最小公倍数："+n);
    }
}
class commonDivisor{
    public int commonDivisor(int x,int y){
        if(x<y){
            int t=x;
            x=y;
            y=t;
        }
        while(y!=0){
            if(x==y)return x;
            else{
                int k=x%y;
                x=y;
                y=k;
            }
        }
        return x;
    }
}
