
public class Unit3
{
    public static void main(String[] args) {

//3.3, Q:Which of the following test cases can be used to show that the code does NOT work as intended?        
String weather;
//int temp = 30; -->warm, this is not right because it is supposed to display "cold"
//int temp = 51; -->moderate, this is correct
int temp = 60; //moderate, this is also correct
if (temp <= 31)
{
weather = "cold";
}
else
{
weather = "cool";
}
if (temp >= 51)
{
weather = "moderate";
}
else
{
weather = "warm";
}
System.out.print(weather);
//the answer is a, because it is the only one that doesn't work as intended. 

//3.7: What is printed as a result of executing the code segment?
String first = new String("duck");
String second = new String("duck");
String third = new String("goose");
if (first == second)
{
System.out.print("A");
}
else if (second == third)
{
System.out.print("B");
}
else if (first.equals(second))
{
System.out.print("C");
}
else if (second.equals(third))
{
System.out.print("D");
}
else
{
System.out.print("E");
}
//the answer is C because it prints out "C"

//3.4, Q: Which of the following correctly compares the outputs of the two code segments?
int result = 0;
int x = 3;
int y= 7;
if (x > y)
{
result = x - y;
System.out.print(result);
}
else if (x < y)
{
result = y - x;
System.out.print(result);
}
else
{
System.out.print(result);
}

if (x < y)
{
System.out.print(y - x);
}
else
{
System.out.print(x - y);
}
//a is the right answer because Code segment I and code segment II produce the same output for all values of x and y.
  
//3.6, Q: Which of the following is equivalent to the expression above?
int j= 3;
int k=7;
int m=5;

System.out.println(!((j == k) && (k > m))); //the expression
System.out.println((j != k) || (k < m)); //answer choice a
System.out.println((j != k) || (k <= m)); //answer choice b
System.out.println((j == k) || (k < m)); //answer choice c
System.out.println((j != k) && (k <= m)); //answer choice d
System.out.println((j == k) && (k < m)); //answer choice e

//b is correct because of order of operations. I tested each of the answer choices 
//using random variables and only b produced the same value as the expression.
}
}
