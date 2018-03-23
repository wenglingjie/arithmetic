package com.wlj.net.zero;

/**
 * Created by 翁铃杰
 * 10:42 2018/2/28
 */
public class nine {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int s=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    s+=j;
                }
            }
            if(s==i){
                System.out.print(i+" ");
            }
        }
    }
}
