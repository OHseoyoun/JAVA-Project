package Ticketing;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {
    public static void main(String[] args) {
    	
    	JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(1200,600);//프레임 크기 설정
        frame.setTitle("MAIN");//창 제목설정
        frame.setContentPane(new SelectionGUI()); 
        frame.setLayout(new GridLayout(2,2));
        frame.setVisible(true);	
    }
}
class SelectionGUI extends JPanel{ 
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	
	public SelectionGUI(){
		JPanel p1 = new JPanel();
		JLabel jl = new JLabel("티켓팅게임");
		p1.setLayout(new GridLayout(2,2));
		
		Font font = new Font("돋움", Font.PLAIN, 30);
		jl.setFont(font);
		
		Image originIcon = new ImageIcon(
				getClass().getClassLoader().getResource("interparklogo.jpg")).getImage();  
		Image originImg = originIcon;
		Image interpark = originImg.getScaledInstance(300, 150, Image.SCALE_SMOOTH );
		
		Image imgPath2 = new ImageIcon(
				getClass().getClassLoader().getResource("melonlogo.jpg")).getImage();  
		Image originImg2 = imgPath2;
		Image melon = originImg2.getScaledInstance(300, 150, Image.SCALE_SMOOTH );
		
		Image originIcon3 = new ImageIcon(
				getClass().getClassLoader().getResource("yes24logo.jpg")).getImage(); 
		Image originImg3 = originIcon3;
		Image yes24 = originImg3.getScaledInstance(300, 150, Image.SCALE_SMOOTH );
		
		String imgPath4 = "img/cgvlogo.png";
		ImageIcon originIcon4 = new ImageIcon(imgPath4);

		Image originIcon4 = new ImageIcon(
				getClass().getClassLoader().getResource("cgvlogo.png")).getImage();
		Image originImg4 = originIcon4; 
		Image cgv = originImg4.getScaledInstance(300, 150, Image.SCALE_SMOOTH );

		button1 = new JButton(new ImageIcon(interpark));
		button2 = new JButton(new ImageIcon(melon));
		button3 = new JButton(new ImageIcon(yes24));
		button4 = new JButton(new ImageIcon(cgv));
		button1.setBorderPainted(false);button2.setBorderPainted(false);button3.setBorderPainted(false);button4.setBorderPainted(false);
		button1.setFocusPainted(false);button2.setFocusPainted(false);button3.setFocusPainted(false);button4.setFocusPainted(false);
		button1.setContentAreaFilled(false);button2.setContentAreaFilled(false);button3.setContentAreaFilled(false);button4.setContentAreaFilled(false);
		button1.setOpaque(false);button2.setOpaque(false);button3.setOpaque(false);button4.setOpaque(false);
		
		button1.setSize(120, 60);
		button2.setSize(80, 60);
		button3.setSize(80, 60);
		button4.setSize(80, 60);	
		button1.addActionListener(new selectInterpark());
		button2.addActionListener(new selectMelon());
		button3.addActionListener(new selectYes24());
		button4.addActionListener(new selectCgv());
		
		//add(jl);
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		add(p1);
	}
	
	class selectInterpark implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object obj= e.getSource();
					
			if (obj==button1){
				JFrame fr1 = new JFrame();
	            fr1.setContentPane(new interpark());	
	        }//end of if
			
		}//end of actionperformed
	}//end of class interpark
	
	class selectMelon implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object obj2 = e.getSource();
					
			if (obj2 == button2){
				JFrame fr2 = new JFrame();
	            fr2.setContentPane(new melon());
	        }//end of if
			
		}//end of actionperformed
	}//end of melon
	
	class selectYes24 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object obj3 = e.getSource();
					
			if (obj3 == button3){
				JFrame fr3 = new JFrame();
	            fr3.setContentPane(new yes24());
	        }//end of if
			
		}//end of actionperformed
	}//end of yes24
	
	class selectCgv implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object obj4 = e.getSource();
					
			if (obj4 == button4){
				JFrame fr4 = new JFrame();
	           // fr4.setContentPane(new cgv());
				JLabel cgv = new JLabel("서비스 준비 중 입니다.");
				cgv.setVerticalTextPosition(SwingConstants.CENTER);
				fr4.add(cgv);
				fr4.setVisible(true);
				fr4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fr4.setSize(500, 300);
	        }//end of if
			
		}//end of actionperformed
	}//end of cgv
	
}
