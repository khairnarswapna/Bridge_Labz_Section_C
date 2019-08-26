package com.bridgelabz.StringRegex;
import com.bridgelabz.utility.StrRegexUtility;
import java.util.*;

public class PoemLyricsRegex 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("****please select choice*****");
		System.out.println("1. Chicks ­ chick\n"+ "2. Duck ­ quack\n"+ "3. Turkey ­ gobble\n"+ "4. Pig ­ oink, oink\n"+ "5. Cow ­ moo, moo\n"
				+ "6. Cat ­meow, meow\n"+ "7. Mule ­ Heehaw\n"+ "8. Dog ­ bow wow\n" + "9. Turtle ­ nerp, nerp\n");
	 
		int userchoice=sc.nextInt();
		switch (userchoice) 
		{
		case 1:
			StrRegexUtility.PoemLyrics("Chicks", "chick");
			break;
		case 2:
			StrRegexUtility.PoemLyrics("Duck", "quack");
			break;
		case 3:
			StrRegexUtility.PoemLyrics("Turkey", "gobble");
			break;
		case 4:
			StrRegexUtility.PoemLyrics("Pig", "oink");
			break;
		case 5:
			StrRegexUtility.PoemLyrics("Cow", "moo");
			break;
		case 6:
			StrRegexUtility.PoemLyrics("Cat", "meow");
			break;
		case 7:
			StrRegexUtility.PoemLyrics("Mule", "Heehaw");
			break;
		case 8:
			StrRegexUtility.PoemLyrics("Dog", "bow");
			break;
		case 9:
			StrRegexUtility.PoemLyrics("Turtle", "nerp");
			break;
		default:
			System.out.println("please Select valid input");
			break;
		}
	 

	}


}
