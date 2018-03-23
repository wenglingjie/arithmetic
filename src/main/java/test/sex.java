package test;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 10:13 2018/2/28
 */
public class sex {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i=a;//从大到小，第一次求出来的公约数就是最大公约数
        //如果不能同时整除两个数，则不是公约数
        while((a%i!=0)||(b%i!=0))
        {
            i--;
        }
        System.out.println(i);
    }
}
