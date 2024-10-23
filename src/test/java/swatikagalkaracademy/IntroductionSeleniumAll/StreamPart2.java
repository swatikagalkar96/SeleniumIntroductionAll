package swatikagalkaracademy.IntroductionSeleniumAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamPart2 {

	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");
		
		System.out.println("********************");
		System.out.println("How to create a stream?");
		long d=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		System.out.println("********************");
		
		System.out.println("Print names with length>4 using streams");
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("********************");
		
		System.out.println("Printing first name in the list");
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		System.out.println("********************");
		
		System.out.println("Print names which have last letter as A");
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("********************");
		
		System.out.println("Printing names with first letter as A with uppercase and sorted");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("********************");
		
		System.out.println("The below is the code for concatenating 2 arrays using streams");
		
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("Man");
		names1.add("Don");
		names1.add("Women");
		List<String> names2=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		
		Stream<String> newStream=Stream.concat(names1.stream(), names2.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		System.out.println("********************");
		
		System.out.println("How to check if any word is for example Adam present in the stream");
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(true);
		Assert.assertTrue(flag);
		System.out.println("********************");
		
		
		System.out.println("How to convert stream to list by priting alphabets ending with a  and getting first element");
		List<String> ls=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").
				filter(s->s.endsWith("a")).
				map(s->s.toUpperCase()).
				collect(Collectors.toList());
		System.out.println(ls.get(0));
		System.out.println("********************");
		
		System.out.println("Printing unique numbers in the list");
		List<Integer> values =Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("********************");
		
		System.out.println("Printing unique numbers in ascending order");
		List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
