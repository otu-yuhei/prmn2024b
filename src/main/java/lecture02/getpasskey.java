package lecture02;
import java.util.Scanner;

public class getpasskey {
    String[][] passkey = new String[5][2];
    Scanner input = new Scanner(System.in);

    void get() {
        passkey[0][0] = "B19821224";
        passkey[0][1] = "Green";
        passkey[1][0] = "B19801126";
        passkey[1][1] = "Blue";
        passkey[2][0] = "B19820125";
        passkey[2][1] = "Red";
        passkey[3][0] = "B19830617";
        passkey[3][1] = "Yellow";
        passkey[4][0] = "B19830830";
        passkey[4][1] = "Purple";
    }


    void Check_Gakuseki(String gakuseki){

        for(int i=0;i<5;i++){
            if(passkey[i][0].equals(gakuseki)){
                Check_Pass(i);
            }
        }
        System.out.println("error!");
        System.exit(0);
    }

    void Check_Pass(int i){

        System.out.print("パスワードを入力:");
        String pass = input.next();

        if(passkey[i][1].equals(pass)){
            System.out.println("ログイン成功");
            System.exit(0);
        }else{
            System.out.println("不正なアクセス");
            System.exit(0);
        }
    }
}
