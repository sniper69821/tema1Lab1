package ex3;

import java.util.Scanner;
/*
* Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.
*/
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nr=");
        int a= scanner.nextInt();
        System.out.println("val e"+a);
        int numarare=0;
        for(int d=1;d<=a;d++)
        {
            if(a%d==0)
            {
                System.out.println("divizorii="+d);
                numarare++;
            }
        }
        System.out.println("cati div sunt="+numarare);
        if(numarare<=2)
            System.out.println("nr e prim");
        else{
            System.out.println("nr nu e prim");
        }
    }
}
