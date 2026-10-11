import java.util.*;  
public class Main {  
    public static void leftRotate(int arr[], int d) {  
        int n = arr.length;  
        for (int i = 0; i < d; i++) {  
            int first = arr[0];  
            
            for (int j = 0; j < n - 1; j++) {  
                arr[j] = arr[j + 1];  
            }  
            arr[n - 1] = first; 
        }  
    }  
    public static void main(String[] args) {  
        int arr[] = {1, 2, 3, 4, 5};  
        int d = 3;  
        System.out.println("Original array: " + Arrays.toString(arr));  
        leftRotate(arr, d);  
        System.out.println("Array after left rotation: " + Arrays.toString(arr));  
    }  
}  
