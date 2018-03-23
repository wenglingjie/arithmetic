package com.wlj.net.first;

/**
 * Created by 翁铃杰
 * 13:11 2018/2/28
 */
public class thirteen {
    public static void main(String[] args) {
        for(int x=1;x<100000;x++){
            if(Math.sqrt(x+100)%1==0)
                if(Math.sqrt(x+100+168)%1==0)
                    System.out.println(x+"加上100后是一个完全平方数，加上168又是一个完全平方数");
        }
    }
}
