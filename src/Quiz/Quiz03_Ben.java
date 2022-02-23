package Quiz;

import java.util.Scanner;

public class Quiz03_Ben {
    public static void main(String[] args) {
        int n;
        int x=1;
        int sum=0;
        System.out.println("1: 1번문제, 2: 2번문제");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n==1){
            while (x<=1000){
                if(x%3==0)
                    sum += x;
                x++;
            }
            System.out.println(sum);
        }else if(n==2){
            for(int i=1; i<=100;i++){
                System.out.println(i);
            }
        }
    }
    }
