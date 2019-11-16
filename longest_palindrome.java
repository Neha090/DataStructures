package achievers;

import java.util.Scanner;

public class longest_palindrome {
	
	static int isPalindrome(String str)
	{
		int count=0;
		char ch[]=str.toCharArray();
		
		int j=ch.length-1;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch[j])
			{
				count++;
				j--;
			}
		}
		if(count==ch.length)
		{
			return count;
		}
		else
		{
			return 0;
		}
		
	//	return false;
}
	
	public static void main(String[] args) {
	
	
		int count=0,flag=0;
	Scanner sc=new Scanner(System.in);
	String print="";
	System.out.println("Enter the string");
	String str=sc.next();
	int n=str.length();
	
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<=n;j++)
		{
			String s=str.substring(i,j);
			int u=isPalindrome(s);
			if(u>count)
			{
				count=u;
				print=s;
			}
		}
	}
	
	System.out.println(print);
	
	
	
	

    
   
	
	}
	
}
