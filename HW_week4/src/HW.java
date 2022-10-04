import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class HW extends JFrame {
	private static JButton jButtonArray[][];
	private static int W, H, R, C;

	public HW() {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		int topBar = 28;
		JButton jButton;
		int n;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(String.format("[과제 #1] %d행 %d열 (%dX%d)", R, C, W, H));
		jButtonArray = new JButton[R][C];
		setLayout(null);
		n = 1;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				jButton = new JButton((n++) + "");
				jButton.setBackground(new Color(255, 255, 159));
				jButton.setForeground(new Color(0, 76, 151));
				jButtonArray[i][j] = jButton;
				jButton.setBounds(j * W, i * H, W, H);
				add(jButton);
			}
		}

		jButton = new JButton("홀수");
		jButton.setBounds((int) (0 * (C * W) / 4.0), R * H, (int) ((C * W) / 4.0), H);
		jButton.addActionListener(new MyHandler());
		add(jButton);

		jButton = new JButton("짝수");
		jButton.setBounds((int) (1 * (C * W) / 4.0), R * H, (int) ((C * W) / 4.0), H);
		jButton.addActionListener(new MyHandler());
		add(jButton);

		jButton = new JButton("소수");
		jButton.setBounds((int) (2 * (C * W) / 4.0), R * H, (int) ((C * W) / 4.0), H);
		jButton.addActionListener(new MyHandler());
		add(jButton);

		jButton = new JButton("초기화");
		jButton.setBounds((int) (3 * (C * W) / 4.0), R * H, (int) ((C * W) / 4.0), H);
		jButton.addActionListener(new MyHandler());
		add(jButton);

		setSize(new Dimension(C * W, (R + 1) * H + topBar));
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		W = Integer.parseInt(args[0]);
		H = Integer.parseInt(args[1]);
		R = Integer.parseInt(args[2]);
		C = Integer.parseInt(args[3]);
		new HW();
	}

	class MyHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jButton = (JButton) e.getSource();
			int n = 0;
			switch (jButton.getText()) {
			case "짝수": {
				setTitle(String.format("[과제 #1] %d행 %d열 (%dX%d)", R, C, W, H) + " - 짝수만 표시");
				for (int i = 0; i < jButtonArray.length; i++) {
					for (int j = 0; j < jButtonArray[i].length; j++) {
						n++;
						if (n % 2 == 0) {
							jButtonArray[i][j].setBackground(new Color(0, 76, 151));
							jButtonArray[i][j].setForeground(Color.white);
						}
					}
				}
				break;
			}
			case "홀수": {
				setTitle(String.format("[과제 #1] %d행 %d열 (%dX%d)", R, C, W, H) + " - 홀수만 표시");
				for (int i = 0; i < jButtonArray.length; i++) {
					for (int j = 0; j < jButtonArray[i].length; j++) {
						n++;
						if (n % 2 == 1) {
							jButtonArray[i][j].setBackground(new Color(0, 76, 151));
							jButtonArray[i][j].setForeground(Color.white);
						}
					}
				}
				break;
			}
			case "소수": {
				setTitle(String.format("[과제 #1] %d행 %d열 (%dX%d)", R, C, W, H) + " - 소수만 표시");
				for (int i = 0; i < jButtonArray.length; i++) {
					for (int j = 0; j < jButtonArray[i].length; j++) {
						n++;
						if (isPrimeNumber(n)) {
							jButtonArray[i][j].setBackground(new Color(0, 76, 151));
							jButtonArray[i][j].setForeground(Color.white);
						}
					}
				}
				break;
			}
			case "초기화": {
				setTitle(String.format("[과제 #1] %d행 %d열 (%dX%d)", R, C, W, H));
				for (int i = 0; i < jButtonArray.length; i++) {
					for (int j = 0; j < jButtonArray[i].length; j++) {
						jButtonArray[i][j].setBackground(new Color(255, 255, 159));
						jButtonArray[i][j].setForeground(new Color(0, 76, 151));
					}
				}

				break;
			}
			default:
				break;
			}

		}

		public boolean isPrimeNumber(int n) {
			if (n == 1) {
				return false;
			}
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}

	}

}
