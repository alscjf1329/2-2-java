import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class HW2 extends JFrame {
	private static JPanel numberJPanel = new JPanel();
	private static final int gap = 3;
	private static final int rootFrameWidth = 400 + gap * 8;
	private static final int rootFrameHeight = 300 + gap * 12;

	private static final int elementWidth = (rootFrameWidth - gap * 8) / 4;
	private static final int elementHeight = (rootFrameHeight - gap * 12) / 6;
	private static JTextField numberJPanelJTextField = new JTextField();
	private static JPanel phonePadJPanel = new JPanel();
	private static String phonePadArray[][] = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" },
			{ "*", "0", "#" } };
	private static JButton phonePadJButton = new JButton();
	private static JPanel sentInitializationBundleJPanel = new JPanel();
	private static JButton sentJButton = new JButton();
	private static JButton initializationJButton = new JButton();
	private static JPanel contactMessageCancelBundleJPanel = new JPanel();
	private static JPanel contactMessageBundleJPanel = new JPanel();
	private static JButton contactJButton = new JButton();
	private static JButton messageJButton = new JButton();
	private static JPanel cancelJPanel = new JPanel();
	private static JButton cancelJButton = new JButton();

	public HW2(String N) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		setLayout(new BorderLayout());
		setSize(new Dimension(rootFrameWidth, rootFrameHeight)); // 최상위 frame

		// 전화번호 넣는 container
		add(numberJPanel, BorderLayout.NORTH);
		numberJPanel.setLayout(new GridLayout(0, 1, gap * 2, gap * 2));
		numberJPanel.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		numberJPanel.add((numberJPanelJTextField = new JTextField(numberJPanelJTextFieldValue(N))));
		numberJPanelJTextField.setHorizontalAlignment(numberJPanelJTextField.RIGHT);
		numberJPanelJTextField.setPreferredSize(new Dimension(rootFrameWidth - gap * 2, elementHeight));
		numberJPanelJTextField.setFont(new Font(numberJPanelJTextFieldValue(N), Font.BOLD, 20));
		numberJPanelJTextField.setBackground(new Color(95, 123, 175));
		if (isPhoneNum(N)) {
			numberJPanelJTextField.setForeground(Color.white);
		} else {
			numberJPanelJTextField.setForeground(new Color(236, 141, 183));
		}

		// 전화번호 패드
		add(phonePadJPanel, BorderLayout.CENTER);
		phonePadJPanel.setLayout(new GridLayout(4, 3, gap * 2, gap * 2));
		phonePadJPanel.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		for (int i = 0; i < phonePadArray.length; i++) {
			for (int j = 0; j < phonePadArray[i].length; j++) {
				phonePadJPanel.add(phonePadJButton = new JButton(phonePadArray[i][j]));
				phonePadJButton.setFont(new Font(phonePadArray[i][j], Font.BOLD, 20));
				phonePadJButton.setBackground(new Color(218, 241, 251));
				phonePadJButton.setPreferredSize(new Dimension(elementWidth, elementHeight));
			}
		}

		// 발신 초기화 패드
		add(sentInitializationBundleJPanel, BorderLayout.EAST);
		sentInitializationBundleJPanel.setLayout(new GridLayout(2, 1, gap * 2, gap * 2));
		sentInitializationBundleJPanel.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		sentInitializationBundleJPanel.add(sentJButton = new JButton("발신"));
		sentJButton.setFont(new Font("발신", Font.PLAIN, 20));
		sentJButton.setPreferredSize(new Dimension(elementWidth, elementHeight * 2));
		sentJButton.setBackground(new Color(33, 51, 76));
		sentJButton.setForeground(Color.white);
		sentInitializationBundleJPanel.add(initializationJButton = new JButton("초기화"));
		initializationJButton.setFont(new Font("초기화", Font.PLAIN, 20));
		initializationJButton.setPreferredSize(new Dimension(elementWidth, elementHeight * 2));
		initializationJButton.setBackground(new Color(43, 84, 87));
		initializationJButton.setForeground(Color.white);

		// 연락처 메시지 패드
		add(contactMessageCancelBundleJPanel, BorderLayout.SOUTH);
		contactMessageCancelBundleJPanel.setLayout(new GridLayout(0, 2));

		// 연락처 메시지 패드
		contactMessageCancelBundleJPanel.add(contactMessageBundleJPanel);
		contactMessageBundleJPanel.setLayout(new GridLayout(1, 2, gap * 2, gap * 2));
		contactMessageBundleJPanel.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		contactMessageBundleJPanel.add(contactJButton = new JButton("연락처"));
		contactJButton.setFont(new Font("연락처", Font.PLAIN, 20));
		contactJButton.setPreferredSize(new Dimension(elementWidth, elementHeight));
		contactJButton.setBackground(new Color(168, 22, 15));
		contactJButton.setForeground(new Color(250, 242, 55));
		contactMessageBundleJPanel.add(messageJButton = new JButton("메시지"));
		messageJButton.setFont(new Font("메시지", Font.PLAIN, 20));
		messageJButton.setPreferredSize(new Dimension(elementWidth, elementHeight));
		messageJButton.setBackground(new Color(168, 22, 15));
		messageJButton.setForeground(new Color(250, 242, 55));

		// 취소 패드
		contactMessageCancelBundleJPanel.add(cancelJPanel);
		cancelJPanel.setLayout(new GridLayout(0, 1, gap * 2, gap * 2));
		cancelJPanel.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		cancelJPanel.add(cancelJButton = new JButton("취소"));
		cancelJButton.setFont(new Font("연락처", Font.PLAIN, 20));
		cancelJButton.setPreferredSize(new Dimension(elementWidth * 2, elementHeight));
		cancelJButton.setBackground(new Color(250, 242, 55));
		cancelJButton.setForeground(new Color(168, 22, 15));

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HW2(args[0]);

	}

	public static String numberJPanelJTextFieldValue(String N) {
		String phoneNumber = "010";
		String seoulNumber = "02";
		String[] countryNumber = { "032", "042", "051", "052", "053", "062" };
		if (N.length() > 3) {
			String NFront3Num = N.substring(0, 3);
			if (NFront3Num.equals(phoneNumber)) {
				if (N.length() == 11) {
					return String.format("%s-%s-%s", N.substring(0, 3), N.substring(3, 7), N.substring(7, 11));
				}
			} else if (N.substring(0, 2).equals(seoulNumber)) {
				if (N.length() == 9) {
					return String.format("%s-%s-%s", N.substring(0, 2), N.substring(2, 5), N.substring(5, 9));
				}
				if (N.length() == 10) {
					return String.format("%s-%s-%s", N.substring(0, 2), N.substring(2, 6), N.substring(6, 10));
				}
			} else {
				for (String s : countryNumber) {
					if (NFront3Num.equals(s)) {
						if (N.length() == 10) {
							return String.format("%s-%s-%s", N.substring(0, 3), N.substring(3, 6), N.substring(6, 10));
						}
						if (N.length() == 11) {
							return String.format("%s-%s-%s", N.substring(0, 3), N.substring(3, 7), N.substring(7, 11));
						}

					}
				}
			}
		}

		return String.format("%s은 전화번호 아님", N);
	}

	public static boolean isPhoneNum(String N) {
		String phoneNumber = "010";
		String seoulNumber = "02";
		String[] countryNumber = { "032", "042", "051", "052", "053", "062" };
		if (N.length() > 3) {
			String NFront3Num = N.substring(0, 3);
			if (NFront3Num.equals(phoneNumber)) {
				if (N.length() == 11) {
					return true;
				}
			} else if (N.substring(0, 2).equals(seoulNumber)) {
				if (N.length() == 9 || N.length() == 10) {
					return true;
				}
			} else {
				for (String s : countryNumber) {
					if (NFront3Num.equals(s)) {
						if (N.length() == 10 || N.length() == 11) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}
}
