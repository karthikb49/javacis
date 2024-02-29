import java .util.*;
public class Neg {
    public static void main(String[] args) {
     int a=2,v=1;
     String l="kar";
     //switch (a){
     //    case 1: {System.out.println("a not equal to case 1");break;}
     //    case 2: {System.out.println("a  equal to case 2");break;}}

     //   switch (l){
      //      case "vin":{System.out.println("l not equal to case 1");break;}
      //      case "kar":{System.out.println("l equal bhai");break;}}

        switch (a) {
            case 1: {
                System.out.println("a not equal to case 1");
                break;
            }
            case 2: {    // used nested switch loop//
                switch (v) {
                    case 0: {
                        System.out.println("a not equal to case 0");
                        break;
                    }
                    case 1: {
                        System.out.println("a equal to case 1");
                        break;
                    }
                }
            }
        }





}}
