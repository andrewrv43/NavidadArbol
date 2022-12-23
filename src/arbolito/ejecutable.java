package arbolito;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ejecutable extends JFrame {
	public graficado g=new graficado();
	private JPanel contentPane;
	public JPanel panel_1;
	private cambio h1;
	private cambio h2;
	private cambio h3;
	private int v=0;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejecutable frame = new ejecutable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ejecutable() {		
		setTitle("ARBOLITO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(70,130,180));
		panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 417, 492);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		g = new graficado();
		g.setBounds(0, 0, 417, 491);
		panel_1.add(g);
		g.setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(355, 0, 62, 62);
		ImageIcon image5 = new ImageIcon(ejecutable.class.getResource("/Images/logoups.png"));
		Icon icon5 = new ImageIcon (image5.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));
		lblNewLabel.setIcon(icon5);
		g.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("FELIZ NAVIDAD!!");
		lblNewLabel_1.setForeground(new Color(255, 0, 51));
		lblNewLabel_1.setFont(new Font("Zilla Slab", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(89, 439, 241, 42);
		g.add(lblNewLabel_1);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(31, 522, 384, 57);
		contentPane.add(panel);
		panel.setBackground((new Color(70,130,180)));
		JButton btnNewButton = new JButton("MAS VELOCIDAD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(v==0) {
					h1=new cambio("",ejecutable.this);
					h1.start();
					v++;
				}else if(v==1) {
					h2=new cambio("",ejecutable.this);
					h2.start();
					v++;
				}
				else if(v==2){
					h3=new cambio("",ejecutable.this);
					h3.start();
					v++;
				}		
			}
		});
		btnNewButton.setBounds(195, 10, 160, 37);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MENOS VELOCIDAD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(v==1) {		
						h1.stop();
						v--;
				}else if(v==2) {
					h2.stop();
					v--;
				}
				else if(v==3){
					v--;
					h3.stop();
				}
			}
		});
		btnNewButton_1.setBounds(10, 10, 157, 37);
		
		panel.add(btnNewButton_1);
	}
}