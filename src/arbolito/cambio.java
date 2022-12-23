package arbolito;

import java.awt.Color;
import java.awt.Graphics;

public class cambio extends Thread{
	private ejecutable g;
	public cambio(String n,ejecutable g) {
		super.setName(n);
		this.g=g;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			g.panel_1.setVisible(false);
			g.panel_1.setVisible(true);
			try {
				cambio.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
