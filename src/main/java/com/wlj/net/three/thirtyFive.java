package com.wlj.net.three;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 17:57 2018/2/28
 */
public class thirtyFive {
    public static void main(String[] args) {
        int i, min=0, max=0, n, temp1, temp2;
        int a[];
        System.out.println("定义数组的长度:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("输入第" + (i + 1) + "个数据:");
            a[i] = in.nextInt();
        }

        for (i = 1; i < n; i++) {
            if (a[i] > a[max])
                max = i;
            if (a[i] < a[min])
                min = i;
        }

        temp1 = a[0];
        a[0] = a[max];
        a[max] = temp1;

        temp2 = a[min];

        if (min != 0) { // 如果最小值不是a[0]，执行下面
            a[min] = a[n - 1];
            a[n - 1] = temp2;
        } else {  //如果最小值是a[0],执行下面
            a[max] = a[n - 1];
            a[n - 1] = temp1;
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " " );
        }
    }
}
