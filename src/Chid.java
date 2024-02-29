import java.util.*;
public class Chid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a<18){
            System.out.println("child");
        } else if (a>=18 && a<=65) {
            System.out.println("adult");
        } else
            System.out.println("senior");
    }
}

