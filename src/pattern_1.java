import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */