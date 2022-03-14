package Quiz;

import java.util.Scanner;

public class Quiz08_Ben {
    public static void main(String[] args) {
        int[] coin = {500, 100, 50, 10};
        int[] remain = new int [4];

        System.out.println("거스름돈을 입력하시오");
        Scanner sc = new Scanner(System.in);
        int money= sc.nextInt();

        for(int i =0; i<4; i++){
            System.out.println(coin[i] + "원의 개수를 입력하세요");
            remain[i] =sc.nextInt();
        }

        System.out.println("사용된 동전의 개수");

        for (int i = 0; i < coin.length; i++) {
            int use = money / coin[i];

            if (remain[i] <= use) {
                use = remain[i];
                remain[i] = 0;
            } else {
                remain[i] -= use;

            }
            money -= coin[i]*use;
            System.out.println(coin[i]+"원: "+ use);
        }
        System.out.println("남은 동전은");
        for (int i = 0; i < coin.length; i++) {
            System.out.println(coin[i] + "원:" + remain[i]);
        }

        if (money > 0) {
            System.out.println("동전이 부족합니다.");
            System.exit(0);
        }
        System.out.println("남은 동전의 개수");

    }
}
