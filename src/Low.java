import java.util.*;
public class Low {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a<50){
            System.out.println("low");
        } else if (a>50 && a<100) {
            System.out.println("medium");
        } else
            System.out.println("higher");
    }
    }

