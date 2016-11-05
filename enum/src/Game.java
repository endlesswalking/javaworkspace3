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
				System.out.println("°±¤î");
				break;
			case RIGHT :
				System.out.println("¥k²¾");
				break;
			case LEFT :
				System.out.println("¥ª²¾");
				break;
			case UP :
				System.out.println("¤W²¾");
				break;
			case DOWN :
				System.out.println("¤U²¾");
				break;
		}
	}
}
