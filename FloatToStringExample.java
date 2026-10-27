// Define a custom class named MyClass  
public class FloatToStringExample{  
    // Private field to hold an integer value  
    private int value;  
    // Constructor to initialize the value field  
    public MyClass(int value) {  
        this.value = value;  
    }  
    // Override the toString() method to provide a custom string representation  
    @Override  
    public String toString() {  
        // Return a string containing the class name and the value of the field  
        return "MyClass{" +  
                "value=" + value +  
                '}';  
    }  
    // Main method to demonstrate the usage of the toString() method  
    public static void main(String[] args) {  
        // Create an instance of MyClass with a value of 42  
        MyClass obj = new MyClass(42);  
        // Call toString() method on the object to get its string representation  
        String objString = obj.toString();  
        // Print the string representation of the object  
        System.out.println("String representation of obj: " + objString);  
    }  
}  