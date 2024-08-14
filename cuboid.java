import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
    int l , b , h ;    
        Scanner sc = new Scanner(System.in);

    System.out.println("Give the Length of cuboid =");

         l =(int) sc.nextInt();

    System.out.println("Give the breath of cuboid =");

         b =(int) sc.nextInt();

    System.out.println("Give the height of cuboid =");

         h =(int) sc.nextInt();     

         int area , volume ;

         area = (int) (2*((l*b)+(l*h)+(b*h)));

         volume = (int) (l*b*h);
         
    System.out.println("The total area & volume of the cuboid is ="+area+" & "+volume);


    

    }
}
