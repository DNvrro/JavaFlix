import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class JavaFlix extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel LogIn;
	private JPanel User;
	private JPanel Movie;
	
	 public static Movie movie1 = new Movie("The Shawshank Redemption","R", "Drama",
	            "Two imprisoned men bond over a number of years, finding solace and " +
	                    "eventual redemption through acts of common decency.", 142);
	    public static Movie movie2 = new Movie("The Godfather", "R", "Crime,Drama",
	            "The aging patriarch of an organized crime dynasty transfers control of his " +
	                    "clandestine empire to his reluctant son.", 175);
	    public static Movie movie3 = new Movie("The Godfather: Part II", "R", "Crime," +
	            "Drama",
	            "The early life and career of Vito Corleone in 1920s New York City is portrayed," +
	                    " while his son, Michael, expands and tightens his grip on the family crime syndicate.",
	            222);
	    public static Movie movie4 = new Movie("The Dark Knight", "PG-13","Action," +
	            "Crime," +
	            "Drama","When the menace known as the Joker wreaks havoc and chaos on the people of " +
	            "Gotham, " +
	            "Batman must accept one of the greatest psychological and physical tests of his ability " +
	            "to fight injustice.", 152 );
	    public static Movie movie5 = new Movie("Pulp Fiction","R", "Crime,Drama",
	            "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner " +
	                    "bandits intertwine in four tales of violence and redemption.", 154);
	    public static Movie movie6 = new Movie("Joker","R", "Crime,Drama,Thriller",
	            "In Gotham City, mentally-troubled comedian Arthur Fleck is disregarded and " +
	                    "mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. " +
	                    "This path brings him face-to-face with his alter-ego: \"The Joker\".", 122);
	    public static Movie movie7 = new Movie("The Shining","R","Drama,Horror",
	            "A family heads to an isolated hotel for the winter where a sinister presence influences " +
	                    "the father into violence, while his psychic son sees horrific forebodings from " +
	                    "both past and future.",146);

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
		setBounds(400, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel LogIn = new JPanel();
		LogIn.setBackground(Color.BLUE);
		contentPane.add(LogIn, "name_72157132175147");
		LogIn.setLayout(null);
		LogIn.setVisible(true);
		
		final JPanel User = new JPanel();
		User.setBackground(Color.BLUE);
		contentPane.add(User, "name_72157149030130");
		User.setLayout(null);
		User.setVisible(false);
		
		JPanel Movie = new JPanel();
		Movie.setBackground(Color.BLUE);
		contentPane.add(Movie, "name_72157164603025");
		
		JLabel lblNewLabel = new JLabel("JavaFlix");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(77, 6, 285, 56);
		LogIn.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(155, 91, 130, 26);
		LogIn.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(155, 129, 130, 26);
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
		btnNewButton.setBounds(184, 188, 71, 16);
		LogIn.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String password = passwordField.getText();
				String userName = textField.getText();
				
				try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlix",
                        "root", "xxxx");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select username, password from user where username=? and password=?");

                    st.setString(1, userName);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    
                    if (rs.next()) {
                       
                        passwordField.setText(null);
                        textField.setText(null);
                        User.setVisible(true);
                        LogIn.setVisible(false);
                        
                    } else {
                    	
                    	JOptionPane.showMessageDialog(null, "Invalid Login Credentials","Login Error", JOptionPane.ERROR_MESSAGE);
                        passwordField.setText(null);
                        textField.setText(null);
                        
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
	                        
        });
		
	
		
  
	
		
		JLabel lblPleaseLogIn = new JLabel("Please log in...");
		lblPleaseLogIn.setBounds(169, 160, 101, 16);
		LogIn.add(lblPleaseLogIn);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("JavaFlix");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBounds(0, 0, 112, 38);
		User.add(lblNewLabel_2);
		
		JLabel lblWelcomePleaseTake = new JLabel("Welcome! Please take a look at our movie selection.");
		lblWelcomePleaseTake.setBounds(56, 39, 346, 16);
		User.add(lblWelcomePleaseTake);
		
		DefaultListModel listModel;
		listModel = new DefaultListModel();
		
		listModel.addElement(movie1);
		listModel.addElement(movie2);
		listModel.addElement(movie3);
		listModel.addElement(movie4);
		listModel.addElement(movie5);
		listModel.addElement(movie6);
		listModel.addElement(movie7);
		
		JList list = new JList(listModel);
		list.setBounds(38, 67, 370, 165);
		User.add(list);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(164, 233, 117, 29);
		User.add(btnView);
		
		
	}
}
