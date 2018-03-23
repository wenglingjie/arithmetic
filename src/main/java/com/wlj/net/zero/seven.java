package com.wlj.net.zero;

import java.util.Scanner;

/**
 * Created by 翁铃杰
 * 10:24 2018/2/28
 */
public class seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串字符！");
        String str = in.nextLine();
        char[] ch=str.toCharArray();
        count use=new count();
        use.count(ch);
    }
}
class count{
    int digital,character,blank,other;
    public void count(char[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='0'&&arr[i]<='9'){
                digital++;
            }else if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')){
                character++;
            }else if(arr[i]==' '){
                blank++;
            }else{
                other++;
            }
        }
        System.out.println("数字个数："+digital);
        System.out.println("英文字母个数："+character);
        System.out.println("空格个数："+blank);
        System.out.println("其他字符个数："+other);
    }
}
