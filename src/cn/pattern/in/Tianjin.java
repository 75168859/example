package cn.pattern.in;
import java.util.*;
public class Tianjin implements Handler{
     private Handler handler;             
     private ArrayList<String> numberList;  
     Tianjin(){
        numberList=new ArrayList<String>();
        numberList.add("10029812340930034"); 
        numberList.add("20020810340430632");
        numberList.add("30029812340930034"); 
        numberList.add("50020810340930632");
     }
     public void handleRequest(String number){
        if(numberList.contains(number))
           System.out.println("该人在天津居住");
        else{
           System.out.println("该人不在天津居住");
           if(handler!=null)
              handler.handleRequest(number);      
        }
     }
     public void setNextHandler(Handler handler){
        this.handler=handler;
     }
}
