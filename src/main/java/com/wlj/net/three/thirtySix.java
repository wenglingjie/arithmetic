package com.wlj.net.three;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 9:49 2018/3/1
 */
public class thirtySix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入数字个数n：");
        int n = in.nextInt();
        System.out.println("输入后移位数m：");
        int m = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            list.add(in.nextInt());
        }
        System.out.println("原数据排序为：");
        for (int t : list) {
            System.out.print(t + " ");
        }

        System.out.println();
        List<Integer> temp1 = list.subList(list.size() - m, list.size());
        List<Integer> temp2 = list.subList(0, list.size() - m);
        temp2.addAll(0, temp1);
        System.out.println("移动后排序为;");
        for (int t : temp2) {
            System.out.print(t + " ");
        }
    }
}
