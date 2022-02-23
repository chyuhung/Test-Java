
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("Input Score:");
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        System.out.println(score);
        
        if(score == 100){
            System.out.println("BWM");
        }else if(score > 80 && score <= 99){
            System.out.println("Iphone");
        }else if(score >= 60 && score < 80){
            System.out.println("Ipad");
        }else if(score < 60 && score >= 0){
            System.out.println("Nothing");
        }else {
            System.out.println("NO");
        }
    }
}
