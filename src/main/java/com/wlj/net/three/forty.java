package com.wlj.net.three;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 翁铃杰
 * 10:41 2018/3/1
 */
public class forty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("010102");
        list.add("010003");
        list.add("010201");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
