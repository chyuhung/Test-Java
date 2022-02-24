public class P109_107 {
    public static void main(String[] args){
        for(int i = 1;i <= 10;i++){
            //System.out.println(i);
            switch (i%2){
                case 0:
                    System.out.println(i + " is xx");
                    break;
                case 1:
                    System.out.println(i + " is x");
                    break;
            }
        }
    }
}
