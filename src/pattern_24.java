import java.util.Scanner;

public class pattern_24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(((j*n)+a)+" ");
            }
            System.out.println();
            a++;
        }
    }
}

/*

Enter a number:
5

1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25


 */