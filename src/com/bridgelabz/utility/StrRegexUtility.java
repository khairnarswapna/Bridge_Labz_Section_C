package com.bridgelabz.utility;
import java.text.*;
 
import java.util.*;


public class StrRegexUtility 
{

	public static void Message(String FullName, String mobile_no) 
	{

		String str1,str2,str3,str4;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstName = FullName.substring(0, FullName.indexOf(' '));
		String str = "Hello <<name>>, We have your full name\r\n"+ "as <<fullname>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\r\n"
				+ "know in case of any clarification Thank you BridgeLabz Date.";
		str1 = str.replaceAll("<<name>>", firstName);
		str2 = str1.replaceAll("<<fullname>>", FullName);
		 str3 = str2.replaceAll("xxxxxxxxxx", mobile_no);
		str4 = str3.replaceAll("Date", dateFormat.format(date));

		System.out.println(str4);

	}
	public static void PoemLyrics(String Animal, String Sound) 
	{
		String str = "Old MACDONALD had a farm\n" + "E-I-E-I-O\n" + "And on his farm he had a ANIMAL\n" + "E-I-E-I-O\n"
				+ "With a SOUND SOUND here\n" + "And a SOUND SOUND there\n" + "Here a SOUND, there a SOUND\n"
				+ "Everywhere a SOUND SOUND\n" + "Old MacDonald had a farm\n" + "E-I-E-I-O";
		String Str1 = str.replaceAll("ANIMAL", Animal);
		String replaceStr = Str1.replaceAll("SOUND", Sound);

		System.out.println(replaceStr);
	}



}
