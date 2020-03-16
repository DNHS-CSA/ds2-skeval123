
public class Unit4
{
    public static void main(String[] args) {

        
//4.1, Q:Which of the following can be used as a replacement for /* missing code */ so that the code segment works as intended?        
int x = 100;
int total = 0;
while( x >= 10 )
{
total = total + x;
x = x - 10;
}
System.out.println(x);
//The correct answer is x is greater than or equal to 10 because in the last iteration, x=10.

//4.4, Q:I tested all of the answer choices and the only one that works as intended is d (x >= 10). 
//Which of the following can be used to replace /* missing loop header */ so that the code segment will work as intended?
for (int k = 0; k < 4; k++)
{
/* missing loop header */for (int h = k; h >= 0; h--)
{
System.out.print(k);
}
System.out.println();
}
//only answer choice D makes the code work as intended.


//4.4, Q: Which of the following best explains how changing the inner for loop header to  for (int k = j; k < 4; k++)  will affect the output of the code segment?
for (int j = 0; j < 4; j++)
{
//for (int k = 0; k < j; k++)
for (int k = j; k < 4; k++)
{
System.out.println("hello");
}
}
// the correct answer choice is E, because the string "hello" was printed 4 additional times.


//4.3, Q: The following code segment appears in another method in the same class.System.out.println(mystery("Mississippi", "si")); What, if anything, is printed as a result of executing the code segment?
 /*public static int mystery(String string1, String string2)
{
String temp = string1;
int position = 0;
int result = 0;
while(temp.indexOf(string2) >= 0)
{
position = temp.indexOf(string2);
result++;
temp = temp.substring(position + 1);
}
return result; */

//the answer is C, because "si" is in "mississippi" twice. 
}
  }
