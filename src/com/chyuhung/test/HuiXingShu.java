package com.chyuhung.test;

import java.util.Scanner;

/**
 * @ Description 回形数练习
 * 1
 *
 * 1 2
 * 4 3
 *
 * 1 2 3
 * 8 9 4
 * 7 6 5
 *
 * 1  2  3  4
 * 12 13 14 5
 * 11 16 15 6
 * 10 9  8  7
 *
 * 1  2  3  4  5
 * 16 17 18 19 6
 * 15 24 25 20 7
 * 14 23 22 21 8
 * 13 12 11 10 9
 *
 *
 * @ Author 97759 Email:977599667@qq.com
 * @ Version v0.1
 * @ Date 2022/3/2 10:16
 */
public class HuiXingShu {
    public static void main(String[] args) {
        System.out.println("给定n:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //max
        int maxY = num - 1;
        int maxX = num - 1;
        //min
        int minY = 0;
        int minX = 0;
        //创建数组
        int[][] huiXingShu = new int[maxX][maxY];
        //遍历
        int count = 1;
        //遍历算法，依次东南西北访问
        for(int i = 0;i < num ; i ++){
            for (int j = 0;j < num * num;j ++){
                if(i % num == 0){
                    if(j <= maxX){
                        huiXingShu[i][j] = j + 1;
                    }
                }else if(i % num == 1){

                }else if(i % num == 2){

                }else if(i % num == 3){

                }
            }
        }


        for (int i = 0;i < num;i++){
            for (int j = 0;j < num;j ++){
                System.out.print(huiXingShu[i][j]);
            }
            System.out.println();
        }

    }

}
