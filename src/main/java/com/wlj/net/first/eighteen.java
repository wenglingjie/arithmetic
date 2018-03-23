package com.wlj.net.first;

/**
 * Created by 翁铃杰
 * 14:20 2018/2/28
 */
public class eighteen {
    static char[] m = { 'a', 'b', 'c' };
    static char[] n = { 'x', 'y', 'z' };
    public static void main(String[] args) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if(m[i]=='a'&&n[j]=='x'){
                    continue;
                }else if(m[i] == 'a' && n[j] == 'y'){
                    continue;
                }else if ((m[i] == 'c' && n[j] == 'x')
                        || (m[i] == 'c' && n[j] == 'z')) {
                    continue;
                } else if ((m[i] == 'b' && n[j] == 'z')
                        || (m[i] == 'b' && n[j] == 'y')) {
                    continue;
                } else {
                    System.out.println(m[i] + " vs " + n[j]);
                }
            }
        }
    }
}


