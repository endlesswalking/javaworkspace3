package chapter5Practice;

public class Queen
{
	int number;
	Queen(int a)
	{	
		this.number = a;
	}
	
	public void searchSeat(int[][] chessBoard)
	{
		while(true)
		{
			int x = (int)(Math.random()*8);
			int y = (int)(Math.random()*8);
			boolean xAxisResult = Queen.checkXaxis(x, y,chessBoard);
			boolean yAxisResult = Queen.checkYaxis(x, y,chessBoard);
			
			if(xAxisResult==true && yAxisResult==true)
			{
				chessBoard[x][y] = number;
				break;
			}
			else
			{
				continue;
			}
		}
	}
	
	public static boolean checkXaxis(int x,int y,int[][] board)
	{
		boolean result = true;
		for(int i=0;i<8;i++)
		{
			if(board[x][i]!=0)
			{
				result = false;
			}
			else
			{}
		}
		return result;
	}
	
	public static boolean checkYaxis(int x,int y,int[][] board)
	{
		boolean result = true;
		for(int i=0;i<8;i++)
		{
			if(board[i][y]!=0)
			{
				result = false;
			}
			else
			{}
		}
		return result;
	}
}
