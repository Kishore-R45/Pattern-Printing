import java.util.Scanner;

public class pattern_23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
