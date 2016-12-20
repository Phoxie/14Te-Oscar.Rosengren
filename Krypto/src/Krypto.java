import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Krypto extends JPanel {

	static int board[][] = new int [][]{
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
	};
	
	static int rectWidth = 60;
	static int rectHeight = 60;
	static int screenHeight = rectHeight * board.length + rectHeight / 2;
	static int screenWidth = rectWidth * board[0].length + 7;
	static int numberSize = 20;
	
	
	static Krypto krypto = new Krypto();
	static Checker checker = new Checker(0, 0, rectWidth, rectHeight);

	public void paint (Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		checker.paint(g2d);
		g.setColor(Color.black);
		
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				g.drawRect(j * rectWidth, i * rectHeight, rectWidth, rectHeight);
				g.setFont(new Font("Arial", Font.PLAIN,numberSize));
				g.drawString(String.valueOf(board[i][j]), j*rectWidth + 2, i * rectHeight + numberSize);
			}

		}
	
	}
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(screenWidth, screenHeight);
		frame.add(krypto);
		frame.setTitle("너덛자");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		
		
	}
}


