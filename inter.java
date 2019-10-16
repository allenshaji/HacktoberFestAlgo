package panel;
import java.awt.*;

public class Demo1{
	public static void main(String s[]) {
		new A().setVisible(true);		
	}
}

class A extends Frame{
	Label l1,l2;
	Button b1,b2;
	TextField t1,t2;
	Panel p;
	A(){
		setLayout(null);
		setSize(500,300);
		setTitle("LOGIN PAGE");
		setBackground(Color.black);
		p=new Panel();
		p.setLayout(null);
		p.setBounds(50,50,400,160);
		p.setBackground(Color.GREEN);
		add(p);
		l1=new Label("User ID");
		l1.setBounds(10, 10, 100, 30);
		
		p.add(l1);
		l2=new Label("Password");
		l2.setBounds(10, 50, 100, 30);
		
		p.add(l2);
		t1=new TextField();
		t1.setBounds(110, 10, 100, 30);
		p.add(t1);
		t2=new TextField();
		t2.setBounds(110, 50, 100, 30);
		p.add(t2);
		
		b1=new Button("LOGIN");
		b1.setBounds(10, 90, 100, 30);
		p.add(b1);
		b2=new Button("Forgot Password");
		b2.setBounds(120, 90, 100, 30);
		p.add(b2);
	}	
}
