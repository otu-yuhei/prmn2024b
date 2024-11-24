package lecture02;
import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        int []num = new int[5];
        int x = 0;
         Scanner scan = new Scanner(System.in);
         for (int i = 0; i < 5; i++) {
             System.out.print("数字"+i +"つ目:");
             num[i] = scan.nextInt();
             System.out.println("");
         }

         Keisan ken = new Keisan();
         int sum = ken.goukei(num);
         System.out.println("合計計:"+sum);
         ken.judg(sum);
    }
}
