//WAP that reverses the letter of each word and a program that reverses the letter of each word and the word themselves

package Questions;

public class Q_2 
{
	public static String reverseWords(String string)
	{
		String[] words=string.split(" ");
		StringBuilder reversedWords=new StringBuilder( );
		for(String word : words)
		{
			StringBuilder reversedWord=new StringBuilder(word);
			reversedWord.reverse( );
			reversedWords.append(reversedWord).append(" ");
		}
		return reversedWords.toString( ).trim( );
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       String originalString="Hello world, how are you?";
       String reversedString=reverseWords(originalString);
       System.out.println(reversedString);
       String eachWord=reverseWords(reversedString);
       System.out.println(eachWord);
	}

}
