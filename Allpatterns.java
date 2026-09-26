
 import java.util.Scanner;
 public class Allpatterns {

    public static void printPattern(int rows) {
        for (int i = 0; i <= rows; i++) {  // Outer loop for each row
            for (int j = 0; j <rows-i+1; j++) {  // Inner loop for printing stars in each row
                System.out.print("* ");  // Print a star
            }
            System.out.println();  // Move to the next line after each row
        }
    }
    public static void printPattern2(int rows) {
        for (int i = 1; i <= rows; i++) {  
            for (int j = 1; j <i; j++) {  
                System.out.print(j);  
            }
            System.out.println();  
        }
    }
    public static void printpatterns3(int rows) {
        for (int i = 0; i < rows; i++) {
            for(int j =0;j<rows-i-1;j++){
            System.out.print(" ");
        }
        for(int j =0;j<2*i+1;j++){
            System.out.print("*");
        }
        for(int j =0;j<rows-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
public static void printpatterns4(int rows) {
        for (int i = 0; i < rows; i++) {
            for(int j =0;j<i;j++){
            System.out.print(" ");
        }
        for(int j =0;j<(2*rows) -(2*i+1);j++){
            System.out.print("*");
        }
        for(int j =0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Call the method to print the pattern
        printpatterns4(rows);
    }
}
    

