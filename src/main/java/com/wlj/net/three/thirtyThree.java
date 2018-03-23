package com.wlj.net.three;

/**
 * Created by 翁铃杰
 * 17:35 2018/2/28
 */
public class thirtyThree {
    public static void main(String[] args) {
        int i, j;
        int a[][];
        int n = 10;
        a = new int[n][n];
        for (i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][0] = 1;
        }
        for (i = 2; i < n; i++) {
            for (j = 1; j <= i - 1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
