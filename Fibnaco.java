import java.util.Scanner;

/**
 * Fibnaco
 */
public class Fibnaco {
    static int n1=0,n2=1,n3=0;
     
   
     public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          int count=in.nextInt();
           printFibnaco(count);
           in.close();
     }
        static void printFibnaco(int count){
           
            if(count>0){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.println(" "+n3);
                printFibnaco(count-1);
            }

        }
     
}