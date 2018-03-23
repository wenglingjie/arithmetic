package com.wlj.net.zero;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 9:42 2018/2/28
 */
public class four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int a = in.nextInt();
        fenjie(a);
    }

    public static void fenjie(int a){
        for(int i=2;i<=a;i++){
            if(a%i==0){
                System.out.print(i);
                if(a!=i){
                    System.out.print("*");
                }
                fenjie(a/i);
            }
        }
        System.exit(0);
    }
}
