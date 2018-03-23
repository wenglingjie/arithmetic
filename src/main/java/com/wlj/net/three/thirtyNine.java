package com.wlj.net.three;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 10:32 2018/3/1
 */
public class thirtyNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入n的值：");
        int n = in.nextInt();
        if (n % 2 == 0) { //偶数，1/2+1/4+...+1/n
            System.out.println(ouShu(n));
        } else { //奇数，1/1+1/3+...+1/n
            System.out.println(jiShu(n));
        }
    }

    public static float jiShu(int x){
        float sum=0;
        for(float i=1;i<=x; i = i + 2){
            if(i%2!=0){
                sum+=(1/i);
                System.out.println("1/"+i);
            }
        }
        return sum;
    }

    public static float ouShu(int x){
        float sum=0;
        for(float i=2;i<=x; i = i + 2){
            sum+=(1/i);
            System.out.println("1/"+i);
        }
        return sum;
    }
}
