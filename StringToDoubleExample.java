import java.text.NumberFormat;  
import java.text.ParseException;  
public class StringToDoubleExample {  
    public static void main(String[] args) {  
        String s = "23.6";  
        NumberFormat numberFormat = NumberFormat.getInstance();  
        try {  
            Number number = numberFormat.parse(s);  
            double d = number.doubleValue();  
            System.out.println(d);  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
    }  
} 