package Quiz;

import java.util.Scanner;

public class Quiz05_Nox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 N의 값은? : ");
        int n = sc.nextInt();
        System.out.print(n+"! 은? : ");
        System.out.print(Factorial(n));
    }
    private static int Factorial(int n){
        if(n>1)return n * Factorial(n-1);
        else return 1;
    }
}
