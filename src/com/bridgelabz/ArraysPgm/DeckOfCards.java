/*
 * Write a Program to Initialize the Deck of Cards, Shuffle the Deck of Cards using
Random method and then distribute 9 Cards to 4 Players and Print the Cards the
received by the 4 Players…
 */
package com.bridgelabz.ArraysPgm;
import com.bridgelabz.utility.ArrUtility;

public class DeckOfCards 
{
	public static void main(String[] args) {
		String[] cardType = { "hearts", "tiles", "pikes", "clovers" };
		char[] cardNumbers = { '1', '2', '3', '4', '5', '6', '7', '8', '9', 't', 'j', 'q', 'k' };
		String[] cardsArray = new String[52];
		int start = 0, end = 12, j1 = 0;
		                               
		for (int i = 0; i < 4; i++) /* for combination of cardType and cardNumbers*/
		{
			for (int j = start; j <= end; j++) 
			{
				cardsArray[j] = cardType[i] + " " + cardNumbers[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}
 
		ArrUtility.shuffleCardsDeck(cardsArray);
		System.out.println("**************************************");

	
		int j2 = 0;
		for (int i = 0; i < 4; i++)    /*printing cards for 4 players*/
		{
			System.out.print("For Player " + i + 1 + ": \n");
			for (int j = 0; j < 9; j++) 
			{

				System.out.print(cardsArray[j2] + " ");
				j2++;
			}
			System.out.println();
		}

	}

}
