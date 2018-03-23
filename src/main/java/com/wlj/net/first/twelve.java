package com.wlj.net.first;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 11:22 2018/2/28
 */
public class twelve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入当月利润(万元)");
        Integer lirun = in.nextInt();
        double sum=0;
        if(lirun<=10)sum=lirun*0.1;
        else if(lirun>10)sum=(lirun-10)*0.075+10*0.1;
        else if(lirun>20)sum=(lirun-20)*0.05+10*0.075+10*0.1;
        else if(lirun>40)sum=(lirun-40)*0.05+20*0.03+10*0.075+10*0.1;
        else if(lirun>60)sum=(lirun-60)*0.15+20*0.05+20*0.03+10*0.075+10*0.1;
        else if(lirun>100)sum=(lirun-100)*0.01+40*0.15+20*0.05+20*0.03+10*0.075+10*0.1;
        System.out.println("应发的奖金是："+sum+"(万元)");
    }
}
