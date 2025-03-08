import java.util.Scanner;
public class pattern_17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print("  ");
            }
            int mid=(2*i+1)/2;
            int c=65;
            for(int j=0;j<(2*i+1);j++){
                System.out.print((char)c+" ");
                if(j<mid){
                    c++;
                }else{
                    c--;
                }
            }
            for(int j=0;j<(n-i-1);j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number:
5
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
 */