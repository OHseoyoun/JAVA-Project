package Ticketing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Secure extends JFrame{
	JTextField jt;
	StringBuffer temp;
	
	public Secure(){
		temp = new StringBuffer();
		for (int i = 0; i < 6; i++) {
		    int rIndex = (int)Math.random()*2 ;
		    switch (rIndex) {
		    case 0:
		        // a-z
		        temp.append((char) ((int) (Math.random()*26) + 97));
		        break;
		    case 1:
		        // A-Z
		        temp.append((char) ((int) (Math.random()*26) + 65));
		        break;
		    case 2:
		        // 0-9
		        temp.append((Math.random()*10));
		        break;
		    }
		}
		
		String imgPath4 = "img/bgimg.jpg";
		ImageIcon originIcon4 = new ImageIcon(imgPath4);  
		Image originImg4 = originIcon4.getImage(); 
		Image bgimg = originImg4.getScaledInstance(150, 70, Image.SCALE_SMOOTH );
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JLabel jl2 = new JLabel(new ImageIcon(bgimg));
		JLabel jl = new JLabel(temp.toString());
		JLabel jl3 = new JLabel("문자를 입력해주세요");
		JButton button = new JButton("확인");
		jt=new JTextField(20);
        Font f1 = new Font("돋움", Font.BOLD, 30);
        Font f2 = new Font("돋움", Font.PLAIN, 50);
        jl.setForeground(Color.red);
		jl.setFont(f1);
		jl3.setFont(f2);
		
		jp1.add(jl3);
		jp2.add(jl);
		//jp1.add(jl2);
		jp3.add(jt);
		jp4.add(button);
         
        add(jp1);
        add(jp2);
        add(jp3);
        add(jp4);
        button.addActionListener(new Listener(this));
        setLayout(new GridLayout(4,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 완전하게 끄기
        setSize(1200,800);
        setVisible(true);
         
	}
	class Listener implements ActionListener{
        JFrame frame;
        public Listener(JFrame f){
            frame =f;
        }
        @Override
        public void actionPerformed(ActionEvent arg0) {
            //버튼을 누르면 이쪽으로 제어가 이동
            System.out.println(arg0.getActionCommand());
            String n =jt.getText();
            
            if(n.equals(temp.toString())==true){
            	String print1="보안코드가 일치합니다.";
            	//JOptionPane.showMessageDialog(frame, print1);
            	JFrame fr1 = new JFrame();
	            fr1.setContentPane(new Seat());	
            }
            else{
            	String print2="보안코드가 일치하지 않습니다.";
            	JOptionPane.showMessageDialog(frame, print2);
            }
        }

    }//end of listener

}
