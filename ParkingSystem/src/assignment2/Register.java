package assignment2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Parking Me-ter");
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("Tahoma", Font.PLAIN, 45));
		label.setBounds(193, 32, 308, 79);
		getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) UIManager.getColor("activeCaption")));
		panel.setBounds(0, 0, 707, 465);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(204, 228, 92, 16);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblFirstName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(204, 257, 92, 16);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(297, 227, 200, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(297, 257, 200, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setBounds(204, 286, 82, 16);
		panel.add(label_2);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textField_1 = new JTextField();
		textField_1.setBounds(297, 286, 199, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(279, 354, 97, 25);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnRegister);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(264, 111, 180, 79);
		panel.add(lblRegister);
		lblRegister.setForeground(UIManager.getColor("activeCaption"));
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 40));
	}

}
