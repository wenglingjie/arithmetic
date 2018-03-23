package com.wlj.net.four;

/**
 * Created by 翁铃杰
 * 14:02 2018/3/1
 * 求0—7所能组成的奇数个数?
 */
public class fortyThree {
    public static void main(String[] args) {
        //暴力算法：
        int count = 0;
        String s;
        for (int i = 0; i < 100000000; i++) {
            s = "" + i;
            boolean flag = true;
            char[] c = s.toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (!fun(c[j])) {
                    flag = false;
                    break;
                }
            }
            if (flag && isJiShu(i)) {
                count++;
            }
            s = "";
        }
        System.out.println("共" + count + "个。");
        //数学算法：
        // 因为是奇数，所以个位只能是1，3，5，7共4种，前面可随便排列
        /*int count = 4;// 个位的4种
        // 2位时，十位有8种，个位4种，8×4
        // 3位时，8×8×4……
        for (int i = 1; i < 8; i++) {
            count = 8 * count;
            System.out.println("count:" + count);
        }*/
        //个人算法：
        /*int sum=4;
        int j;
        int s=32;
        System.out.println("组成1位数是 "+sum+" 个");
        sum=sum*7;
        System.out.println("组成2位数是 "+sum+" 个");
        for(j=3;j<=8;j++){
            sum=sum*8;
            s+=sum;
            System.out.println("组成"+j+"位数是 "+sum+" 个");
        }
        System.out.println("0-7组成奇数是总共 "+s+" 个");*/
    }
    public static boolean isJiShu(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean fun(char c) {
        if (c >= '0' && c <= '7') {
            return true;
        } else {
            return false;
        }
    }
}
