package com.wlj.net.two;

import java.util.Random;

/**
 * Created by 翁铃杰
 * 16:32 2018/2/28
 */
public class thirty {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = new int[12];
        Random r = new Random();
        for (int i = 0; i <= 10; i++)
            arr[i] = r.nextInt(1000);
        for (int i = 0; i <= 10; i++)
            System.out.print(arr[i] + "\t");
        for (int i = 0; i <= 9; i++)
            for (int k = i + 1; k <= 10; k++)
                if (arr[i] > arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
        System.out.println();
        for (int k = 0; k <= 10; k++)
            System.out.print(arr[k] + "\t");
        System.out.print("\n"+"-----------------------------------------------");
        arr[11] = r.nextInt(1000);
        for (int k = 0; k <= 10; k++)
            if (arr[k] > arr[11]) {
                temp = arr[11];
                for (int j = 11; j >= k + 1; j--)
                    arr[j] = arr[j - 1];
                arr[k] = temp;
            }
        System.out.println();
        for (int k = 0; k <= 11; k++)
            System.out.print(arr[k] + "\t");
    }
}
