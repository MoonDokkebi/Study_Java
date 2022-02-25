//별찍기 문제
package Quiz;
import java.util.Scanner;

public class Quiz01_NOX {
    public static void main(String[] args) {
        int line,choice;
        String wordlengh;
        Scanner sc = new Scanner(System.in);
        System.out.println("유형을 선택하시오 1.숫자, 2.문자 ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("줄 수를 입력하시요");
                line = sc.nextInt();
                NumStar(line);
                break;
            case 2:
                System.out.println("줄수만큼 문자를 입력하세요");
                wordlengh = sc.next();
                WordStar(wordlengh);
        }
    }

    static void NumStar(int line){
        for(int i = 0; i < line; i++){
            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void WordStar(String wordlengh){
        for(int i = 0; i < wordlengh.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

