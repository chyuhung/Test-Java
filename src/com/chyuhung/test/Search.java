package com.chyuhung.test;

/**
 * @ Description 二分查找练习
 * @ Author 97759 Email:977599667@qq.com
 * @ Version
 * @ Date 2022/3/17 16:15
 */
public class Search {
    public static void main(String[] args){
        int[] numList = {-50,-43,-32,-25,-20,-15,-10,-7,-1,0,2,6,8,15,18,24,35,46,58};
        int dest = -2;
        int headPoint = 0;
        int endPoint = numList.length - 1;//18
        int middlePoint;
        boolean isFlag = true;
        while (headPoint <= endPoint){
            middlePoint = (endPoint + headPoint) / 2;//9 //4 //1
            if( dest == numList[middlePoint]){
                isFlag = false;
                System.out.println("找到,下标是" + middlePoint);
                break;
            }else if(dest < numList[middlePoint]){
                endPoint = middlePoint -1;//8
            }else if(dest > numList[middlePoint]){
                headPoint = middlePoint + 1;//5
            }
        }
        if(isFlag){
            System.out.println("没有找到");
        }
    }

}
