package Ticketing;

import java.awt.Container;
import java.awt.FlowLayout;

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

import oracle.jdbc.driver.OracleDriver;

public class signinCgv extends JFrame{
	JLabel label1, label2, la1, la2;
    JTextField id;//id �Է��� ����
    JPasswordField passwd;// �н����� �Է��� ���� 
    JPanel idPanel, pwPanel, loginPanel;//�г�...
    JButton button1,button2;//��ư.
    JTextArea content;
   
	public signinCgv(){
		
		 Container c = getContentPane();
         c.setLayout(new FlowLayout());
         EtchedBorder eborder = new EtchedBorder();//�׵θ������� ��Ī ������ �� ���.
         Icon testpic = new ImageIcon("img/cgvlogo.jpg");//�׸� ����.�ش� ������Ʈ ���� ���� ������ ��ġ��Ű�� �ȴ�.
         label2 = new JLabel(testpic);
         label2.setBorder(eborder);//�׸� �ֺ� ��Ī ����.
         label2.setToolTipText("�ΰ�"); //�ش� ���̺� ������ ����. ���콺 ����Ʈ�� label2 ���̺� ��ġ��Ű�� ������ ǥ�õȴ�.
        
         c.add(label2);//add�ϴ� ������ ��ġ�� �ȴ�.
        
         //id ���� �г� ��� (�гΰ� label�� ����� �� �Ʒ� �ּ� ����)
         idPanel = new JPanel();
         la1 = new JLabel("ID:");
         id = new JTextField(10); //�ؽ�Ʈ ���� ��
         idPanel.add(la1);
         idPanel.add(id);//�ϴ� �гο� add(�� ������ ��ϵ�). ���߿� �� idPanel�� label�� ����� ���̴�.
        
         //pw ����
         pwPanel = new JPanel();
         la2 = new JLabel("PW:");
         passwd = new JPasswordField(10);
         pwPanel.add(la2);
         pwPanel.add(passwd);
        
         //��ư����
         loginPanel = new JPanel();
         button1 = new JButton("�α���");
         button2 = new JButton("ȸ������");
         loginPanel.add(button1);
         loginPanel.add(button2);
        
         c.add(idPanel);//id, pw, ��ư �߰�
         c.add(pwPanel);
         c.add(loginPanel);
        
         setTitle("SINGIN");
         setSize( 350, 500);//������ ������
         setVisible(true); // ����
         setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
