package Ticketing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class How extends JFrame{

	public How() {
		// TODO Auto-generated constructor stub
		super("결과창");
		JLabel answer = new JLabel("티켓팅에 성공하셨습니다.");
		answer.setVerticalTextPosition(SwingConstants.CENTER);
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(answer);
	}

}
