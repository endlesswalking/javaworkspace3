package chapter5Practice;

import java.util.Arrays;

public class EightQueens
{
	public static void main(String[] args)
	{
		int[][] chessBoard = new int[8][8];
		for(int i=0;i<8;i++)
		{
			Arrays.fill(chessBoard[i],0);			
		}
		
		for(int i=1;i<=8;i++)
		{
			Queen queen = new Queen(i);
			queen.searchSeat(chessBoard);
		}
		
		// show the chessBoard
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(chessBoard[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
