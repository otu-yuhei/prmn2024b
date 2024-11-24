package lecture02;

public class Keisan {

    int goukei(int[] num){
        int sum = 0;
        for(int j=0;j<num.length;j++){
            sum += num[j];
        }
        return sum;
    }

    void judg(int sum){
        if(sum >= 100){
            System.out.println("great!");
        }else if(sum >= 50){
            System.out.println("big!");
        }else{
            System.out.println("small!");
        }
    }
}
