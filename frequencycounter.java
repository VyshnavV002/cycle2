import java.util.*;

class frequencycounter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String word;
		int count=0,i;
		
		System.out.println("Enter the word:");
		word=sc.nextLine();
		
		int n=word.length();
		char s;
		System.out.println("Enter the item to be counted:");
		s=sc.next().charAt(0);
		
		for(i=0;i<n;i++)
		{
			if(word.charAt(i)==s)
			{
				count++;
			}
		}
		
		System.out.println("Frequency of "+s+" in "+word+" is:"+count);
		
	}
}
