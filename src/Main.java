import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int R = scn.nextInt();
        int W = scn.nextInt();
        if (v1==2 &&R<160 && W>=80)
        { System.out.println("追求"); }
        if (v1==1)
        {System.out.println("男性");}
        if (v1==2)
        {System.out.println("女性");}

        if (R>=160&&R<250&&W<80&&W>0)
        { System.out.println("放棄"); }
        else {
            System.out.println("輸入錯誤");
        }

        }
        }


