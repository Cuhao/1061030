import java.util.Scanner;

public class ddasd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int score =scn.nextInt();
        if (score<=100&&score>=0){
            if (score>=90){
                System.out.println("A");
            }
            if (90>score && score>=80){
                System.out.println("B");
            }
            if (80>score && score>=70){
                System.out.println("C");
            }
            if (70>score && score>=60){
                System.out.println("D");
            }else{
                System.out.println("fail");
            }


        }else{
            System.out.println("error");
        }

    }
}