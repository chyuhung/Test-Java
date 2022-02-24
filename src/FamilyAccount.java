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
            }

        }
        return num;
    }

    public static void main(String[] args){
        /*
        * FamilyAccount
        * */
        start:for(; ;){
            System.out.println("FamilyAccount");
            System.out.println("-------------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.print("请输入数字选择（1-4）：");
            char ch = readMenuSelection();
            switch (ch){
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    System.out.println("确认退出（Y/N）?");
                    char isExit = readConfirmSelection();
                    if(isExit == 'Y'){
                        break start;
                    }
                    break;
            }
        }
    }
}
