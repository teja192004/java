import java.util.Scanner; 
public class palindrome {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
         String s = sc.nextLine();
         int left =0;
         int right =s.length()-1;
         while(left < right){
            if (s.charAt(left) != s.charAt(right)){
                System.out.println("not a palindrome");
                return;
            }
            left++;
            right--;
         }
         System.out.println("palindrome");

        

            
         }



    }
    
