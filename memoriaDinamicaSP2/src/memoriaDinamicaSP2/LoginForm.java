package memoriaDinamicaSP2;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPasswordField;

/**
 * @author JennyMorales 
 */
public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnLogin;
	private JTextField textUsuario;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login memoria dinámica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 226);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 236, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(54, 75, 79, 13);
		contentPane.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(143, 69, 159, 25);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(54, 116, 79, 13);
		contentPane.add(lblNewLabel_1);
		
		btnLogin = new JButton("Ingresar");
		btnLogin.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] clave =  txtPassword.getPassword();
				String claveFinal = new String(clave);
				
				if( (textUsuario.getText().equals("andrea.cruz") && claveFinal.equals("abc123")) || (textUsuario.getText().equals("jostin.juarez") && claveFinal.equals("abc123")) || (textUsuario.getText().equals("sofia.morales") && claveFinal.equals("abc123"))) {
					dispose();
					JOptionPane.showMessageDialog(null, "Buenvenido al sistema", "INGRESO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
					PrincipalProcesos principal = new PrincipalProcesos();
					principal.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLogin.setBounds(326, 75, 85, 43);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 19));
		lblNewLabel.setBounds(43, 28, 368, 34);
		contentPane.add(lblNewLabel);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(143, 104, 159, 25);
		contentPane.add(txtPassword);
	}
}
