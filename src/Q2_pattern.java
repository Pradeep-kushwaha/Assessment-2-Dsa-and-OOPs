import java.util.Scanner;
public class Q2_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n=sc.nextInt();
        patternit(n);
    }
    public static void patternit(int n) {
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
                 for (int j = 1; j <=(n-i)*2-1; j++)  //for print the spaces
                 {
                     System.out.print("  ");
                 }
                 for(int j=i;j>=1;j--)  //for the print column, left-side to  spaces
                 {
                     if (j==n) {
                         continue;
                 }
                     System.out.print(j+" ");
                 }
                 System.out.println();
        }
    }
}
