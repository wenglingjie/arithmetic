package test;

/**
 * Created by 翁铃杰
 * 9:29 2018/2/28
 */
public class two {
    public static void main(String[] args) {
        for(int i=101;i<=200;i++){
            f(i);
        }
    }

    public static void f(int x){
        boolean flag = true;
        for(int j=2;j<x;j++){
            if(x%j==0) {
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println(x);
        }
    }
}
