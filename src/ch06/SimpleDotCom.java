package ch06;




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
