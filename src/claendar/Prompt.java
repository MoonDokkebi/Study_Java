package claendar;

import java.util.Scanner;

public class Prompt {
    public void runPrompt(){
        Scanner sc = new Scanner(System.in);
        Calendar cal = new Calendar();
        int year= -1;
        int month =-1;

        //숫자를 입력받아 해당하는 달의 최대 일 수를 출력하는 프로그램


        while (true) {
            System.out.println("년도를 입력하세요");
            year = sc.nextInt();
            System.out.println("달을 입력하세요");
            month = sc.nextInt();
            if (month == -1)
                break;
            if (month > 12)
                continue;

            cal.printCalendar(year, month);
        }
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
