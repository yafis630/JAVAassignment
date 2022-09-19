import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends Frame {
	

	String user = "ef";
	String pwd = "yoyo";
	LoginForm() {
		Frame f = new Frame();
		TextField t1;
		JPasswordField t2;
		Label l1, l2, l3;
		Button b;
		t1 = new TextField();
		t1.setBounds(120,100,200,30);
		t2 = new JPasswordField();
		t2.setBounds(120, 150, 200, 30);
		l1 = new Label("Username: ");
		l2 = new Label("Password: ");
		l3 = new Label("Not verified.");
		l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,100,30);
		l3.setBounds(50,250,100,30);
		b = new Button("Submit");
		b.setBounds(50,200,80,30);
		
		
		
		b.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				String usr = t1.getText();
				String pw = t2.getText();
				System.out.print(usr+pw);
				if (usr.equals(user) && pw.equals(pwd)) {
					l3.setText("Verified!");
				}
				else {
					l3.setText("Invalid credentials.");
				}
			}
		});
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(l3);
		add(b);
		setLayout(null);
		setVisible(true);
	
	}

	public static void main(String []args) {

		LoginForm f = new LoginForm();
	}
	
}