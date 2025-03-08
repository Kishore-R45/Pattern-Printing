import java.util.Scanner;
public class pattern_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */