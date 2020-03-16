
//Unit 5, Part B, Question 3, 5.6
public class BoolTest
{
private int one;
public BoolTest(int newOne)
{
one = newOne;
}
public int getOne()
{
return one;
}
public boolean isGreater(BoolTest other)
{
return one > other.one;
//the answer is e, because I tested all of the code segments and they all work



//Unit 5, Part B, Question 4, 5.7
/* Consider the following class definition.
public class Gadget
{
private static int status = 0;
public Gadget()
{
status = 10;
}
public static void setStatus(int s)
{
status = s;
}
}
The following code segment appears in a method in a class other than Gadget.

Gadget a = new Gadget();
Gadget.setStatus(3);
Gadget b = new Gadget();
Which of the following best describes the behavior of the code segment? */
//The correct answer is C, because the code creates two Gadget objects a and b and status is set to 10. 



//Unit 5, Part B, Question 5, 5.7
/* Consider the following class definition.
public class Beverage
{
private int numOunces;
private static int numSold = 0;
public Beverage(int numOz)
{
numOunces = numOz;
}
public static void sell(int n)
{
/* implementation not shown */
//}
//}
//Which of the following best describes the sell method’s level of access to the numOunces and numSold variables? 
//The answer is E because numSold can be accessed and udpated because it is a static method, but numOunces cannot be accessed or updated because it's an instance variable.



//Unit 5, Part B, Question 6, 5.7
/* The following class is used to represent shipping containers. Each container can hold a number of units equal to unitsPerContainer.
public class UnitsHandler
{
private static int totalUnits = 0;
private static int containers = 0;
private static int unitsPerContainer = 0;
public UnitsHandler(int containerSize)
{
unitsPerContainer = containerSize;
}
public static void update(int c)
{
containers = c;
totalUnits = unitsPerContainer * containers;
}
}
The following code segment appears in a method in a class other than UnitsHandler. Assume that no other code segments have created or modified UnitsHandler objects.

UnitsHandler large = new UnitsHandler(100);
UnitsHandler.update(8);
Which of the following best describes the behavior of the code segment? */
//The answer is E because the code creates an object called large adn sets unitsPerContainer to 100 and then sets containers to 8 and totalUnits to 800.



//Unit 5, Part B, Question 8, 5.8
/* Consider the following class declaration.
public class Student
{
private String firstName;
private String lastName;
private int age;
public Student(String firstName, String lastName, int age)
{
firstName = firstName;
lastName = lastName;
age = age;
}
public String toString()
{
return firstName + " " + lastName;
}
}
The following code segment appears in a method in a class other than Student. It is intended to create a Student object and then to print the first name and last name associated with that object.
Student s = new Student("Priya", "Banerjee", -1);
System.out.println(s);
Which of the following best explains why the code segment does not work as expected? */
//The answer is D because the variables firstName, lastName, and age refer to the local variables instead of the instance variables. 



//Unit 5, Part B, Question 11, 5.9
/* Consider the following class definition.
public class Person
{
private String name;
private int feet;
private int inches;
public Person(String nm, int ft, int in)
{
name = nm;
feet = ft;
inches = in;
}
public int heightInInches()
{
return feet * 12 + inches;
}
public String getName()
{
return name;
}
public String compareHeights(person other)
{
if (this.heightInInches() < other.heightInInches())
{
return name;
}
else if (this.heightInInches() > other.heightInInches())
{
return other.getName();
}
else return "Same"
}
}
The following code segment appears in a method in a class other than Person.

Person andy = new Person("Andrew", 5, 6);
Person ben = new Person("Benjamin", 6, 5);
System.out.println(andy.compareHeights(ben));
What, if anything, is printed as a result of executing the code segment? */
//The answer is A because the name of the person who is shorter is returned, and Andrew is shorter (in inches) so his name is returned. 

}
}
