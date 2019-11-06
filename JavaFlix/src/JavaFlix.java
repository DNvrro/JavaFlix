import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaFlix extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaFlix frame = new JavaFlix();
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
	public JavaFlix() {
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setTitle("JavaFlix");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJavaflix = new JLabel("JavaFlix");
		lblJavaflix.setForeground(Color.YELLOW);
		lblJavaflix.setHorizontalAlignment(SwingConstants.CENTER);
		lblJavaflix.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		lblJavaflix.setBounds(125, 21, 199, 31);
		contentPane.add(lblJavaflix);
		
		textField = new JTextField();
		textField.setBounds(162, 88, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(88, 93, 61, 16);
		contentPane.add(lblEmail);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 126, 130, 26);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(42, 131, 107, 16);
		contentPane.add(lblPassword);
		
		JButton btnSignIn = new JButton("Log In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignIn.setBounds(181, 178, 87, 29);
		contentPane.add(btnSignIn);
	}
}
