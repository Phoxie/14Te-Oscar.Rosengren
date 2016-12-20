import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Checker {
	private int checkerWidth;
	private int checkerHeight;
	private int xPos;
	private int yPos;
	private int xVel;
	private int yVel;
	
	public Checker(int x, int y, int width, int height){
		checkerWidth = width;
		checkerHeight = height;
		xPos = x;
		yPos = y;
	}

	public void paint (Graphics2D g2d) {
		g2d.setColor(Color.pink);
		g2d.fillRect(xPos, yPos, checkerWidth, checkerHeight);
	}

	public void move (int board[][]){
		if(canMove(board)){
			xPos += xVel;
			yPos += yVel;
		}
		
	}
}
