package com.wlj.net.first;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 13:42 2018/2/28
 */
public class fifteen {
    public static void main(String[] args) {
        System.out.println("请输入x,y,z三个整数！");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int k;
        if(x>y){k=x;x=y;y=k;}
        if(x>z){k=x;x=z;z=k;}
        if(y>z){k=y;y=z;z=k;}
        System.out.println(x+" "+y+" "+z);
    }
}
