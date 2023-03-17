package javachallenge;

public class Palindrome2 {

	public static void main(String[] args) {
		boolean palindrome=false;
		String word="race a car";
		String word2= word.replace(" ", "");
		String result="";
		System.out.println(word2);
		System.out.println("---------");
		for (int i = word2.length()-1; i >=0 ; i--) {
			char singlechar = word2.charAt(i);
			result+= singlechar;
		}
		System.out.println("the result word is: "+result);
		if(word2.equals(result))
		{
			palindrome=true;
			System.out.println(palindrome+"  it is a plindrome");
		}
		else
		{
			palindrome=false;
			System.out.println(palindrome+" it it not a palindrome");
		}
	}
	

}
