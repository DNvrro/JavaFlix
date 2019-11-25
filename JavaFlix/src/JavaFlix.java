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
import java.awt.Frame;

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
import javax.swing.JTextArea;

public class JavaFlix extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel LogIn;
	private JPanel User;
	private JPanel Movie;
	
	 public static Movie movie1 = new Movie("The Shawshank Redemption","R", "Drama",
	            "<html>Two imprisoned men bond over a number of years, finding solace and " +
	                    "eventual redemption through acts of common decency.</html>", 142);
	    public static Movie movie2 = new Movie("The Godfather", "R", "Crime,Drama",
	            "<html>The aging patriarch of an organized crime dynasty transfers control of his " +
	                    "clandestine empire to his reluctant son.</html>", 175);
	    public static Movie movie3 = new Movie("The Godfather: Part II", "R", "Crime," +
	            "Drama",
	            "<html>The early life and career of Vito Corleone in 1920s New York City is portrayed," +
	                    " while his son, Michael, expands and tightens his grip on the family crime syndicate.</html>",
	            222);
	    public static Movie movie4 = new Movie("The Dark Knight", "PG-13","Action," +
	            "Crime," +
	            "Drama","<html>When the menace known as the Joker wreaks havoc and chaos on the people of " +
	            "Gotham, " +
	            "Batman must accept one of the greatest psychological and physical tests of his ability " +
	            "to fight injustice.</html>", 152 );
	    public static Movie movie5 = new Movie("Pulp Fiction","R", "Crime,Drama",
	            "<html>The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner " +
	                    "bandits intertwine in four tales of violence and redemption.</html>", 154);
	    public static Movie movie6 = new Movie("Joker","R", "Crime,Drama,Thriller",
	            "<html>In Gotham City, mentally-troubled comedian Arthur Fleck is disregarded and " +
	                    "mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. " +
	                    "This path brings him face-to-face with his alter-ego: \"The Joker\".</html>", 122);
	    public static Movie movie7 = new Movie("The Shining","R","Drama,Horror",
	            "<html>A family heads to an isolated hotel for the winter where a sinister presence influences " +
	                    "the father into violence, while his psychic son sees horrific forebodings from " +
	                    "both past and future.</html>",146);

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
		setBounds(400, 350, 644, 396);
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
		Movie.setLayout(null);
		
		JLabel label = new JLabel("JavaFlix");
		label.setBounds(6, 6, 91, 31);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		Movie.add(label);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(36, 49, 61, 16);
		Movie.add(lblTitle);
		
		JLabel lblOutputtitle = new JLabel("OutputTitle");
		lblOutputtitle.setBounds(80, 49, 240, 16);
		Movie.add(lblOutputtitle);
		
		JLabel lblRating = new JLabel("Rating:");
		lblRating.setBounds(344, 49, 61, 16);
		Movie.add(lblRating);
		
		JLabel lblOutputrating = new JLabel("OutputRating");
		lblOutputrating.setBounds(438, 49, 81, 16);
		Movie.add(lblOutputrating);
		
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setBounds(36, 77, 61, 16);
		Movie.add(lblGenre);
		
		JLabel lblOutputgenre = new JLabel("OutputGenre");
		lblOutputgenre.setBounds(80, 77, 140, 16);
		Movie.add(lblOutputgenre);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setBounds(344, 77, 61, 16);
		Movie.add(lblDuration);
		
		JLabel lblOutputduration = new JLabel("OutputDuration");
		lblOutputduration.setBounds(438, 77, 61, 16);
		Movie.add(lblOutputduration);
		
		JLabel lblSynopsis = new JLabel("Synopsis:");
		lblSynopsis.setBounds(27, 123, 70, 16);
		Movie.add(lblSynopsis);
		
		JLabel lblOutputsynopsis = new JLabel("<html>First line<br>Second line</html>");
		lblOutputsynopsis.setVerticalAlignment(SwingConstants.TOP);
		lblOutputsynopsis.setBounds(23, 145, 586, 91);
		Movie.add(lblOutputsynopsis);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(true);
				Movie.setVisible(false);
				
			}
		});
		btnBack.setBounds(258, 308, 117, 29);
		Movie.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("JavaFlix");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(174, 6, 285, 56);
		LogIn.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(252, 77, 130, 26);
		LogIn.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(252, 149, 130, 26);
		LogIn.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(153, 80, 87, 16);
		LogIn.add(lblUsername);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(139, 152, 101, 16);
		LogIn.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBounds(282, 221, 71, 16);
		LogIn.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String password = passwordField.getText();
				String userName = textField.getText();
//				User.setVisible(true);
//				LogIn.setVisible(false);
				
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
		list.setBounds(35, 67, 563, 232);
		User.add(list);
		
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				Movie.setVisible(true);
				User.setVisible(false);
				
				
				lblOutputtitle.setText( ((Movie) list.getSelectedValue()).getTitle());
				lblOutputrating.setText( ((Movie) list.getSelectedValue()).getRating());
				lblOutputgenre.setText( ((Movie) list.getSelectedValue()).getGenre());
				lblOutputduration.setText( ((Movie) list.getSelectedValue()).getDuration());
				lblOutputsynopsis.setText( ((Movie) list.getSelectedValue()).getSynopsis());

				
			}
		});
		btnView.setBounds(318, 311, 117, 29);
		User.add(btnView);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Are you sure you want to leave?", "Login Systems", 
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setBounds(189, 311, 117, 29);
		User.add(btnNewButton_1);
		
		
	}
}
