package template.pattern;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "Java Graphics";
		graphics.drawString(msg,100,100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame("Template Method Swing");
	}

}
