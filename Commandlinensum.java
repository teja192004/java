class Commandlinensum{
public static void main (String[]args){
int h=args.length;
int sum=0;
for(int i=0;i<h;i++){
sum =sum+Integer.parseInt(args[i]);}	
System.out.println("sum of n numbers is :"+sum);
	}
}