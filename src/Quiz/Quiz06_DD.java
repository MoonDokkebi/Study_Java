package Quiz;

import  java.util.Arrays;
import java.util.Scanner;

public class Quiz06_DD {
    public static void main(String[] args) {
        int [] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("양수 3개를 입력하세요 : ");
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("최솟값은 : " + arr[0]);
        System.out.println("최대값은 : " + arr[2]);
    }
}
