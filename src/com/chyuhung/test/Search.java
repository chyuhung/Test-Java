package com.chyuhung.test;

/**
 * @ Description 二分查找练习
 * @ Author 97759 Email:977599667@qq.com
 * @ Version
 * @ Date 2022/3/17 16:15
 */
public class Search {
    public static void main(String[] args){
        int[] numList = {-50,-43,-32,-25,-20,-15,-10,-7,-1,0,-2,6,8,15,18,24,35,46,58};
        int dest = -1;
        int headPoint = 0;
        int endPoint = numList.length - 1;
        int middlePoint = numList.length / 2;
        boolean isFlag = true;
        for (int i =0 ;i < numList.length;i ++){
            if( dest > numList[middlePoint]){
                middlePoint = middlePoint + ((endPoint - middlePoint) / 2);
            }else if(dest < numList[middlePoint]){
                endPoint = middlePoint;
                middlePoint = (endPoint - headPoint) /2;
            }else if(dest == numList[middlePoint]){
                System.out.println("OK,索引是"+ middlePoint);
                isFlag = false;
            }
            if(isFlag){
                System.out.println("没有找到");
                break;
            }
        }
    }

}
