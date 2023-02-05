package com.java.ParImpar;

public class ParImpar {
    public int num;

    public void setNum(int num) {
        this.num = num;
    }
    public String resultado(){
        if((num % 2 ) == 0){
            return "Es par: " + num;
        }else {
            return "Es falso: " + num;
        }
    }
}
