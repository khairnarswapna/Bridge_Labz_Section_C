package com.bridgelabz.ArraysPgm;
import java.util.*;

public class RandomWalkers 
{
		
        static int Lmove=0,Rmove=0,Tmove=0,Bmove=0,count=0;
        static boolean status=false;
        static Scanner sc=new Scanner(System.in);
        static int i,j;

	 
        static char[][] Board;
		public static void main(String args[])
		{  
			System.out.println("Enter the Grid Size in range of 3 to 9");
			int gd=sc.nextInt();
			if(gd %2 !=0 && gd<=2 && gd>=1)
			{
				Board=new char[gd][gd];
				for(i=0;i<Board.length;i++)
				{
					for(j=0;j<Board.length;j++)
					{
						if(gd==3)
						{
							Board[1][1]='x';
							PrintigBoard();
							
                             
						}else if(gd==5)
						{
							Board[2][2]='x';
							PrintigBoard();
						}
						else if(gd==7)
						{
							Board[3][3]='X';
							PrintigBoard();
						}
						else
						{ 
							Board[4][4]='X';
							PrintigBoard();
						}
						  
					}
				}
			}
		/*	while(status)
			{
				move();
				printBaord();
				
			}*/
			 
			
		}
		public static void PrintigBoard()
		{
			 for(i=0;i<Board.length;i++)
			 {
				 for(j=0;j<Board.length;j++)
				 {
					  Board[i][j]='X';
				 }
			 }
		}
		public static void Move()
		{
			Random r=new Random();
			int m=r.nextInt(3);
			if(m==0)
			{
				Moveleft();
			}
			else if(m==1) 
			{
				MoveRight();
			}
			else if(m==2) {
				MoveTop();
			}
			else {
				Movebottom();
			}
				
			
		}
		public static void Moveleft()
		{

			 for(i=0;i<Board.length;i++)
			 {
				 for(j=0;j<Board.length;j++)
				{
					 if(Board[i][j]=='X')
					 {
					 	if(i==0)
					 	{
					 		System.out.println("no more move left side");
					 	}
					 	else
					 	{
					 		Board[i][j]='X';
					 		Board[i-1][j]='-';
					 		Tmove++;
					 	
					 	}
					 }
				  }
					
				 }
			 }
				public static void MoveRight()
				{
				
					 for(i=0;i<Board.length;i++)
					 {
						 for(j=0;j<Board.length;j++)
						{
							 	if(i==1)
							 	{
							 		System.out.println("no more move left side");
							 	}
							 	else
							 	{
							 		Board[i][j]='X';
							 		Board[i-1][j]='-';
							 		Rmove++;
							 	
							 	}
							 	 
						}
						 
					 }
					 
				}
				public static void MoveTop()
				{
				
					 for(i=0;i<Board.length;i++)
					 {
						 for(j=0;j<Board.length;j++)
						{
							 	if(i==2)
							 	{
							 		System.out.println("no more move left side");
							 	}
							 	else
							 	{
							 		Board[i][j]='X';
							 		Board[i-1][j]='-';
							 		Tmove++;
							 	
							 	}
							 	 
						}
						 
					 }
				}
				public static void Movebottom()
				{
				
					 for(i=0;i<Board.length;i++)
					 {
						 for(j=0;j<Board.length;j++)
						{
							
							 	if(i==1)
							 	{
							 		System.out.println("no more move left side");
							 	}
							 	else
							 	{
							 		Board[i][j]='X';
							 		Board[i-1][j]='-';
							 		Bmove++;
							 	
							 	}
							 	 
						}
						 
					 }
				}
}