package Quiz;

import java.util.Scanner;
public class Quiz07_Nox {
    public static void main(String[] args) {
        int [] arr =new int[26];
        System.out.println("영어 소문자 단어를 입력하세요");
        Scanner sc =new Scanner(System.in);
        String S = sc.nextLine();

        for(int i =0 ; i<S.length(); i++) {
            int a = S.charAt(i)-97;
            arr[a]++;
        }

        for(int i =0 ; i<26; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
