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

//import DB.Gui;

public class setTimer extends JFrame{
	TextField timeIn;
	JButton input;
	public setTimer() {
		super("Ÿ�̸� ����");
		setLayout(new BorderLayout());
		JFrame jf = new JFrame();
		jf.setTitle("Ÿ�̸� ����");
		JPanel p = new JPanel();
		JLabel jl = new JLabel("Ÿ�̸� ����");
		timeIn = new TextField(15);
		input = new JButton("Ȯ��");
		
		p.add(timeIn);
		p.add(input);
		JPanel p1 = new JPanel();
		p1.add(jl);
		
		input.addActionListener(new Listener());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.add(p1, BorderLayout.NORTH);
		jf.add(p, BorderLayout.SOUTH);

		jf.pack();
		jf.setVisible(true);
	}
	
	class Listener implements ActionListener{
		@Override
        public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object ob = e.getSource();
			System.out.println(e.getActionCommand());
	        String n = timeIn.getText();
	        int time = Integer.parseInt(n)*1000;
	        Timer t = new Timer();
			
			if(ob==input){
				JFrame fr1 = new JFrame();
	            fr1.setContentPane(new board());	
			}
			
			TimerTask task = new TimerTask(){
				public void run(){
					JFrame jf = new JFrame();
					JLabel jl = new JLabel("������");
					jf.setSize(500, 200);
					jf.setVisible(true);
					jf.add(jl);
					jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			};
			
			t.schedule(task, time);

		}//end of listener

	}
}
