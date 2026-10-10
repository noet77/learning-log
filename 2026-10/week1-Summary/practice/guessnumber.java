import java.util.Scanner;
import java.util.Random;

public class guessnumber {
    public static void main(String[] args){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int randomNumber=random.nextInt(100)+1;
        System.out.println("---猜数字游戏---");
        System.out.print("猜数字游戏开始...(目标数字范围是1～100之间的整数)");
        while (true){
            System.out.println("请输入您的猜测：");
            int guess= sc.nextInt();
            if (guess>randomNumber){
                System.out.println("猜大了");
            } else if (guess<randomNumber) {
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
        sc.close();
    }
}