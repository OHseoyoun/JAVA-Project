package Ticketing;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class board extends JFrame{
	JButton jb1;
	JButton jb2;
	JButton jb3;
	public board(){
		String imgPath1 = "img/playimg.jpg";
		ImageIcon originIcon = new ImageIcon(imgPath1);  
		Image originImg = originIcon.getImage(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image play = originImg.getScaledInstance(90, 50, Image.SCALE_SMOOTH );
		
		String imgPath3 = "img/akmu.jpg";
		ImageIcon originIcon3 = new ImageIcon(imgPath3);  
		Image originImg3 = originIcon3.getImage();
		Image akmu = originImg3.getScaledInstance(350, 800, Image.SCALE_SMOOTH );
		JLabel pi = new JLabel(new ImageIcon(akmu));
		
		String imgPath = "img/exo.jpg";
		ImageIcon originIcon6 = new ImageIcon(imgPath);  
		Image originImg4 = originIcon6.getImage();
		Image exo = originImg4.getScaledInstance(350, 800, Image.SCALE_SMOOTH );
		JLabel exo1 = new JLabel(new ImageIcon(exo));
		
		String imgPath2 = "img/infinite.jpg";
		ImageIcon originIcon1 = new ImageIcon(imgPath2);  
		Image originImg1 = originIcon1.getImage();
		Image infinite = originImg1.getScaledInstance(350, 800, Image.SCALE_SMOOTH );
		JLabel infinite1 = new JLabel(new ImageIcon(infinite));
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		JPanel jp6 = new JPanel();
		
		jb1 = new JButton(new ImageIcon(play));
		jb2 = new JButton(new ImageIcon(play));
		jb3 = new JButton(new ImageIcon(play));
		jb1.addActionListener(new play());
		
		jb1.setOpaque(false);jb1.setContentAreaFilled(false);jb1.setFocusPainted(false);jb1.setBorderPainted(false);
		jb2.setOpaque(false);jb2.setContentAreaFilled(false);jb2.setFocusPainted(false);jb2.setBorderPainted(false);
		jb3.setOpaque(false);jb3.setContentAreaFilled(false);jb3.setFocusPainted(false);jb3.setBorderPainted(false);
		
		jp1.add(pi);
		jp2.add(exo1);
		jp3.add(infinite1);
		jp4.add(jb1);
		jp5.add(jb2);
		jp6.add(jb3);
		add(jp1);
		add(jp2);
		add(jp3);
		add(jp4);
		add(jp5);
		add(jp6);
		
		jb1.addActionListener(new play());
		jb2.addActionListener(new play());
		jb3.addActionListener(new play());
		setLayout(new GridLayout(2,3));
		setVisible(true);
		setSize(1200,800);
	}
	class play implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object ob1 = e.getSource();
			Object ob2 = e.getSource();
			Object ob3 = e.getSource();
			
			if(jb1==ob1){
				JFrame fr1 = new JFrame();
	            fr1.setContentPane(new Secure());	
			}
			else if(jb2==ob1){
				JFrame fr2 = new JFrame();
	            fr2.setContentPane(new Secure());	
			}
			if(jb3==ob3){
				JFrame fr3 = new JFrame();
	            fr3.setContentPane(new Secure());	
			}
		}
		
	}//end of play
}
