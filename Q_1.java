//WAP to count the duplicate Characters from a given string
package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Q_1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        String input = "JavaJavaEE"; //Given input string
        
        Map <Character,Integer> countDuplicateMap = new HashMap <>();  //Create a HashMap

        char[] charArray = input.toCharArray(); // Converts this string to a new character array.

        for (char c: charArray) 
        {
            if (countDuplicateMap.containsKey(c))
            {
                // get value by key and increment it's value by a
                countDuplicateMap.put(c, countDuplicateMap.get(c)+1);
            } 
            else 
            {
                countDuplicateMap.put(c,1);
            }
        }


        for (Entry<Character, Integer> entry:countDuplicateMap.entrySet()) 
        {

            if (entry.getValue()>1) 
            {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
	}

}
