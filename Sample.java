import java.util.Scanner;
import java.util.Arrays;
/*class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr= new int[size];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MIN Answer= "+min);
        System.out.println("MAX Answer= "+max);
        System.out.println("Array= "+Arrays.toString(arr));
        sc.close();
    }
}*/
class Sample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr= new int[size];
        boolean a=true;
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
         }
        System.out.println("Array= "+Arrays.toString(arr));
         /*for(int i=0,j=size-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
        */
       System.out.println("Array= "+Arrays.toString(arr));
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                a=false;
            }
            
         }
         System.out.println("Sorted= "+a);
        sc.close();
    }

}