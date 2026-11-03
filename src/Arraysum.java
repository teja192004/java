import java.util.*;

class Arraysum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Enter elements:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Enter element arr[" + i + "][" + j + "] : ");

                arr[i][j] = sc.nextInt();
            }
        }
    }
}