import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */