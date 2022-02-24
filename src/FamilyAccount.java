import java.util.Scanner;

public class FamilyAccount {
    //readMenuSelection
    public static char readMenuSelection(){
        char ch;
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数字选择：");
        for(; ;){
            str = scan.next();
            ch = str.charAt(0);
            if (ch == '1' || ch == '2' || ch == '3' || ch == '4'){
                break;
            }else {
                System.out.print("输入数字错误，请重新输入：");
            }
        }
        return ch;
    }
    //readKeyBoard
    public static char readKeyBoard(){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = str.charAt(0);
        return ch;
    }

    //readConfirmSelection
    public static char readConfirmSelection(){
        char ch;
        for(; ;){
            ch = readKeyBoard();
            if(ch == 'Y' || ch == 'N'){
                break;
            }else {
                System.out.println("输入选择错误，请重新输入：");
            }
        }
        return ch;
    }

    public static void main(String[] args){
        /*
        * FamilyAccount
        * */
        for(; ;){
            System.out.println("FamilyAccount");
            System.out.println("-------------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            char ch = readMenuSelection();
            switch (ch){
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
            }
        }
    }
}
