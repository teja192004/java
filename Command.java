class Command{
public static void main (String[]args){
int n = args.length;
int sum=0;
/*for(int i =0;i<args.length;i++){
sum=sum+Integer.parseInt(args[i]);}
	
*/
sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);	
System.out.print("sum of numbers is :"+sum);
}
}