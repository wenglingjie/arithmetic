package com.wlj.net.first;

/**
 * Created by 翁铃杰
 * 14:41 2018/2/28
 */
public class twenty {
    public static void main(String[] args) {
        float fm = 1.0f;
        float fz = 1.0f;
        float temp;
        float sum = 0f;
        for (int i = 0; i < 20; i++) {
            temp = fm;
            fm = fz;
            fz = fz + temp;
            System.out.println((int) fz + "/" + (int) fm);
            sum += fz / fm;
        }
        System.out.println(sum);
    }
}
