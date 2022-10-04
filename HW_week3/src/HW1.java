import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class HW1 extends JFrame {
	private static JButton button;

	public HW1(int N, int C) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, C));
		for (int i = 0; i < N; i++) {
			add(button = new JButton(String.format("%d", i+1)));
			button.setBackground(new Color(random(0, 255),(random(0, 255)),(random(0, 255))));
			button.setForeground(new Color(random(0, 255),(random(0, 255)),(random(0, 255))));
			button.setPreferredSize(new Dimension(50,50));
		}
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HW1(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

	}

	public static int random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}
}
