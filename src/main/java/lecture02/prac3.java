package lecture02;
import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        getpasskey gps = new getpasskey();
        gps.get();

        for (int i = 0; i < 5; i++) {
            System.out.print("学籍番号を入力:");
            String gakuseki = input.next();
            gps.Check_Gakuseki(gakuseki);
        }
    }
}
