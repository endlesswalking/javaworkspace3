public class Game
{
	public static void main(String[] args)
	{
		Game newGame = new Game();
		newGame.play(Action.RIGHT);
		newGame.play(Action.DOWN);
		newGame.play(Action.STOP);
	}
	
	public void play(Action action)
	{
		switch(action)
		{
			case STOP :
				System.out.println("����");
				break;
			case RIGHT :
				System.out.println("�k��");
				break;
			case LEFT :
				System.out.println("����");
				break;
			case UP :
				System.out.println("�W��");
				break;
			case DOWN :
				System.out.println("�U��");
				break;
		}
	}
}
