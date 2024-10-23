package swatikagalkaracademy.IntroductionSeleniumAll;

import java.util.ArrayList;

public class StreamsPart1 {

	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count =0;
		
		
		System.out.println("Printing names which starts with A using normal way");
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("***********");
		
		System.out.println("Printing names which starts with A using streams");
		long count1=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count1);
	}

}
