package ex2;
import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String nume_fis= "src/ex2/in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        String linie;
        float suma=0,ma=0,sum=0,min=0,max=0,numere=0;
        while(((linie=flux_in.readLine()))!=null)
        { int x=Integer.parseInt(linie);
            numere++;
            sum +=x;
            ma=sum/numere;
            min=x;
            if(min>x)

                min=x;
                else
                    if(x>max)

                    max=x;




        }
        System.out.println("suma este "+sum);
        System.out.println("media este "+ma);
        System.out.println("nr min este "+min);
        System.out.println("nr max este "+max);

   }
}

