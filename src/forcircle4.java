import java.util.Scanner;

public class forcircle4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char ch = scn.next().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
