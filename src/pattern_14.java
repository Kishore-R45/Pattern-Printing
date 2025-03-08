import java.util.Scanner;
public class pattern_14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

A
A B
A B C
A B C D
A B C D E
 */
