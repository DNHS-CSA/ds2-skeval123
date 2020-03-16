
public class Unit5
{
   public static void main(String[] args) {
 
//Question 3, 5.1
/*The Employee class will contain a String attribute for an employee’s name and a double attribute for the employee’s salary.
Which of the following is the most appropriate implementation of the class? */
/*public class Employee
{
private String name;
private double salary;
// constructor and methods not shown
} */
//C is the correct answer because it makes the most sense for the name and salary to be private. 



//Question 5, 5.2
//Which of the following code segments, found in a class other than Employee,   could be used to correctly create an Employee object representing an employee who worked for 20 hours at a rate of $18.50 per hour?
/*public class Employee
{
private String name;
private int wk_hours;
private double pay_rate;
public Employee(String nm, int hrs, double rt)
{
name = nm;
wk_hours = hrs;
pay_rate = rt;
}
public Employee(String nm, double rt)
{
name = nm;
wk_hours = 20;
pay_rate = rt;
}
} */
//Answer choice c is correct because 3rd code segment would not correctly create an Empolyee object. It would set the pay rate to 20 even though it should be 18.5.



//Question 7, 5.3
/* Consider the following method substringFound, which is intended to return true if a substring, key, is located at a specific index of the string phrase. Otherwise, it should return false.

public boolean substringFound(String phrase, String key, int index)
{
String part = phrase.substring(index, index + key.length());
return part.equals(key);
}
Which of the following is the best precondition for index so that the method will return the appropriate result in all cases and a runtime error can be avoided? */
//The answer is D because key.length has to be less than or equal to index is les than phrase.length(). 



//Question 9, 5.3
/* Consider the following method.
/* missing precondition 
public void someMethod(int j, int k, String oldString)
{
String newString = oldString.substring(j, k);
System.out.println("New string: " + newString);
}
Which of the following is the most appropriate precondition for someMethod so that the call to substring does not throw an exception? */
//The answer is E because j needs to be less than or equal k and k needs to be between 0 and oldString.length(). 



//Question 10, 5.4
/* Consider the following class declaration.
public class Student
{
private String name;
private int age;
public Student(String n, int a)
{
name = n;
age = a;
}
public boolean isOlderThan5()
{
if (age > 5)
{
return true;
}
}
}
Which of the following best describes the reason this code segment will not compile? */
//This code segment will not compile because when the age is less than 5, a value will not return. 





    }
}
