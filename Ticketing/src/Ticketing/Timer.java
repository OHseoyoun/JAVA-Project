package Ticketing;

import java.awt.Panel;
import java.awt.TextField;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Timer extends JFrame{
	Timer t = new Timer();
	public Timer(){
		Panel p = new Panel();
		TextField timeIn = new TextField(15);
		JButton input = new JButton("확인");
		
		p.add(timeIn);
		p.add(input);
		
		add(p);
		
		setSize(1000, 800);
		setVisible(true);
	}
	
	TimerTask task = new TimerTask(){
		public void run(){
			System.out.println("시간 끝끝끝");
		}
	};
	
	//t.schedule(task, 5000);
}
