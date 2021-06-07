package com.lemon.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class exam {
    public static void main(String[] args) {
//        请使用一种算法为下面的数组由小到大排序：int[] items =new int[]{1,3,5,7,9,2,4,6,8,0};
        int[] items =new int[]{11,12,10,1,3,5,7,9,2,4,6,8,0};
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length-i-1; j++) {
                int min = 0;
                if(items[j]>items[j+1]){
                    min = items[j+1];
                    items[j+1] = items[j];
                    items[j] = min;
                }
            }
        }

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);
        }

        //现有字符串”abcdefg”，要求：通过Java语言实现反转，实现后的效果”gfedcba”
        String string = "abcdefg";
        String newString = new StringBuffer(string).reverse().toString();
        System.out.println(newString);

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");;
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        removeDuplicate(list);
    }
    public static List removeDuplicate(List list) {
        HashSet h = new HashSet(list);
        System.out.println(h);
        list.clear();//删除所有元素
//        for( String h1: h){
//
//        }
        list.addAll(h);
        System.out.println(list);
        return list;
    }
}
