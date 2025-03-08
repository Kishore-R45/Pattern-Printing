import java.util.Scanner;
public class pattern_10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        for(int i=0;i<2*n;i++){
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=0;j<stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

 */