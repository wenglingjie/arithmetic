package com.wlj.net.two;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 15:18 2018/2/28
 */
public class twentyTwo {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + "的阶乘为：" + f(n));
    }

    public static long f(int x){
        long value = 0;
        if(x==1||x==0){
            value=1;
        }else if(x>1){
            value = f(x-1)*x;
        }
        return value;
    }
}
