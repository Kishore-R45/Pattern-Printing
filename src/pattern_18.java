import java.util.Scanner;
public class pattern_18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        int c=n+65;
        for(int i=1;i<=n;i++){
            c=c-i;
            for(int j=1;j<=i;j++) {
                System.out.print((char) (c) + " ");
                c++;
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

E
D E
C D E
B C D E
A B C D E
 */