import java.util.*;
public class ReapeatOnlyOnce {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of value in array :");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("printing array elementa");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("");
        int result=0;
        for (int i=0;i<arr.length;i++){
        result^=arr[i];
        }
        System.out.println("non repeated element is "+result);




    }
}
