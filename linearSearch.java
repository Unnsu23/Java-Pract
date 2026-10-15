public class Main {  
    public static int linearSearch(int[] arr, int target) {  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == target) {  
                return i;  
            }  
        }  
        return -1;  
    }  
    public static void main(String a[]) {  
        int[] a1 = { 10, 20, 30, 50, 70, 90 };  
        int target = 50;  
        System.out.println(target + " is found at index: " + linearSearch(a1, target));  
    }  
}  