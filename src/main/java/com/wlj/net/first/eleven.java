package com.wlj.net.first;

/**
 * Created by 翁铃杰
 * 11:16 2018/2/28
 */
public class eleven {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(i!=j && j!=k && k!=i){
                        count++;
                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }
        System.out.println("共"+ count +"个三位数");
    }
}
