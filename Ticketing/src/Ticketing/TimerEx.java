package Ticketing;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Ticketing.setTimer.Listener;

public class TimerEx extends JFrame implements ActionListener{
	TextField timeIn;
	JButton input;
	
	public TimerEx(){
		super("타이머 설정");
		setLayout(new BorderLayout());
		JFrame jf = new JFrame();
		jf.setTitle("타이머 설정");
		JPanel p = new JPanel();
		JLabel jl = new JLabel("타이머 설정");
		timeIn = new TextField(15);
		input = new JButton("확인");
		
		p.add(timeIn);
		p.add(input);
		JPanel p1 = new JPanel();
		p1.add(jl);
		
		jf.add(p1, BorderLayout.NORTH);
		jf.add(p, BorderLayout.SOUTH);
		
		input.addActionListener(new Listener());
		
		//setSize(1000, 800);
		jf.pack();
		jf.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerEx();

	}
	//@Override
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object ob = e.getSource();
			System.out.println(e.getActionCommand());
	        String n = timeIn.getText();
	        int time = Integer.parseInt(n)*1000;
	        Timer t = new Timer();
	    	TimerTask task = new TimerTask(){
				public void run(){
					/*JFrame jf = new JFrame();
					JLabel jl = new JLabel("끝끝끝");
					jf.setSize(500, 500);
					jf.setVisible(true);
					jf.add(jl);
					jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
					System.exit(0);
				}
				
			};
			
			if(ob==input){
				JFrame fr1 = new JFrame();
	            fr1.setContentPane(new board());
	            t.schedule(task, time);
			}
			
		
			
			//t.schedule(task, time);
			
		}
	}
}