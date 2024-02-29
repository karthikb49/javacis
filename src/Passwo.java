import java.sql.SQLOutput;
import java.util.*;
public class Passwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a != "PASSWORD") {
            System.out.println("ACCESS DENIED");
        }
        else
            System.out.println("ACCESS GRANTED");

    }
}
