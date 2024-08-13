import java.lang.*;
import java.util.Scanner;
import java.lang.Math;


public class squareroot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double y ;

        System.out.println("Give the values of the sides a,b,c =");
    float a = (float)sc.nextFloat();
    float b = (float)sc.nextFloat();
    float c = (float)sc.nextFloat();

    float s = (float)(0.5*(a+b+c));

    System.out.println("The value of S is ="+s);

     y = Math.sqrt(s*((s-a)*(s-b)*(s-c)));



    System.out.println("The Area of the triangle is =" +y);
    }
    
}
