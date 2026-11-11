# Java Array Notes

## Array kya hota hai?

**Definition:** An array is a collection of elements of the same data type stored in a continuous memory-like sequence and accessed using an index.

### Simple language mein:
* Ek hi variable name hota hai.
* Multiple values store kar sakte hain.
* Sabhi values ka **same data type** hota hai.
* Har value ki apni ek **index** hoti hai (jo `0` se start hoti hai).

---

## 1. Basic Array Operations (Access, Update, Print)

```java
public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        // Access
        System.out.println(arr[2]); // Output: 30

        // Update
        arr[2] = 100;

        // Print
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

---

## 2. User Input & Output in Java Array

```java
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
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
```

---

## 3. Memory Allocation in Java Array

Java mein array ek **Reference Type** hota hai:
* **Stack Memory:** Ismein reference variable (`array1`, `array2`) store hote hain.
* **Heap Memory:** Ismein actual array elements (`{1, 2, 3, 4, 5}`) store hote hain.
* Agar `int[] array2 = array1;` likhte hain, toh dono variables Heap mein ek hi array ko point karte hain.

<img width="746" height="420" alt="Memory Allocation in Java Array" src="https://github.com/user-attachments/assets/bf75e51b-70c7-428f-acd3-858518745609" />
