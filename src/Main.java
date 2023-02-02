import org.w3c.dom.ls.LSInput;

import java.awt.*;

public class Main {
    public static void main(String[] args)
    throws java.io.IOException{
//        char value;
//        System.out.println("Help on:");
//        System.out.print("1.if-statement \n2.switch");
//        value = (char)System.in.read();
//        switch (value){
//            case '1':
//                System.out.println("if(condition){\n...code...\n else{ \n...\n}");
//                break;
//            case '2':
//                System.out.println("switch(value){\n...case(value)\nbreak;}");
//                break;
//            default:
//                System.out.println("error");
//                break;
//        }
        int e,result;
        for(int i = 0;i<10;i++){
            result = 1;
            e = i;
            while(e>0){
                result *=2;
                e--;

            }
            System.out.println(2+"to the power"+i+"is"+result);
        }
    }
}