package ex1;
import java.util.Scanner;

public class maina {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.print("l=");
     float l=scanner.nextInt();
     System.out.println("latimea "+l);
        System.out.print("L=");
        float L=scanner.nextInt();
        System.out.println("lungimea "+L);
        scanner.close();
        float perimetru=2*(l+L);
        System.out.println("perimetrul este "+perimetru);
        float arie=l*L;
        System.out.println("aria este "+arie);



    }
}
