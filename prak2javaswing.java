import javax.swing.*;

public class prak2javaswing {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("title");
		JPanel p = new JPanel();
		JButton b = new JButton("press me");
		
		f.setSize(400, 400);
		
		p.add(b);
		f.setContentPane(p);
		
		f.show();
	}
}

// perbedaan prak1 dan prak2 adalah prak1 belum di setting sizenya sedangkan prak2 sudah ditentukan sizenya.