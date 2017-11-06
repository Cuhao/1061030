import java.util.Scanner;

public class forcircle6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();

        for (int i =1;i<=n;i++){
            for (int j =1 ; j<=a; j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}