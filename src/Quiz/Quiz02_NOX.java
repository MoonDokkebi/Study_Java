package Quiz;

import java.util.Scanner;

public class Quiz02_NOX {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if (n%2==0){
            for(int i=0; i<n; i++){
                for(int j =0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
            for(int i=0; i<n; i++){
                for(int j =0; j<n-i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
