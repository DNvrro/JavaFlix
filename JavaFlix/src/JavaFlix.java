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
import javax.swing.JDesktopPane;

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
		setTitle("Welcome to JavaFlix!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel LogIn = new JPanel();
		LogIn.setBackground(Color.GRAY);
		LogIn.setBounds(429, 249, 21, 29);
		contentPane.add(LogIn);
		LogIn.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JavaFlix");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(81, 6, 285, 56);
		LogIn.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 91, 130, 26);
		LogIn.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 129, 130, 26);
		LogIn.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(61, 96, 87, 16);
		LogIn.add(lblUsername);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(47, 134, 101, 16);
		LogIn.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBounds(189, 188, 71, 16);
		LogIn.add(btnNewButton);
		
		JLabel lblPleaseLogIn = new JLabel("Please log in...");
		lblPleaseLogIn.setBounds(174, 160, 101, 16);
		LogIn.add(lblPleaseLogIn);
		
		JPanel User = new JPanel();
		User.setBackground(Color.GRAY);
		User.setBounds(0, 0, 450, 278);
		contentPane.add(User);
		User.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("JavaFlix");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBounds(0, 0, 112, 38);
		User.add(lblNewLabel_2);
		
		JPanel Movie = new JPanel();
		Movie.setBounds(0, 0, 450, 278);
		contentPane.add(Movie);
	}
}
