package com.wlj.net.two;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 16:23 2018/2/28
 */
public class twentyEight {
    public static void main(String[] args) {
        int arr[] = new int[11];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1; //得到10个100以内的整数
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
        System.out.print("\nPlease Input a int number:" );
        Scanner in = new Scanner(System.in);
        arr[10] = in.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
    }
}
