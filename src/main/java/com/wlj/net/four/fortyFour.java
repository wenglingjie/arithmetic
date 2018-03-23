package com.wlj.net.four;

/**
 * Created by 翁铃杰
 * 14:37 2018/3/1
 * 题目：一个偶数总能表示为两个素数之和。
 *（注：哥德巴赫猜想是想证明对任何大于6的自然数n之内的所有偶数可以表示为两个素数之和）
 */
public class fortyFour {
    public static void main(String[] args) {
        // 求了下100以内的情况
        for (int i = 0; i < 100; i = i + 2) {
            for (int j = 0; j <= (i + 1) / 2; j++) {
                if (isSuShu(j) && isSuShu(i - j)) {
                    System.out.println(i + "=" + j + "+" + (i - j));
                }
            }
        }
    }

    public static boolean isSuShu(int x) {
        if (x == 0 || x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
