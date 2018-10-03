/*
 * Written by Christopher Moyer
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField totalField;
	
	double input;
	double answer;
	int calculation;
	
	public void operation()
	{	//Switch case in event handlers
		switch(calculation)
		{
			case 1:		//Addition
				answer = input + Double.parseDouble(totalField.getText());
				totalField.setText(Double.toString(answer));
				break;
			case 2:		//Subtraction
				answer = input - Double.parseDouble(totalField.getText());
				totalField.setText(Double.toString(answer));
				break;
			case 3:		//Multiplication
				answer = input * Double.parseDouble(totalField.getText());
				totalField.setText(Double.toString(answer));
				break;
			case 4:		//Division
				answer = input / Double.parseDouble(totalField.getText());
				totalField.setText(Double.toString(answer));
				break;
			case 5:		//Exponent
				answer = Math.pow(input, Double.parseDouble(totalField.getText()));
				totalField.setText(Double.toString(answer));
				break;
			case 6:		//Square Root
				answer = Math.sqrt(Double.parseDouble(totalField.getText()));
				totalField.setText(Double.toString(answer));
				break;
			case 7:		//Logarithim
				answer = Math.log10(Double.parseDouble(totalField.getText()));
				totalField.setText(Double.toString(answer));
				break;
			case 8:		//Sine
				answer = Math.sin(Double.parseDouble(totalField.getText())*Math.PI/180.00);
				totalField.setText(Double.toString(answer));
				break;
			case 9:		//Cosine
				answer = Math.cos(Double.parseDouble(totalField.getText())*Math.PI/180.00);
				totalField.setText(Double.toString(answer));
				break;
			case 10:	//Tangent
				answer = Math.tan(Double.parseDouble(totalField.getText())*Math.PI/180.00);
				totalField.setText(Double.toString(answer));
				break;
			case 11:	//Arcsine
				answer = Math.asin(Double.parseDouble(totalField.getText()));
				answer *= (180/Math.PI);
				totalField.setText(Double.toString(answer));
				break;
			case 12:	//Arccosine
				answer = Math.acos(Double.parseDouble(totalField.getText()));
				answer *= (180/Math.PI);
				totalField.setText(Double.toString(answer));
				break;
			case 13:	//Arctan
				answer = Math.atan(Double.parseDouble(totalField.getText()));
				answer *= (180/Math.PI);
				totalField.setText(Double.toString(answer));
				break;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/Resouces/calculator.png")));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		totalField = new JTextField();
		totalField.setText("Fuk u bith");
		totalField.setHorizontalAlignment(SwingConstants.RIGHT);
		totalField.setColumns(10);
		
		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "0");
			}
		});
		
		JButton oneButton = new JButton("1");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "1");
			}
		});
		
		JButton twoButton = new JButton("2");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "2");
			}
		});
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "3");
			}
		});
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "4");
			}
		});
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "5");
			}
		});
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "6");
			}
		});
		
		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "7");
			}
		});
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "8");
			}
		});
		
		JButton nineButton = new JButton("9");
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + "9");
			}
		});
		
		JButton divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = Double.parseDouble(totalField.getText());
				calculation = 4;
				totalField.setText("");
			}
		});
		
		JButton multiplyButton = new JButton("x");
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = Double.parseDouble(totalField.getText());
				calculation = 3;
				totalField.setText("");
			}
		});
		
		JButton subtractButton = new JButton("-");
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input = Double.parseDouble(totalField.getText());
				calculation = 2;
				totalField.setText("");
			}
		});
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = Double.parseDouble(totalField.getText());
				calculation = 1;
				totalField.setText("");
			}
		});
		
		JButton equalsButton = new JButton("=");
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation();
			}
		});
		
		JButton clearButton = new JButton("C");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText("");
			}
		});
		
		JButton decimalButton = new JButton(".");
		decimalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalField.setText(totalField.getText() + ".");
			}
		});
		
		JButton btnX = new JButton("^");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = Double.parseDouble(totalField.getText());
				calculation = 5;
				totalField.setText("");
			}
		});
		
		JButton btnRt = new JButton(""+'\u221A');
		btnRt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 6;
				operation();
			}
		});
		
		JButton sinButton = new JButton("Sin");
		sinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 8;
				operation();
			}
		});
		
		JButton cosButton = new JButton("Cos");
		cosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 9;
				operation();
			}
		});
		
		JButton tanButton = new JButton("Tan");
		tanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 10;
				operation();
			}
		});
		
		JButton arcsinButton = new JButton("Sin"+'\u207B'+'\u00B9');
		arcsinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 11;
				operation();
			}
		});
		
		JButton arccosButton = new JButton("Cos"+'\u207B'+'\u00B9');
		arccosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 12;
				operation();
			}
		});
		
		JButton arctanButton = new JButton("Tan"+'\u207B'+'\u00B9');
		arctanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 13;
				operation();
			}
		});
		
		JButton logButton = new JButton("Log");
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculation = 7;
				operation();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(totalField, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(zeroButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(oneButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(decimalButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(twoButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(threeButton)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(addButton))
										.addComponent(equalsButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
									.addGap(63)
									.addComponent(logButton))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(fourButton)
											.addGap(12)
											.addComponent(fiveButton)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(sixButton)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(subtractButton))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnX)
												.addComponent(sevenButton))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnRt)
												.addComponent(eightButton))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(clearButton)
												.addComponent(nineButton))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(multiplyButton)
												.addComponent(divideButton))))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(tanButton)
											.addGap(18)
											.addComponent(arctanButton))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(sinButton)
												.addComponent(cosButton))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(arccosButton)
												.addComponent(arcsinButton))))))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(totalField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnX)
								.addComponent(btnRt)
								.addComponent(clearButton)
								.addComponent(divideButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(eightButton)
								.addComponent(nineButton)
								.addComponent(sevenButton)
								.addComponent(multiplyButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(fourButton)
								.addComponent(subtractButton)
								.addComponent(sixButton)
								.addComponent(fiveButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(oneButton)
								.addComponent(twoButton)
								.addComponent(addButton)
								.addComponent(threeButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(zeroButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(decimalButton)
								.addComponent(equalsButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addGap(37))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(arccosButton)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(sinButton)
										.addComponent(arcsinButton))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cosButton)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(tanButton)
								.addComponent(arctanButton))
							.addGap(29)
							.addComponent(logButton)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
