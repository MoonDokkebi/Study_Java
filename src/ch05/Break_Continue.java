package ch05;

public class Break_Continue {
    public static void main(String[] args) {
        int sum =0;
        int i=1;

        while (true){
            if(sum>100)
                break;
            sum += i;
            i++;
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);

        //----------------------------------------

        for(int a =0; a <= 10; a++){
            if(a%3 == 0)
                continue;
            System.out.println(a);
        }

        //-----------------------------------------


    }
}
