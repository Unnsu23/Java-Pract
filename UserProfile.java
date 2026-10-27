// Define a class named 'UserProfile'  
public class UserProfile {  
    // Attributes of the class  
    private String name;  
    private int age;  
    private String email;  
    // Constructor to initialize the UserProfile object  
    public UserProfile(String name, int age, String email) {  
        this.name = name;  
        this.age = age;  
        this.email = email;  
    }  
    // Getters for the class fields  
    public String getName() {  
        return name;  
    }  
    public int getAge() {  
        return age;  
    }  
    public String getEmail() {  
        return email;  
    }  
    //Method to determine the age category  
    public String getAgeCategory() {  
        if (age < 18) {  
            return "Underage";  
        } else if (age <= 65) {  
            return "Adult";  
        } else {  
            return "Senior";  
        }  
    }  
    // Override the toString() Method to provide a custom string representation of the object  
    @Override  
    public String toString() {  
        return "UserProfile{name='" + name + "', age=" + age + ", email='" + email + "'}";  
    }  
    // Main method to run the program  
    public static void main(String[] args) {  
        // Creating an object of UserProfile  
        UserProfile userProfile = new UserProfile("Alice", 30, "alice@example.com");  
        // Printing the object. It calls the overridden toString() Method.  
        System.out.println(userProfile);  
        // Displaying age category  
        System.out.println("Age Category: " + userProfile.getAgeCategory());  
    }  
}  