package Ticketing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class How extends JFrame{

	public How() {
		// TODO Auto-generated constructor stub
		super("���â");
		JLabel answer = new JLabel("Ƽ���ÿ� �����ϼ̽��ϴ�.");
		answer.setVerticalTextPosition(SwingConstants.CENTER);
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(answer);
	}

}
