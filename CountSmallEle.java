import java.util.ArrayList;  
import java.util.Arrays;  
  
public class CountSmallEle   
{  
  
public ArrayList<Integer> computeSmallEleNum(ArrayList<Integer> inArr, int s)   
{     
ArrayList<Integer> outArr = new ArrayList<Integer>();  
  
// outer loop picks the current element  
for(int i = 0; i < s; i++)  
{  
// for keeping the count of the elements  
// that is smaller than the current element  
// and are occurring on the right side  
int count = 0;  
for(int j = i + 1; j < s; j++)  
{  
if(inArr.get(i) > inArr.get(j))  
{  
// smaller element on the right side  
// is found. Hence, increasing the   
// count by 1  
count = count + 1;  
}  
}  
  
// adding the count for the current element  
outArr.add(count);  
}  
  
  
// returning the output list  
return outArr;  
}  
      
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class CountSmallEle   
CountSmallEle obj = new CountSmallEle();  
  
// input 1  
ArrayList<Integer> inArr = new ArrayList<Integer>  
(  
Arrays.asList(7, 4, 9, 1, 3, 5, 0, 6, 2, 8)  
);  
  
// computing the size of the   
// input array  
int size = inArr.size();  
System.out.println("For the input array: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(inArr.get(i) + " ");  
}  
  
System.out.println();  
ArrayList<Integer> ans = obj.computeSmallEleNum(inArr, size);  
  
System.out.println("The count of the smaller element on the right side is: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(ans.get(i) + " ");  
}  
  
System.out.println( "\n" );  
  
// input 2  
inArr = new ArrayList<Integer>  
(  
Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)  
);  
  
// computing the size of the   
// input array  
size = inArr.size();  
  
System.out.println("For the input array: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(inArr.get(i) + " ");  
}  
  
System.out.println();  
  
ans = obj.computeSmallEleNum(inArr, size);  
  
System.out.println("The count of the smaller element on the right side is: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(ans.get(i) + " ");  
}  
  
System.out.println( "\n" );  
  
// input 3  
inArr = new ArrayList<Integer>  
(  
Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)  
);  
  
// computing the size of the   
// input array  
size = inArr.size();  
  
System.out.println("For the input array: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(inArr.get(i) + " ");  
}  
  
System.out.println();  
  
ans = obj.computeSmallEleNum(inArr, size);  
  
System.out.println("The count of the smaller element on the right side is: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(ans.get(i) + " ");  
}  
  
System.out.println( "\n" );  
  
  
// input 4  
inArr = new ArrayList<Integer>  
(  
Arrays.asList(4, 4, 4, 4, 4, 4, 4, 4, 4, 4)  
);  
  
// computing the size of the   
// input array  
size = inArr.size();  
  
System.out.println("For the input array: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(inArr.get(i) + " ");  
}  
  
System.out.println();  
  
ans = obj.computeSmallEleNum(inArr, size);  
  
System.out.println("The count of the smaller element on the right side is: ");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(ans.get(i) + " ");  
}  
  
}  
  
}  