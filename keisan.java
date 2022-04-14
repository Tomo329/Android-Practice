package com.example.mycalculator;

public class keisan {
    private double result;
    private  String number;
    private  String pro;
    private  int state;
    public keisan(String number,String pro,int state){
        this.number = number;
        this.pro = pro;
        this.state = state;
    }
    public String kekka() {
        double num = Double.parseDouble(number);
        double pr = Double.parseDouble(pro);
        if (state == 1) {
            this.result = num + pr;
        } else if (state == 2) {
            this.result = num - pr;
        } else if (state == 3) {
            this.result = num * pr;
        }else if(state == 4){
            this.result = num / pr;
        }else{
            this.result = num;
        }
        return String.valueOf(result);
    }
    public String squ() {
        double num = Double.parseDouble(number);
        double pr = Double.parseDouble(pro);
        double result = 0;
        if (state == 0) {
            result = num * num;
        }else{
             result = pr * pr;
        }
        return String.valueOf(result);
    }

}
