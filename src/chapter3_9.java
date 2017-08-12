package com.company;
import java.util.*;

/**
 * Created by 17032361 on 2017/8/8.
 * switch多分支结构
 * 支持int与char 类型
 */
public class chapter3_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的名次");
        int mingci = in.nextInt();

        switch (mingci){
            case 1:
            System.out.println("出任武林盟主");
            break;

            case 2:
            System.out.println("出任武当掌门");
            break;

            case 3:
            System.out.println("出任峨眉掌门");
            break;

            default:
            System.out.println("逐出师门！");
        }
    }
}
