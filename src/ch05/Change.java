package ch05;

public class Change {
    public static void main(String[] args) {
        String str1 = "2";
        int N1 = 2;
        //num1 != N1

        int intValue1 =Integer.parseInt(str1);
        if(intValue1 == N1)
            System.out.println("같음");


        String str2 = "123";
        int intValue2 = Integer.valueOf(str2);
        System.out.println(intValue2); // 123

        //------------------------------------
        // 반대의 경우는?(Int를 String으로)
        int a =123;
        String b = Integer.toString(a);
        System.out.println(a + 10 + 15);
        System.out.println(b + 10 + 15);


        int i = 1;
        int j = i++;
        System.out.println("i값은 : " + i);
        System.out.println("j값은 : " + j);

        int x = 1;
        int y = ++x;
        System.out.println("x값은 : " + x);
        System.out.println("y값은 : " + y);
    }
}
