package Ticketing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SeatFail extends JFrame{

	public SeatFail() {
		// TODO Auto-generated constructor stub;
		JLabel text = new JLabel("Ƽ���ÿ� �����ϼ̽��ϴ�.");
		text.setVerticalTextPosition(SwingConstants.CENTER);
		add(text);
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
}
