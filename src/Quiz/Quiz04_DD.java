package Quiz;

import java.util.Scanner;

public class Quiz04_DD {
    public static void main(String[] args) {
        int success,num;
        Scanner sc = new Scanner(System.in);

        System.out.print("합격 점수를 입력하세요 : ");
        success = sc.nextInt();
        System.out.print("내 점수를 입력하세요 : ");
        num = sc.nextInt();

        if(num>=success )
            System.out.println("합격");
        else
            System.out.println("불합격");
    }
}