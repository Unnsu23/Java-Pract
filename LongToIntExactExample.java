public class LongToIntExactExample {  
    public static void main(String[] args) {  
        long longValue = 12345L;  
  
        try {  
            int intValue = Math.toIntExact(longValue);  
            System.out.println("Long value: " + longValue);  
            System.out.println("Int value: " + intValue);  
        } catch (ArithmeticException e) {  
            System.out.println("Value is outside the int range.");  
        }  
    }  
}  