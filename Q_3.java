//WAP that checks whether the given string contains only digits 
package Questions;
import java.util.Scanner;
public class Q_3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner cs=new Scanner(System.in);
		String str;
		int count=0, in;
		System.out.println("Enter your String:");
		str=cs.nextLine();
		 for(in=0;in<str.length();in++)
		  {
		            if(str.charAt(in)>='0' && str.charAt(in) <= '9')
		            {
		                  count++;
		            }
		    }
		    if(count==str.length())
		    {
		    	System.out.print("String contains only digits.");
		    }
		    else 
		    {
		    	System.out.print("String does not contains only digits.");
		    }
		cs.close();
	}

}
