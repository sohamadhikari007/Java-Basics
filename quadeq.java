import java.util.Scanner;
import java.lang.*;
import java.lang.Math;

public class quadeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the roots =");
         float a = sc.nextFloat();
         float b = sc.nextFloat();
         float c = sc.nextFloat();

         double r1 , r2;

         r1 = (-b + Math.sqrt((b*b) - (4*a*c)))/ (2*a);
         r2 = ( -b - Math.sqrt((b*b) - (4*a*c)))/ (2*a);

         System.out.println("The roots are="+r1 +" "+r2);


    }
}
