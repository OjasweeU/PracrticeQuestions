//WAP that counts the occurence of certain character in a given string
package Questions;

public class Q_4 
{
	public static int count(String s, char c)
    {
        int res = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
            res++;
        }
        return res;
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str= "geeksforgeeks";
        char c = 'e';
        System.out.println(count(str, c));
	}

}
