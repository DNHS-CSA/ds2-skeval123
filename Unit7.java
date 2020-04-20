//Unit 7 MCQ, 7.4, Question 10
import java.util.*;
public class Unit7
{
    public static void main(String [] args)
    {
    /* Question: The method isReversed is intended to return true if firstList and secondList 
    contain the same elements but in reverse order, and to return false otherwise. The method does not always work as intended. 
    For which of the following inputs does the method NOT return the correct value? */
        ArrayList firstArray = new ArrayList();
        ArrayList secondArray = new ArrayList();
        
        //choice A
        firstArray.add(0, 1);
        firstArray.add(1, 3);
        firstArray.add(2, 3);
        firstArray.add(3, 1);
        
        secondArray.add(0, 1);
        secondArray.add(1, 3);
        secondArray.add(2, 3);
        secondArray.add(3, 1);
        System.out.println(isReversed(firstArray, secondArray));
        //returns true(correct)
        
        //choice B
        firstArray.clear();
        secondArray.clear();
        firstArray.add(0, 1);
        firstArray.add(1, 3);
        firstArray.add(2, 3);
        firstArray.add(3, 1);
        
        secondArray.add(0, 3);
        secondArray.add(1, 1);
        secondArray.add(2, 1);
        secondArray.add(3, 3);
        System.out.println(isReversed(firstArray, secondArray));
        //returns false(correct)
        
        //choice C
        firstArray.clear();
        secondArray.clear();
        firstArray.add(0, 1);
        firstArray.add(1, 3);
        firstArray.add(2, 5);
        firstArray.add(3, 7);
        
        secondArray.add(0, 5);
        secondArray.add(1, 5);
        secondArray.add(2, 3);
        secondArray.add(3, 1);
        System.out.println(isReversed(firstArray, secondArray));
        //This is the correct answer because it should return false, but it returns true.
        
        //choice D
        firstArray.clear();
        secondArray.clear();
        firstArray.add(0, 1);
        firstArray.add(1, 3);
        firstArray.add(2, 5);
        firstArray.add(3, 7);
        
        secondArray.add(0, 7);
        secondArray.add(1, 5);
        secondArray.add(2, 3);
        secondArray.add(3, 1);
        System.out.println(isReversed(firstArray, secondArray));
        //returns true(correct)
        
        //choice E
        firstArray.clear();
        secondArray.clear();
        firstArray.add(0, 1);
        firstArray.add(1, 3);
        firstArray.add(2, 5);
        firstArray.add(3, 7);
        
        secondArray.add(0, 7);
        secondArray.add(1, 5);
        secondArray.add(2, 3);
        secondArray.add(3, 3);
        System.out.println(isReversed(firstArray, secondArray));
        //returns false(correct)
    }
    
    public static boolean isReversed(ArrayList<Integer> firstList, ArrayList<Integer> secondList)
    {
        for (int j = 0; j < firstList.size() / 2; j++)
        {
            if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))
            {
                return false;
            }
        }
        return true;
    }

    
}
