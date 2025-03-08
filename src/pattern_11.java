import java.util.Scanner;
public class pattern_11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int num=((i+j)%2==0)?1:0;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */