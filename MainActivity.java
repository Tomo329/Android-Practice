package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String number;
    private String pro;
    private int status;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.status=0;
        this.number ="0";
        this.pro = "0";
        this.textView=findViewById(R.id.display);
        this.textView.setText(number);
        //button0
        Button button0 = findViewById(R.id.button0);
        button0.setText(String.valueOf(0));
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(status==0){
                    if(!(number.equals("0"))){
                        number = number + "0";
                        textView.setText(number);
                    }
                }else{
                    if(!(pro.equals("0"))){
                        pro = pro +"0";
                        textView.setText(pro);
                    }
                }
            }
        });
        //button1
        Button button1 =findViewById(R.id.button1);
        button1.setText(String.valueOf(1));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status == 0){
                    if(number.equals("0")){
                        number = "1";
                    }else{
                        number = number +"1";
                    }
                    textView.setText(number);
                }else if(status ==1){
                    if(pro.equals("0")){
                        pro = "1";
                    }else{
                        pro = pro + "1";
                    }
                    textView.setText(pro);
                }
            }
        });
        //button2
        Button button2 =findViewById(R.id.button2);
        button2.setText(String.valueOf(2));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status == 0){
                    if(number.equals("0")){
                        number = "2";
                    }else {
                        number = number + "2";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "2";
                    }else {
                        pro = pro + 2;
                    }
                    textView.setText(pro);
                }
            }
        });
        //button3
        Button button3=findViewById(R.id.button3);
        button3.setText(String.valueOf(3));
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status ==0){
                    if(number.equals("0")){
                        number = "3";
                    }else {
                        number = number + "3";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "3";
                    }else {
                        pro = pro + "3";
                    }
                    textView.setText(pro);
                }
            }
        });
        //button4
        Button button4 = findViewById(R.id.button4);
        button4.setText(String.valueOf(4));
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status == 0) {
                    if(number.equals("0")){
                        number = "4";
                    }else {
                        number = number + "4";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "4";
                    }else {
                        pro = pro + "4";
                    }
                    textView.setText(pro);
                }
            }
        });
        //button5
        Button button5 = findViewById(R.id.button5);
        button5.setText(String.valueOf(5));
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status == 0) {
                    if(number.equals("0")){
                        number = "5";
                    }else {
                        number = number + "5";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "5";
                    }else {
                        pro = pro + "5";
                    }
                    textView.setText(pro);
                }
            }
        });
        Button button6 = findViewById(R.id.button6);
        button6.setText(String.valueOf(6));
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status == 0){
                    if(number.equals("0")){
                        number = "6";
                    }else {
                        number = number + "6";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "6";
                    }else {
                        pro = pro + "6";
                    }
                    textView.setText(pro);
                }
            }
        });
        //plus
        Button plus = findViewById(R.id.plus);
        plus.setText("+");
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(pro.equals("0"))) {
                    keisan kei = new keisan(number, pro, status);
                    number = kei.kekka();
                    textView.setText(number);
                    pro = "0";
                }
                status = 1;
            }
        });
        //minus
        Button minus = findViewById(R.id.minus);
        minus.setText("-");
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(pro.equals("0"))) {
                    keisan kei = new keisan(number, pro, status);
                    number = kei.kekka();
                    textView.setText(number);
                    pro = "0";
                }
                status = 2;
            }
        });
        //button7
        Button button7 = findViewById(R.id.button7);
        button7.setText(String.valueOf(7));
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status == 0) {
                    if(number.equals("0")){
                        number = "7";
                    }else {
                        number = number + "7";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "7";
                    }else {
                        pro = pro + "7";
                    }
                    textView.setText(pro);
                }
            }
        });
        Button button8 = findViewById(R.id.button8);
        button8.setText("8");
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status == 0) {
                    if(number.equals("0")){
                        number = "8";
                    }else {
                        number = number + "8";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "8";
                    }else {
                        pro = pro + "8";
                    }
                    textView.setText(pro);
                }
            }
        });
        Button button9 = findViewById(R.id.button9);
        button9.setText("9");
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status ==0){
                    if(number.equals("0")){
                        number = "9";
                    }else {
                        number = number + "9";
                    }
                    textView.setText(number);
                }else{
                    if(pro.equals("0")){
                        pro = "9";
                    }else {
                        pro = pro + "9";
                    }
                    textView.setText(pro);
                }
            }
        });
        Button button00 = findViewById(R.id.button00);
        button00.setText("00");
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status == 0){
                    if(!(number.equals("0"))){
                        number = number + "00";
                    }
                    textView.setText(number);
                }else {
                    if(!(pro.equals("0"))){
                        pro = pro + "00";
                    }
                    textView.setText(pro);
                }
            }
        });
        //multi
        Button multi = findViewById(R.id.multi);
        multi.setText("×");
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(pro.equals("0"))) {
                    keisan kei = new keisan(number, pro, status);
                    number = kei.kekka();
                    textView.setText(number);
                    pro = "0";
                }
                status = 3;
            }
        });
        //allClear
        Button allClear = findViewById(R.id.allClear);
        allClear.setText("AC");
        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = "0";
                status = 0;
                pro = "0";
                textView.setText(number);
            }
        });
        //clear
        Button clear = findViewById(R.id.clear);
        clear.setText("C");
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pro = "0";
            }
        });
        Button equal = findViewById(R.id.equal);
        equal.setText("=");
        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                keisan Kei =new keisan(number,pro,status);
                number = Kei.kekka();
                textView.setText(number);
                pro = "0";
            }
        });
        //square
        Button square = findViewById(R.id.square);
        square.setText("X²");
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keisan Kei = new keisan(number,pro,status);
                String a = Kei.squ();
                if(status == 0){
                    number = a;
                    textView.setText(number);
                }else{
                    pro = a;
                    textView.setText(pro);
                }
            }
        });
        Button decimal = findViewById(R.id.decimal);
        decimal.setText(".");
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status == 0){
                    number = number +".";
                    textView.setText(number);
                }else{
                    pro = pro + ".";
                    textView.setText(pro);
                }
            }
        });
        Button division = findViewById(R.id.division);
        division.setText("÷");
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(pro.equals("0"))) {
                    keisan kei = new keisan(number, pro, status);
                    number = kei.kekka();
                    textView.setText(number);
                    pro = "0";
                }
                status = 4;
            }
        });
    }
}
