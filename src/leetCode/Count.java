package leetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Count {

	public static void main(String[] args) {

		String str = "IndiA Is My Country";

		System.out.println("Count Letters");
		long countLetters = str.chars().filter(Character::isAlphabetic).mapToObj(c -> (char) c).count();
		System.out.println(countLetters);

		System.out.println(" ");
		System.out.println("****************************************************");

		System.out.println("Count Vowel");
		long countVowel = str.toUpperCase().chars().filter(ch -> "AEIOU".indexOf(ch) >= 0).count();
		System.out.println(countVowel);

		System.out.println(" ");
		System.out.println("****************************************************");

		System.out.println("Count Vowel with Characters");
		str.toUpperCase().chars().filter(chh -> "AEIOU".indexOf(chh) >= 0)
				.forEach(count -> System.out.print((char) count + " "));

		System.out.println(" ");
		System.out.println("****************************************************");

		System.out.println("Count UpperCase");
		long countUc = str.chars().filter(Character::isUpperCase).mapToObj(cm -> (char) cm).count();
		System.out.println(countUc);

		System.out.println(" ");
		System.out.println("****************************************************");

		System.out.println("Count Upper and lower case");
		Map<Boolean, Long> countCaps = str.chars().filter(Character::isAlphabetic).mapToObj(cu -> (char) cu)
				.collect(Collectors.partitioningBy(Character::isUpperCase, Collectors.counting()));
		System.out.println("Number of UpperCase : " + countCaps.get(true));
		System.out.println("Number of LowerCase : " + countCaps.get(false));

		System.out.println(" ");
		System.out.println("****************************************************");

		System.out.println("Count Total Sum");
		int num[] = { 3, 5, 8, 10, 15, 20 };
		int target = 18;

//		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				if (num[i] + num[j] == target) {
//					System.out.println(i + " " + j);

		System.out.println(" ");
		System.out.println("****************************************************");

		IntStream.range(0, num.length).boxed()
				.flatMap(i -> IntStream.range(i + 1, num.length).filter(j -> num[i] + num[j] == target)
						.mapToObj(j -> new int[] { i , j }))
				.forEach(pair -> System.out.println(pair[0] + " " + pair[1]));
	

	int n = 5, firstTerm = 0, secondTerm = 1;for(
	int k = 0;k<5;k++)
	{
		System.out.print(firstTerm + ", ");

		int nextTerm = firstTerm + secondTerm;
		firstTerm = secondTerm;
		secondTerm = nextTerm;

	}System.out.println(" ");System.out.println("****************************************************");

	String name = "MADAM", reversed = "";

	for(
	int l = name.length() - 1;l>=0;l--)
	{
		reversed = reversed + name.charAt(l);
	}if(name.equalsIgnoreCase(reversed))
	{
		System.out.println("It is palindrome");
	}else
	{
		System.out.println("It's not palindrome");
	}System.out.println(" ");System.out.println("****************************************************");

	String toMirror = "Infosys Technologies";

	StringBuilder sb = new StringBuilder();for(
	int m = toMirror.length() - 1;m>=0;m--)
	{
		sb.append(toMirror.charAt(m));
	}System.out.println(sb.toString());

	String strToInt = "53545";
	int inti = Integer.parseInt(strToInt);

	System.out.println(inti);

	int intii = inti;
	String intToStr = Integer.toString(intii);System.out.println(intToStr);if(strToInt.equals(intii))
	{
		System.out.println("It's Equal");
	}else
	{
		System.out.println("It's not equal");
	}

	String firstName = "Vishal";
	String lastName = "RameshBabu";

	String fullName = firstName + lastName;System.out.println(fullName);

	StringBuilder sbr = new StringBuilder(firstName);
	String fullNameSbr = sbr.append(" ").append(lastName).toString().replace("V", "B");System.out.println(fullNameSbr);

	String[] nameToEliminate = { "Vishal", "Ramesh", "http", "http", "http" };

	Arrays.stream(nameToEliminate).filter(s->!s.equals("http")).forEach(print->System.out.print(print+", "));

}

}
