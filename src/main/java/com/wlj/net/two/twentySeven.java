package com.wlj.net.two;

/**
 * Created by 翁铃杰
 * 16:15 2018/2/28
 */
public class twentySeven {
    public static void main(String[] args) {
        int j;
        for(int i=2;i<=100;i++){
            for(j=2;j<=i/2;j++){
                if(i%j==0)break;
            }
            if (j > i / 2)
                System.out.println(i + "是素数");
        }
    }
}
