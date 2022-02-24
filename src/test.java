import java.util.Scanner;

public class test {
    public static void main(String[] args){
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
        System.out.println(num);
    }
}
