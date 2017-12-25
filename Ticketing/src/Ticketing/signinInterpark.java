package Ticketing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class signinInterpark extends JFrame implements ActionListener{
	JLabel label1, label2, la1, la2;
    JTextField id;//id 입력할 공간
    JPasswordField passwd;// 패스워드 입력할 공간
    JPanel idPanel, pwPanel, loginPanel;//패널...
    JButton button1,button2;//버튼.
    JTextArea content;
   
	public signinInterpark(){
		
		 Container c = getContentPane();
         c.setLayout(new FlowLayout());
         EtchedBorder eborder = new EtchedBorder();//테두리선으로 에칭 형태의 선 사용.
         Icon testpic = new ImageIcon("img/interparklogo.jpg");//그림 삽입.해당 프로젝트 폴더 내에 파일을 위치시키면 된다.
         label2 = new JLabel(testpic);
         label2.setBorder(eborder);//그림 주변 에칭 형태.
         label2.setToolTipText("로고"); //해당 레이블에 툴팁을 적용. 마우스 포인트를 label2 레이블에 위치시키면 툴팁이 표시된다.
        
         //c.add(label2);//add하는 순으로 배치가 된다.
        
         //id 관련 패널 등록 (패널과 label의 관계는 맨 아래 주석 참조)
         idPanel = new JPanel();
         la1 = new JLabel("ID:");
         id = new JTextField(10); //텍스트 쓰는 곳
         idPanel.add(la1);
         idPanel.add(id);//일단 패널에 add(두 가지가 등록됨). 나중에 이 idPanel을 label에 등록할 것이다.
        
         //pw 관련
         pwPanel = new JPanel();
         la2 = new JLabel("PW:");
         passwd = new JPasswordField(10);
         pwPanel.add(la2);
         pwPanel.add(passwd);
        
         //버튼관련
         loginPanel = new JPanel();
         button1 = new JButton("로그인");
         button2 = new JButton("회원가입");
         loginPanel.add(button1);
         loginPanel.add(button2);
        
         c.add(idPanel);//id, pw, 버튼 추가
         c.add(pwPanel);
         c.add(loginPanel);
         
         button1.addActionListener(this);
         button2.addActionListener(this);
        
         setTitle("SINGIN");
         setSize( 350, 500);//프레임 사이즈
         setVisible(true); // 공개
         setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		JFrame fr1 = new JFrame();
		String a = id.getText();
		String b = passwd.getText();
		Object ob = e.getSource();
		
		if(button1==ob){
			if(a.equals("aaaa")==true&&b.equals("1234")){
            	fr1.setContentPane(new Seat());	
        	}
			else{
				JFrame window = new JFrame();
				JLabel text = new JLabel("아이디나 비밀번호를 잘못입력하셨습니다.");
				window.add(text);
				window.setVisible(true);
				window.pack();
			}
		}
		if(button2==ob){
			JFrame frame1 = new JFrame();
			JLabel text = new JLabel("서비스 준비 중 입니다.");
			frame1.add(text);
			frame1.setSize(200, 200);
			frame1.setVisible(true);

		}
		
	}
}
