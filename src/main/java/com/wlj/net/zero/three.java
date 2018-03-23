package com.wlj.net.zero;

/**
 * Created by 翁铃杰
 * 17:52 2018/2/27
 */
public class three {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int a = i/100;
            int b = (i%100)/10;
            int c = i%10;
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}
