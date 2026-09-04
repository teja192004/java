class Rev{
public static void main(String[]args){
int n=121;
int m=n;
int digit;
int rev=0;
while (n>0){
digit=n%10;
n=n/10;
rev=rev*10+digit;
}
if(m==rev){
System.out.println("palindrome");}
else{
System.out.println("not palindrome");}
}
}