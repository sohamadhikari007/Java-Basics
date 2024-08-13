 
import java.lang.*;
import java.util.*;
import java.io.*;

class triarea
{
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);

       System.out.println("Give the Length =");
       float l =sc.nextFloat();
System.out.println("Give the Breath =");
        float b=sc.nextFloat();

        float a = (float) (0.5*l*b);


        System.out.println("Area of the triangle is= "+a);
    }
}