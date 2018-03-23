package com.wlj.net.zero;

/**
 * Created by 翁铃杰
 * 10:58 2018/2/28
 */
public class ten {
    public static void main(String[] args) {
        double s1=0;
        double a=100;
        int i=1;
        do {
            s1+=a;
            a=a/2;
            s1+=a;
            System.out.println("第"+i+"次，反弹"+a+"米，共经过"+s1+"米");
            i++;
        }while (i<=10);

        double s = 0;
        double h = 100;
        for (int j = 1; j <= 10; j++) {
            s += h;
            h = h/2;
            s += h;
        }
        System.out.println("经过路程："+s);
        System.out.println("反弹高度："+h);
    }
}
