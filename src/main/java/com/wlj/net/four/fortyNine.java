package com.wlj.net.four;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 16:31 2018/3/1
 * 题目：计算字符串中子串出现的次数。
 */
public class fortyNine {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入主串：");
        String str1 = in.nextLine();
        System.out.println("请输入子串：");
        String str2 = in.nextLine();
        // 生成子串长度的N个字符串数组
        String[] sa = new String[str1.length() - str2.length() + 1];
        for(int i=0;i<sa.length;i++){
            sa[i]=str1.substring(i,i+str2.length());
        }
        int sum = 0;
        // 子串与N个拆开的子串比对
        for (int i = 0; i < sa.length; i++) {
            if (sa[i].equals(str2)) {
                // 成功配对，计数器+1；
                sum++;
                // 因为不计算重叠的子串，所以跳过配对之后的部分拆分子串
                i = i + str2.length();
            }
        }
        System.out.println("主串中共包含" + sum + "个字串");
    }
}
