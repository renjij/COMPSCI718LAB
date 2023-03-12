package ictgradschool.industry.arrays.printpattern;

public class Pattern {
    private int num;
    private char symbol;

    public Pattern(int num, char symbol){
        this.num = num;
        this.symbol = symbol;
    }


    public String toString(){
        String newsymbol = "";
        for (int i = 0; i < num; i++){
            newsymbol += symbol;
        }
        return newsymbol;
    }

    public int getNumberOfCharacters(){
        return Pattern.this.num;
    }

    public int setNumberOfCharacters(int num){
        return Pattern.this.num = num;
    }


}
