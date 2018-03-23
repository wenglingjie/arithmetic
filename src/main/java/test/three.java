package test;

/**
 * Created by 翁铃杰
 * 9:34 2018/2/28
 */
public class three {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            f(i);
        }
    }

    public static void f(int x){
        int a = x/100;
        int b = (x%100)/10;
        int c = x%10;
        if(x==a*a*a+b*b*b+c*c*c){
            System.out.println(x);
        }
    }
}
