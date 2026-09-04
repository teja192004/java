class Prime{
public static void main(String[]args){
int n=20;
boolean isprime=true;
for(int i=2;i*i<=n;i++){
if(n%i==0){
isprime=false;
break;}
	}
if (isprime==true){
System.out.println("prime");
}
else{
System.out.println("notprime");}
		}
			}