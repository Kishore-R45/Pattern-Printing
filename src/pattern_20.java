import java.util.Scanner;
public class pattern_20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<(2*n)-(2*i);j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("* ");
            }
            for(int j=0;j<(2*i+2);j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Enter a number:
5

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
 */
