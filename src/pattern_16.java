import java.util.Scanner;
public class pattern_16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

A
B B
C C C
D D D D
E E E E E

 */