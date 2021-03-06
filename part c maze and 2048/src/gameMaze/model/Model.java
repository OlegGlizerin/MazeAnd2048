package gameMaze.model;

public interface Model {

	public void moveUP();
	public void moveDown();
	public void moveRight();
	public void moveLeft();
	public void moveUpRight();
	public void moveUpLeft();
	public void moveDownRight();
	public void moveDownLeft();
	public int[][] getMaze();
	public void restartGame();
	public void undoMove();
	public void initGame();
	public void doUserCommand(int num);
}
