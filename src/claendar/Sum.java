package claendar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //입력 : 키보드로 두수를 입력 받는다.

        Scanner sc =new Scanner(System.in);

        int x, y, sum;
        System.out.println("두수를 입력하세요");
        x=sc.nextInt();
        y=sc.nextInt();
        sum = x+y;

        //출력 : 두수의 합을 출력한다.
        System.out.println("두 수의 합은 " + sum +"입니다.");

    }
}
