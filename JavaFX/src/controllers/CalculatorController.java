package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculatorController  {
    @FXML    private Label display= new Label();
    @FXML    private Button button4= new Button();
    @FXML    private Button button2= new Button();
    @FXML    private Button button3= new Button();
    @FXML    private Button button8= new Button();
    @FXML    private Button button6= new Button();
    @FXML    private Button button7= new Button();
    @FXML    private Button buttonDot= new Button();
    @FXML    private Button buttonPlus= new Button();
    @FXML    private Button button0= new Button();
    @FXML    private Button button1= new Button();
    @FXML    private Button buttonDivision= new Button();
    @FXML    private Button buttonMinus= new Button();
    @FXML    private Button buttonMultiple= new Button();
    @FXML    private Button buttonWynik= new Button();



    private  static String obliczenia="";
    private  void addNumber(int number){
        obliczenia+=String.valueOf(number);
        display.setText(obliczenia);

    }
    private  void addArithmeticOperator(String operator){
        obliczenia+=" "+operator+" ";
        display.setText(obliczenia);

    }
    private  void addDot(String operator){
        obliczenia+=operator;
        display.setText(obliczenia);

    }
    private static double obliczWynik(){
        double result=0.0;
        String[] list = obliczenia.split(" ");



        for(int i=0;i<list.length-2;i=+2){
            if(list[i+1].equals("*")){
                result=result+   (Double.parseDouble(list[i])*Double.parseDouble(list[i+2]));
            }else if(list[i+1].equals("/")){
                if(list[i+2].equals("0"))
                    break;
                result=result+   (Double.parseDouble(list[i])/Double.parseDouble(list[i+2]));


            }else if(list[i+1].equals("+")){
                result=result+   (Double.parseDouble(list[i])+Double.parseDouble(list[i+2]));
            }else if(list[i+1].equals("-")){
                result=result+   (Double.parseDouble(list[i])-Double.parseDouble(list[i+2]));
            }
        }
        return result;
    }

@FXML public void pressButton0(){
    if(!display.getText().equals("0"))
        addNumber(0);
}
@FXML public void pressButton1(){
    addNumber(1);
}
@FXML public void pressButton2(){
    addNumber(2);
}
@FXML public void pressButton3(){
    addNumber(3);
}
@FXML public void pressButton4(){
    addNumber(4);
}
@FXML public void pressButton5(){
    addNumber(5);
}
@FXML public void pressButton6(){
    addNumber(6);
}
@FXML public void pressButton7(){
    addNumber(7);
}
@FXML public void pressButton8(){
    addNumber(8);
}
@FXML public void pressButton9(){
    addNumber(9);
}
@FXML public void pressButtonPlus(){
    addArithmeticOperator("+");
}
@FXML public void pressButtonMinus(){
    addArithmeticOperator("-");
}
@FXML public void pressButtonDivision(){
    addArithmeticOperator("/");
}
@FXML public void pressButtonMultiple(){
    addArithmeticOperator("*");
}
@FXML public void pressButtonDot(){
    addDot(".");
}
@FXML public void pressButtonWynik(){

    System.out.println(obliczenia);

    BigDecimal bd= new BigDecimal(obliczWynik()).setScale(2,BigDecimal.ROUND_HALF_UP);

    display.setText(String.valueOf(bd));//("Value: %.2f", value)
    obliczenia="";

}

}
