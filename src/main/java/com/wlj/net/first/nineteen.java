package com.wlj.net.first;

/**
 * Created by 翁铃杰
 * 14:29 2018/2/28
 */
public class nineteen {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int k=1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i>=1;i--){
            for(int k=1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
