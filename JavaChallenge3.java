package javachallenge;
public class JavaChallenge3 
{
	public static String removeAllNonAlphaNumeric(String s) 
	{
		
		return s.replaceAll("[^a-zA-Z0-9]","");
	}
	public static void main(String[] args) 
		{
		boolean palindrome =false;
		String s="A man, a plan, a canal: Panama";
		String result="";
		String concatstring =removeAllNonAlphaNumeric(s);
		String lowerCase1 = concatstring.toLowerCase();
		System.out.println(lowerCase1);
		
		for (int i = lowerCase1.length()-1; i >=0 ; i--) {
			char singlechar = lowerCase1.charAt(i);
			//System.out.print(singlechar);
					result+=singlechar;
		}
		System.out.println("the resultant: "+result);
		if(lowerCase1.equals(result)) 
		{
			palindrome=true;
			System.out.println(palindrome+"  !,it is a palindrome");
		}
		else
		{
			palindrome=false;
			System.out.println(palindrome+" it is not");
		}
		}
	}

