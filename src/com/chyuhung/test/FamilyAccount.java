package com.chyuhung.test;

import java.util.Scanner;

public class FamilyAccount {
    //readMenuSelection
    public static char readMenuSelection(){
        char ch;
        for(; ;){
            ch = readKeyBoard();
            if (ch == '1' || ch == '2' || ch == '3' || ch == '4'){
                break;
            }else {
                System.out.print("输入数字错误，请重新输入（1-4）：");
            }
        }
        return ch;
    }
    //readKeyBoard
    public static char readKeyBoard(){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        return str.charAt(0);
    }

    //readConfirmSelection
    public static char readConfirmSelection(){
        char ch;
        for(; ;){
            ch = readKeyBoard();
            if(ch == 'Y' || ch == 'N'){
                break;
            }else {
                System.out.println("输入选择错误，请重新输入（Y/N）：");
            }
        }
        return ch;
    }
    public static double readNumber(){
        double num;
        Scanner scan = new Scanner(System.in);
        for(; ; ){
            try {
                num = scan.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("输入数字错误，请重新输入：");
                //清除缓存
                scan.next();
            }
        }
        return num;
    }

    public static String readString(){
        String str;
        Scanner tempScanner = new Scanner(System.in);
        String tempString = tempScanner.nextLine();
        Scanner scan = new Scanner(tempString);
        do {
            str = scan.next();
        } while(scan.hasNext());
        return str;
    }

    public static void main(String[] args){
        /*
        * com.chyuhung.test.FamilyAccount
        * */
        //
        String details = "收支" + "\t" + "金额" + "\t" + "账户余额" + "\t" + "说明" + "\n";
        double accountMoney = 0;

        start:for(; ;){
            System.out.println("com.chyuhung.test.FamilyAccount");
            System.out.println("-------------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.print("请输入数字选择（1-4）：");
            char ch = readMenuSelection();
            switch (ch) {
                case '1' -> System.out.println(details);
                case '2' -> {
                    System.out.println("本次收入金额：");
                    //处理收入
                    double inMoney = readNumber();
                    accountMoney += inMoney;
                    System.out.println("本次收入说明：");
                    String inInfo = readString();
                    details += "收入" + "\t" + inMoney + "\t" + accountMoney + "\t" + inInfo + "\n";
                    System.out.println(details);
                }
                case '3' -> {
                    System.out.println("本次支出金额：");
                    double outMoney = readNumber();
                    //处理支出
                    if (outMoney <= accountMoney) {
                        accountMoney -= outMoney;
                    } else {
                        System.out.println("账户余额不足！记账失败！");
                        break;
                    }
                    System.out.println("本次支出说明：");
                    String outInfo = readString();
                    details += "支出" + "\t" + outMoney + "\t" + accountMoney + "\t" + outInfo + "\n";
                    System.out.println(details);
                }
                case '4' -> {
                    System.out.println("确认退出（Y/N）?");
                    char isExit = readConfirmSelection();
                    if (isExit == 'Y') {
                        break start;
                    }
                }
            }
        }
    }
}
