
package memoriaDinamicaSP2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalProcesos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombreProceso;
	private JTextField textTamanio;
	private JTextField textTmpLlegada;
	private JTextField textDuracion;
	private Proceso procesos;
	
	//Instancia clase pila de los  metodos
	ColaProcesos cola = new ColaProcesos();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalProcesos frame = new PrincipalProcesos();
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
	public PrincipalProcesos() {
		setTitle("Procesos memoria dinámica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 236, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ingrese los procesos a la cola:");
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNewLabel.setBounds(62, 75, 259, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreProceso = new JLabel("Nombre del proceso:");
		lblNombreProceso.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblNombreProceso.setBounds(62, 141, 128, 13);
		contentPane.add(lblNombreProceso);
		
		textNombreProceso = new JTextField();
		lblNombreProceso.setLabelFor(textNombreProceso);
		textNombreProceso.setBounds(200, 134, 187, 25);
		contentPane.add(textNombreProceso);
		textNombreProceso.setColumns(10);
		
		JLabel lblTamaño = new JLabel("Tamaño: ");
		lblTamaño.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblTamaño.setBounds(62, 176, 69, 13);
		contentPane.add(lblTamaño);
		
		JLabel lblTmpLlegada = new JLabel("Tiempo de llegada:");
		lblTmpLlegada.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblTmpLlegada.setBounds(62, 211, 117, 13);
		contentPane.add(lblTmpLlegada);
		
		textTamanio = new JTextField();
		lblTamaño.setLabelFor(textTamanio);
		textTamanio.setBounds(200, 169, 187, 25);
		contentPane.add(textTamanio);
		textTamanio.setColumns(10);
		
		textTmpLlegada = new JTextField();
		lblTmpLlegada.setLabelFor(textTmpLlegada);
		textTmpLlegada.setBounds(200, 204, 187, 25);
		contentPane.add(textTmpLlegada);
		textTmpLlegada.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duración:");
		lblDuracion.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblDuracion.setBounds(62, 246, 89, 13);
		contentPane.add(lblDuracion);
		
		textDuracion = new JTextField();
		lblDuracion.setLabelFor(textDuracion);
		textDuracion.setBounds(200, 239, 187, 25);
		contentPane.add(textDuracion);
		textDuracion.setColumns(10);
		
		JButton btnAgregar = new JButton("Guardar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreProceso = textNombreProceso.getText();
				int tamanio = Integer.valueOf(textTamanio.getText());
				int tiempoLlegada = Integer.valueOf(textTmpLlegada.getText());
				int duracion = Integer.valueOf(textDuracion.getText());
				
				procesos = new Proceso(nombreProceso,tamanio,tiempoLlegada,duracion);
				
			    cola.push(procesos);
			}
		});
		btnAgregar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnAgregar.setBounds(62, 323, 85, 25);
		contentPane.add(btnAgregar);
		
		JButton btnBitacora = new JButton("Bitacora");
		btnBitacora.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnBitacora.setBounds(183, 323, 85, 25);
		contentPane.add(btnBitacora);
		
		JButton btnGraficar = new JButton("Graficar");
		btnGraficar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnGraficar.setBounds(302, 324, 85, 25);
		contentPane.add(btnGraficar);
		
		JLabel lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblMensaje.setBounds(62, 283, 322, 21);
		contentPane.add(lblMensaje);
	}

}
