package arbolito;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class graficado extends JPanel {
	public graficado() {
	}
	public int x1=200;
	public int x2=350;
	public int x3=50;
	public int y1=300;
	public int y2=400;
	public int y3=400;
	public Color [] cv= {Color.blue,Color.red,new Color(255,47,120),new Color(212,175,55),new Color(128,0,128), new Color(75,0,130)};
	private cambio c;
	public void paint(Graphics g) {
		this.setBackground(new Color(169,169,169));
		super.paint(g);
		g.setColor(new Color(110,90,30));		
		g.fillRect(180, 350, 35,80);
		g.setColor(Color.green);
		for(int i=1;i<=9;i++) {
			g.setColor(Color.green);
			int [] x = {x1,x2-(i*12),x3+(i*12)};
			int [] y = {y1-(i*25),y2-(i*25),y3-(i*25)};
			g.fillPolygon(x, y,3);
		}
		//extremos
		extremos1(g);
		cajitas(g);  	
		estrellita(g);
		relleno(g);
	}
	public void extremos1(Graphics g) {
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(90, y1-15, 20, 20);	    
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(70, y1+35, 20, 20);	    
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(110, y1-60, 20, 20);	   
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(130, y1-115, 20, 20);	    
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(247, y1-115, 20, 20);	    
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(265, y1-60, 20, 20);	    
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(310, y1+35, 20, 20);	    
		g.setColor(cv[(int)(Math.random()*6)]);
		g.fillOval(295, y1-15, 20, 20);    
	}
	public void relleno(Graphics g) {
		int j=10;
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(200, 285, j,j);	
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(175, 350, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(215,225, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(125, 300, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(250, 325, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(155, 215, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(160, 255, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(160, 175, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(195, 165, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(209, 140, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(225, 200, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(157, 333, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(215, 340, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(134, 362, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(260,358, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(260,280, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(260,280, j,j);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(222,244, j,j);

	}
	public void cajitas(Graphics g) {
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(300, 390, 40, 40);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(318, 390, 5, 40);
		g.fillRect(300, 407, 40, 5);

		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(300-40, 400, 30, 30);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(318-40, 400, 5, 30);
		g.fillRect(300-40, 412, 30, 5);
		
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(250-40, 390, 50, 40);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(260-40, 390, 5, 40);
		g.fillRect(260-50, 400, 50, 5);
		
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(176-40, 375, 25, 45);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(182-40, 375, 5, 45);
		g.fillRect(186-50, 383, 25, 5);
		
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(150-40, 390, 30,35);
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(153-40, 390, 5, 35);
		g.fillRect(160-50, 400, 30, 5);
	}
	public void estrellita(Graphics g) {
		int n=25;
		g.setColor(new Color(255,255,55));
		int[] coordenadasX={200,205,220,210,213,200,187,190,180,195};
        int[] coordenadasY={35+n,50+n,50+n,60+n,73+n,64+n,73+n,60+n,50+n,50+n};
		int nPuntos=10;
		g.fillPolygon(coordenadasX, coordenadasY, nPuntos);
	}
}