import java.util.Scanner;

public class forcircle2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a<=b){
            for (int i =a ; i <=b;i++)
            {
                sum=sum+i;
            }
        }else {
            for (int i =a;i>=b;i--){
                sum=sum+i;
            }
        }

        System.out.println(sum);

    }
}
