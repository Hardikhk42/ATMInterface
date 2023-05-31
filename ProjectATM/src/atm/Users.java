package atm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Users extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JLabel lblNewLabel_2;
	private JButton submit;
	private JButton btnNewButton_5;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Users frame = new Users();
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
	public Users() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Users");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(115, 25, 87, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User ID");
		lblNewLabel_1.setBounds(77, 56, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(144, 53, 96, 19);
		contentPane.add(username);
		username.setColumns(10);
		
		lblNewLabel_2 = new JLabel("User Pin");
		lblNewLabel_2.setBounds(77, 85, 57, 13);
		contentPane.add(lblNewLabel_2);
		
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(username.getText().trim().isEmpty()||password.getText().equals("")) {
					JOptionPane.showMessageDialog(submit, "Invalid Credentials");
				}
				else if(username.getText().equals("Hardik")&&password.getText().equals("Hardik123")) {
					ATM a = new ATM();
					a.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(submit, "Invalid Credentials");
				}
			}
		});
		submit.setBounds(172, 128, 79, 13);
		contentPane.add(submit);
		
		btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.setBounds(77, 128, 64, 13);
		contentPane.add(btnNewButton_5);
		
		password = new JPasswordField();
		password.setBounds(144, 82, 96, 19);
		contentPane.add(password);
	}
}
