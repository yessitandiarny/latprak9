import javax.swing.*;

public class prak1javaswing {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("title");
		JPanel p = new JPanel();
		JButton b = new JButton("press me");
		
		p.add(b);
		f.setContentPane(p);
		
		f.show();
	}
}