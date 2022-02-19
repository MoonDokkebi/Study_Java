


import java.lang.reflect.Member;

public class Java_Study_01 {                   //클래스 선언 자바에서 매우 중요한 원리라 나중에 다룸
    public static void main(String[] args) {   //메인메서드 : 프로그램이 실행하는 부분
/*  public = 접근제어자 , static 동적 정적인데 어려우니 다음으로
    void = 리턴 형식, 리턴값이 0을 의미
    string[]  스트링 형식의 배열 args는 배열의 이름

  */
        System.out.println("Hello world"); //출력하는 방법
        System.out.print("이것은 줄바꿈이 안됩니다");

        System.out.print("안녕");
        System.out.print("하세요");
        System.out.println("반갑");
        System.out.println("습니다");


//  변수에는 자료형과 같은 예약어는 쓰면 안됨
        //정수형 자료형들
        byte by = 120;  // 가장 작은 단위로 8비트로 구성된 1바이트를 기본으로함
        short so = 6;   // 음수를 포함한 char이라 생각하면 됨 대신 범위가 작음
        int num = 10; //******정수의 기본 자료형 범위가 무한하지 않음
        long ln = 15648494; //***** 충분한 숫자값이 필요한 경우 사용
        //실수형자료형들
        float fl = 3.1234567f; // 주로 소수를 이용할때 적음  But 유효자리수가 7이다, And 뒤에 f를 붙여줘야됨
        double ddub = 3.123456789; //******실수일때 주로사용함
        //문자형 자료형들
        char ch = 'A';   //***** 음수를 포함하지 않는 자료형 문자표현에 적합
        System.out.println(ch);
        System.out.println((int) ch);//저장될때 아스키 코드 숫자로 저장됨 그래서 숫자로나옴

        String msg = "Hello w  o  r  d";  //***** char 배열이라고 생각하면 됨 (띄어쓰기가 됨)
        System.out.println(msg);

        //논리형
        boolean tf = true; //true, false 로 참거짓 논리형

        //반복문 while, for
        /*
        while (조건문) {
            <수행할 문장1>;
            <수행할 문장2>;
            <수행할 문장3>;
            무한루프이면
            break; 로 빠져나온다
            ...
        }
*/
        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue;  // 짝수인 경우 조건문으로 돌아간다.
            }
            System.out.println(a);  // 홀수만 출력된다.
        }

        for (int i = 0; i <= 10; i++) {
            //int i =0 시작하는 부분, ;로 구분, i<= 10 조건으로 이부분이 만족하면 실행, i++은  증감식 ++ 는 +1을 의미함
            System.out.println("반복" + i);
        }


        /*
            if (조건문) {
                <문장1>;
            } else {
                <문장B>;
            }
         */
        int x = 6;
        if (x > 6) {
            System.out.println("6보다 큼");
        } else if (x == 6) {
            System.out.println("x는 6");
        } else {
            System.out.println("x는 6보다 작음");
        }
        /*switch(입력변수) {
            case 경우1: ...
                break;
            case 경우2: ...
                break;
            default: ...            =아니면
                break;
           }
         */
        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);

        //향상된 for 문 = for each 문임 자바 5.0부터 추가됨
        //하지만 배열을 배우고 난뒤 설명하겠음


    }
}
