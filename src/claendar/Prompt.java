package claendar;

import java.util.Scanner;

public class Prompt {
    /**
     *
     * @param week 요일명
     * @return 0~6 (0=Sunday, 6=Saturday)
     */
    public  int pareDay(String week){
        if(week =="su") return 0;
        else if(week =="mo") return 1;
        else if(week =="tu") return 2;
        else if(week =="we") return 3;
        else if(week =="th") return 4;
        else if(week =="ft") return 5;
        else if(week =="sa") return 6;
        else return 0;
    }
    public void runPrompt(){
        Scanner sc = new Scanner(System.in);
        Calendar cal = new Calendar();
        int year= 2017;
        int month =1;
        int weekday=0;

        //숫자를 입력받아 해당하는 달의 최대 일 수를 출력하는 프로그램


        while (true) {
            System.out.println("년도를 입력하세요");
            year = sc.nextInt();
            System.out.println("달을 입력하세요");
            month = sc.nextInt();
            System.out.println("첫째 날의 요일을 입력하세(su,mo,tu,wd,th,fr,sa)");
            String str_weekday = sc.next();
            weekday = pareDay((str_weekday));
            if (month == -1)
                break;
            if (month > 12)
                continue;

            cal.printCalendar(year, month,weekday);
        }
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
