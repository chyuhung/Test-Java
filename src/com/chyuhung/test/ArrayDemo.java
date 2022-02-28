package com.chyuhung.test;

import java.util.Scanner;

/**
 * @ Description 根据输入的学生成绩判定学生成绩等级
 * @ Author 97759 Email:977599667@qq.com
 * @ Version v0.1
 * @ Date 2022/2/28 11:31
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //读取人数
        System.out.println("请输入学生人数：");
        Scanner scan = new Scanner(System.in);
        int studentNum = scan.nextInt();
        //创建成绩数组
        Double[] scoreList = new Double[studentNum];
        //读取学生成绩
        for(int i =0; i < scoreList.length; i ++){
            System.out.println("请输入第" + (i+1) + "位学生的成绩：");
            scoreList[i] = scan.nextDouble();
        }
        //判定成绩等级
        for (int i = 0; i < scoreList.length; i ++){
            if (scoreList[i] >= 90 && scoreList[i] <= 100){
                System.out.println("第" + (i+1) + "位学生的成绩等级为A。");
            }else if (scoreList[i] >= 70 && scoreList[i] < 90){
                System.out.println("第" + (i+1) + "位学生的成绩等级为B。");
            }else if (scoreList[i] >= 60 && scoreList[i] < 70){
                System.out.println("第" + (i+1) + "位学生的成绩等级为C。");
            }else if (scoreList[i] >= 0 && scoreList[i] < 60){
                System.out.println("第" + (i+1) + "位学生的成绩等级为D。");
            }
        }
        //查找最高分
        double maxScore = 0;
        for (int i = 0; i < scoreList.length -1 ; i ++ ){
            if( scoreList[i] > scoreList [i+1]){
                maxScore = scoreList[i];
            }else {
                maxScore = scoreList[i+1];
            }
        }
        System.out.println("最高分是：" + maxScore);
    }
}
