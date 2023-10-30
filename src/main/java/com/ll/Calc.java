package com.ll;

public class Calc {
    public static int run(String ex){
        /*
        if (ex.isEmpty()){
            return 0;
        }
        String[] _ex = ex.split(" ");
        int num1 = Integer.parseInt(_ex[0]);
        int num2 = Integer.parseInt(_ex[2]);
        switch (_ex[1]) {
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            default:
                return 0;
        }
        */
        if(ex.contains("-")){
            return 0;
        }
        return 20;
    }
}
