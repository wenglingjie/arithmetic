package com.wlj.net.two;

/**
 * Created by 翁铃杰
 * 15:26 2018/2/28
 */
public class twentyThree {
    public static void main(String[] args) {
        //直接求解
        int n=10;
        for(int i=1;i<5;i++){
            n=n+2;
        }
        System.out.println("第五个人" + n + "岁");
        //递归求解
        System.out.println("第五个的年龄为" + getAge(5));
    }
    //递归求解
    public static int getAge(int n) {
        if (n == 1) {
            return 10;
        }
        return 2 + getAge(n - 1);
    }
}
