import java.util.Scanner;
//  Array kya hota hai?
// Definition: An array is a collection of elements of the same data type stored in a continuous memory-like sequence and accessed using an index.

// Simple language mein:
// - Ek hi variable name.
// - Multiple values.
// - Same data type.
// - Har value ki apni index hoti hai.
public class Array {
    public static void main(String[] args) {

        // int[] arr = { 10, 20, 30, 40, 50 };

        // // Access
        // System.out.println(arr[2]);

        // // Update
        // arr[2] = 100;

        // // Print
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

       int n;
         Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of the array: ");
          n = sc.nextInt();
    
          
          int[] arr = new int[n];
    
          // Input
          System.out.println("Enter the elements of the array:");
          for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
          }
    
          // Output
          System.out.println("The elements of the array are:");
          for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
          }
    
          sc.close();

    
        }
    }

