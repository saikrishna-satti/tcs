import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int[] a=new int[6];

        for(int i=0;i<6;i++){
            a[i]=in.nextInt();
        }
        sort(a);

        in.close();
        System.out.println(a);
    }


    public static void sort(int[] arr){

          int n=arr.length;

          for(int i=0;i<n;i++){
              for(int j=0;j<n-1-i;j++){

                   if(arr[j]>arr[j+1]){
                       int temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                   }
              }

         }



   }
}
