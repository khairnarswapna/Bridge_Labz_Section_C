/*
 *Write a Program to simulate a walker, starting in the center of an n by n grid, move
one step at a time, choosing to go left, right, up, or down with equal probability at
each step. The program RandomWalkers.java will show the number of steps taken
before all cells are touched. Extend this program to show N Walkers taken as Input
to show the corresponding steps they have taken. Store and Print the Result in the
End
 */
package com.bridgelabz.ArraysPgm;
import java.util.*;

public class RandomWalkers 
{
		
	public static int counter = 0,gd;
 	public static boolean end = false;
	public static int leftMove = 0, rightMove = 0, topMove = 0, bottomMove = 0;
	public static char[][] board; /*grid board*/

	public static void main(String[] args) 
	{
		 
		System.out.println("Please enter grid size in odd number from 3 to 9");
		Scanner sc = new Scanner(System.in);
		gd = sc.nextInt();

		if (gd % 2 != 0 && gd <= 9 && gd >= 1) 
		{
			board = new char[gd][gd];
			for (int i = 0; i < board.length; i++) 
			{
				for (int j = 0; j < board[i].length; j++) 
				{
					board[i][j] = '-';    //all position of grid with '-'
				}
			}
			if (gd == 3) 
			{
				board[1][1] = 'X';
				printBoard();
				
			} 
			else if (gd == 5)  /*when grid is 5X5 start from Board[2][2]*/
			{
				board[2][2] = 'X';
				printBoard();
				
			} else if (gd == 7)
			{
				board[3][3] = 'X';
				printBoard();
				
			} else 
			{
				// for grid=9
				board[4][4] = 'X';
				printBoard();
			}
			while (!end) 
			{
				move();
				printBoard();
			}
			if(end) 
			{
				System.out.println("Calculating probability");
				int totalmove=leftMove+rightMove+topMove+bottomMove;
				double prob=totalmove/(counter-1);
				System.out.println("Probability is :"+prob);
				System.out.println("Printing board");
				printBoard();
			}

		} else
			System.out.println("Please enter valid grid");

		sc.close();
	}

	private static void printBoard() 
	{
		 
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void move() 
	{
		Random random = new Random();
		int r = random.nextInt(4);// generate 0 to 3
		if (r == 0) 
		{
			moveLeft();
		} else if (r == 1) 
		{
			moveRight();
		} else if (r == 2) 
		{
			moveTop();
		} 
		else 
		{
			moveBottom();
		}
		counter++;
		if (counter == gd * gd) 
		{
			end = true;
		}
	}

	private static void moveBottom() 
	{
		 
		System.out.println("Moving Bottom:");
	 
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				if (board[i][j] == 'X') 
				{
					if(i==board.length-1)
					{
						System.out.println("cannot move further");
						break;
					}else 
					{
						board[i][j] = '-';
						board[i + 1][j] = 'X';
						bottomMove++;
					}
					
				}
				
			}
		}
		
	}

	private static void moveTop() 
	{
		 
		System.out.println("Moving Top");
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				
				if (board[i][j] == 'X') 
				{
					if(i==0)  /*when row is 0 we can not move top*/
					{
						System.out.println("cannot move further");
						break;
					}
					else 
					{
						board[i][j] = '-';
						board[i - 1][j] = 'X'; /*we want to move top column are same but row become reduce i.e board[i-1][j]*/
						topMove++; 
					}
					
				}
				
			}
		}
		
	}

	private static void moveRight() 
	{
		 
		System.out.println("Moving Right");
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				
				if (board[i][j] == 'X') 
				{
					if(j==board[i].length-1) 
					{
						System.out.println("cannot move further");
						break;
					}
					else 
					{
						board[i][j] = '-';
						board[i][j + 1] = 'X'; /*we want to move right so row are same column keeps on changing 
													in right way so that board[i][j+1]*/
						rightMove++;
					}
					
				}
			}
		}
		
	}

	private static void moveLeft() 
	{
		 
		System.out.println("Moving Left");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) 
			{
				if (board[i][j] == 'X') 
				{
					if(j==0) 
					{
						System.out.println("cannot move further");
						break;
					}else {
						board[i][j] = '-';
						board[i][j - 1] = 'X';
						leftMove++;
					}
					
				}
			}
		}
		
	}

}