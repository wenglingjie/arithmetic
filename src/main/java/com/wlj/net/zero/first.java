package com.wlj.net.zero;

/**
 * Created by 翁铃杰
 * 17:00 2018/2/27
 */
public class first {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++){
            System.out.println(f(i));
        }
    }

    public static int f(int x){
        if(x==1||x==2){
            return 1;
        }else {
            return f(x-1)+f(x-2);
        }

    }
}
