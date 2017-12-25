package Ticketing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SeatFail extends JFrame{

	public SeatFail() {
		// TODO Auto-generated constructor stub;
		JLabel text = new JLabel("티켓팅에 실패하셨습니다.");
		text.setVerticalTextPosition(SwingConstants.CENTER);
		add(text);
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
}
