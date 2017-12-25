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

public class yes24 extends JFrame{
	JButton signin;
	JButton start;
	public yes24(){
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JLabel jl = new JLabel();
		jl.setSize(500,350);
		
		Icon pic = new ImageIcon("img/yes24logo.jpg");
		JLabel pi = new JLabel(pic);
		
		p.setLayout(new GridLayout(3,1));
		
		signin = new JButton("회원모드");
		start = new JButton("비회원모드");
		
		signin.setBorderPainted(false);signin.setFocusPainted(false);signin.setContentAreaFilled(false);signin.setOpaque(false);
		start.setBorderPainted(false);start.setFocusPainted(false);start.setContentAreaFilled(false);start.setOpaque(false);
		
		signin.addActionListener(new selectoption());
		start.addActionListener(new selectoption());
		
		p.add(pi);
		p.add(signin);
		p.add(start);
		add(p);
		setTitle("YES24");//창 제목설정
		setSize(1200,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class selectoption implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object ob = e.getSource();
			
			if(ob == signin){
				JFrame fr1 = new JFrame();
	            fr1.setContentPane(new signinInterpark());	
			}//end of if
			
			if(ob == start){ 
				JFrame fr2 = new JFrame();
				fr2.setContentPane(new setTimer());
			}//end of if
			
		}
		
	}//end of play

}