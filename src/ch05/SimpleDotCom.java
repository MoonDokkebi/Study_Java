package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHit =0;

    public void setLocationCells(int[] locs){
        locationCells =locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int locationCell : locationCells) {
            if (guess == locationCell) {
                result = "hit";
                numOfHit++;
                break;
            }
        }

        if(numOfHit == locationCells.length){
            result ="kill";
        }
        System.out.println(result);
        return result;
    }
}
class GameHelper{
    public String getUserInput(String prompt){
        String inputLine =null;
        System.out.println(prompt + "");
        try{
            BufferedReader is =new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        }catch (IOException e){
            System.out.println("IOExeption: "+ e);
        }
        return inputLine;
    }
}
class SimpleDotComTestDrive{
    public static void main(String[] args) {
        int numOfGuess =0;
        GameHelper helper =new GameHelper();


        SimpleDotCom theDotcom = new SimpleDotCom();
        int randomNum = (int)(Math.random()*5);

        int[] locations ={randomNum, randomNum+1, randomNum+2};
        theDotcom.setLocationCells(locations);
        boolean isAlive =true;

        while(isAlive ==true){
            String guess =helper.getUserInput("enter a number");
            String result = theDotcom.checkYourself(guess);
            numOfGuess++;
            if(result.equals("kill")){
                isAlive =false;
                System.out.println(numOfGuess +"guesses");
            }
        }
    }
}