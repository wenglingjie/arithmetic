package com.wlj.net.two;

/**
 * Created by 翁铃杰
 * 15:04 2018/2/28
 */
public class twentyOne {
    public static void main(String[] args) {
        long sum = 0;
        long fac = 1;
        for (int i = 1; i <= 20; i++) {
            fac = fac * i;
            sum += fac;
        }
        System.out.println(sum);
    }
}
