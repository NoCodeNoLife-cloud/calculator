import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 项目名:  calculator
 * 开发者:  Administrator
 * 创建于:  2022 二月 10 星期四 15:07
 * 描述:
 */
public class Calculator {
	private JPanel panel1;
	private JButton a0Button;
	private JButton button1;
	private JButton ENTERButton;
	private JButton button8;
	private JButton a5Button;
	private JButton a8Button;
	private JButton button12;
	private JButton a2Button;
	private JButton button14;
	private JButton button15;
	private JButton a9Button;
	private JButton a6Button;
	private JButton a3Button;
	private JButton a7Button;
	private JButton a4Button;
	private JButton a1Button;
	private JLabel label;
	private JButton cButton;
	private boolean next = false;
	private StringBuffer temp = new StringBuffer();
	private StringBuffer temp2 = new StringBuffer();
	private String operator;

	public Calculator() {
		a0Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					if (temp.length() != 0) {
						temp.append("0");
						label.setText(temp.toString());
					}
				} else {
					if (temp2.length() != 0) {
						temp2.append("0");
						label.setText(temp.toString() + operator + temp2.toString());
					}
				}
			}
		});

		a1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("1");
					label.setText(temp.toString());
				} else {
					temp2.append("1");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		a4Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("4");
					label.setText(temp.toString());
				} else {
					temp2.append("4");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		a7Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("7");
					label.setText(temp.toString());
				} else {
					temp2.append("7");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		a8Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("8");
					label.setText(temp.toString());
				} else {
					temp2.append("8");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		a5Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("5");
					label.setText(temp.toString());
				} else {
					temp2.append("5");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});

		a2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("2");
					label.setText(temp.toString());
				} else {
					temp2.append("2");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		a9Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("9");
					label.setText(temp.toString());
				} else {
					temp2.append("9");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		a6Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("6");
					label.setText(temp.toString());
				} else {
					temp2.append("6");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		a3Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					temp.append("3");
					label.setText(temp.toString());
				} else {
					temp2.append("3");
					label.setText(temp.toString() + operator + temp2.toString());
				}
			}
		});
		button14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					if (!temp.toString().contains(".")) {
						if (temp.length() != 0) {
							temp.append(".");
							label.setText(temp.toString());
						}
					}
				} else {
					if (!temp2.toString().contains(".")) {
						if (temp2.length() != 0) {
							temp2.append(".");
							label.setText(temp.toString() + operator + temp2.toString());
						}
					}
				}
			}
		});
		cButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (temp.length() != 0) {
					temp.deleteCharAt(temp.length() - 1);
					label.setText(temp.toString());
				}
				if (temp.length() == 0) {
					label.setText("0");
				}
			}
		});
		button12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					operator = "/";
					next = true;
					label.setText(temp.toString() + operator);
				}
			}
		});

		button15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					operator = "*";
					next = true;
					label.setText(temp.toString() + operator);
				}
			}
		});
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					operator = "-";
					next = true;
					label.setText(temp.toString() + operator);
				}
			}
		});
		button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				if (!next) {
					operator = "+";
					next = true;
					label.setText(temp.toString() + operator);
				}
			}
		});

		ENTERButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				switch (operator) {
					case "+":
						label.setText(Long.parseLong(temp.toString()) + Long.parseLong(temp.toString()) + "");
						break;
					case "-":
						label.setText(Long.parseLong(temp.toString()) - Long.parseLong(temp.toString()) + "");
						break;
					case "*":
						label.setText(Long.parseLong(temp.toString()) * Long.parseLong(temp.toString()) + "");
						break;
					case "/":
						label.setText(Long.parseLong(temp.toString()) / Long.parseLong(temp.toString()) + "");
						break;
					default:
						label.setText("ERROR");
						break;
				}
				temp = new StringBuffer();
				temp2 = new StringBuffer();
				next = false;
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(new Calculator().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(250, 300);
		frame.setVisible(true);
	}
}
