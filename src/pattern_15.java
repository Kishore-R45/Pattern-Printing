import java.util.Scanner;
public class pattern_15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<(n-i+1);j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

A B C D E
A B C D
A B C
A B
A

 */