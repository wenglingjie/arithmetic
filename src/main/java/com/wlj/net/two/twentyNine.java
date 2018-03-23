package com.wlj.net.two;

/**
 * Created by 翁铃杰
 * 16:28 2018/2/28
 */
public class twentyNine {
    public static void main(String[] args) {
        double sum = 0;
        int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 7, 8 } };
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    sum = sum + array[i][j];
            }
        System.out.println(sum);
    }
}
