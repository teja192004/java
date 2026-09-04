import java.util.*;
class Dyinputarr{
public static void main (String []args){
Scanner sc=new Scanner(System.in);
System.out.println("enter no of elemmenst in array :");
int n =sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();}
System.out.println("printing array elements of array :");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");}
	}
		}