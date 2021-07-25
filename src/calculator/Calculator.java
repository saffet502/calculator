package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	int s1, s2, sonuc;
	float sonuc_float;
	int islem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 193, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 153, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton.setBounds(10, 42, 40, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(48, 42, 40, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.setBounds(86, 42, 40, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {			
				textField.setText(textField.getText()+"4");		
			}
			
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.setBounds(10, 69, 40, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"5");
			}
			
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_4.setBounds(48, 69, 40, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"6");
			}
			
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_5.setBounds(86, 69, 40, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"7");
			}
			
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_6.setBounds(10, 98, 40, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"8");
			}
			
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_7.setBounds(48, 98, 40, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"9");
			}
			
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_8.setBounds(86, 98, 40, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"0");
			}
			
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		

		btnNewButton_9.setBounds(10, 127, 40, 23);
		panel.add(btnNewButton_9);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			}
			
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnC.setBounds(48, 127, 40, 23);
		panel.add(btnC);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			s2 = Integer.parseInt(textField.getText());
			
			if(islem == 1) {
				sonuc = s1 + s2;
				textField.setText(Integer.toString(sonuc));
			}
			else if(islem == 2) {
				sonuc = s1 - s2;
				textField.setText(Integer.toString(sonuc));
			}
			else if(islem == 3) {
				sonuc = s1 * s2;
				textField.setText(Integer.toString(sonuc));
			}
			else if(islem == 4) {
				sonuc = s1 / s2;
				textField.setText(Integer.toString(sonuc));
			}
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		btnNewButton_11.setBounds(86, 127, 40, 23);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 2;
				textField.setText("");
			}
			
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_12.setBounds(123, 42, 40, 23);
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 2;
				textField.setText("");
			}
			
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_13.setBounds(123, 69, 40, 23);
		panel.add(btnNewButton_13);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 3;
				textField.setText("");
			}
			
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(123, 98, 40, 23);
		panel.add(btnX);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				s1 = Integer.parseInt(textField.getText());
				islem = 4;
				textField.setText("");
			}
			
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_15.setBounds(123, 127, 40, 23);
		panel.add(btnNewButton_15);
		
		
		}

}

