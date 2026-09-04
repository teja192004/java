class Command{
public static void main (String[]args){
int n = args.length;
int sum=0;
for(int i =0;i<args.length;i++){
sum=sum+Integer.parseInt(args[i]);}
System.out.println("sum of numbers is :"+sum);	
	}

}