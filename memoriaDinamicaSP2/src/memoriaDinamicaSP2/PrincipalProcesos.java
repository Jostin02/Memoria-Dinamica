
package memoriaDinamicaSP2;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
import javax.swing.SwingConstants;

public class PrincipalProcesos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombreProceso;
	private JTextField textTamanio;
	private JTextField textTmpLlegada;
	private JTextField textDuracion;
	private Proceso procesos;
	TablaProcesos frameTabla = new TablaProcesos();
	
	//Instancia clase pila de los  metodos
	ColaProcesos cola = new ColaProcesos();
	private JTextField textMemoriaTotal;
	private JTextField textMemoriaSo;
	private JLabel lblMensaje;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalProcesos frame = new PrincipalProcesos();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);	
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
		setBounds(100, 100, 470, 483);
		contentPane = new JPanel();
		
		KeyListener eventoTeclado = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
			 System.out.println("KeyPressed");
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		contentPane.addKeyListener(eventoTeclado);
				
		contentPane.setBackground(new Color(217, 236, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ingrese los procesos a la cola:");
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNewLabel.setBounds(60, 171, 259, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreProceso = new JLabel("Nombre del proceso:");
		lblNombreProceso.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblNombreProceso.setBounds(60, 200, 128, 13);
		contentPane.add(lblNombreProceso);
		
		textNombreProceso = new JTextField();
		lblNombreProceso.setLabelFor(textNombreProceso);
		textNombreProceso.setBounds(200, 194, 164, 25);
		contentPane.add(textNombreProceso);
		textNombreProceso.setColumns(10);
		
		JLabel lblTamaño = new JLabel("Tamaño: ");
		lblTamaño.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblTamaño.setBounds(62, 235, 69, 13);
		contentPane.add(lblTamaño);
		
		JLabel lblTmpLlegada = new JLabel("Tiempo de llegada:");
		lblTmpLlegada.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblTmpLlegada.setBounds(62, 270, 117, 13);
		contentPane.add(lblTmpLlegada);
		
		textTamanio = new JTextField();
		lblTamaño.setLabelFor(textTamanio);
		textTamanio.setBounds(200, 229, 164, 25);
		contentPane.add(textTamanio);
		textTamanio.setColumns(10);
		
		textTmpLlegada = new JTextField();
		lblTmpLlegada.setLabelFor(textTmpLlegada);
		textTmpLlegada.setBounds(200, 264, 164, 25);
		contentPane.add(textTmpLlegada);
		textTmpLlegada.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duración:");
		lblDuracion.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblDuracion.setBounds(62, 305, 117, 13);
		contentPane.add(lblDuracion);
		
		textDuracion = new JTextField();
		lblDuracion.setLabelFor(textDuracion);
		textDuracion.setBounds(200, 299, 164, 25);
		contentPane.add(textDuracion);
		textDuracion.setColumns(10);
		
		JButton btnAgregar = new JButton("Guardar proceso");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreProceso = textNombreProceso.getText();
				int tamanio = Integer.valueOf(textTamanio.getText());
				int tiempoLlegada = Integer.valueOf(textTmpLlegada.getText());
				int duracion = Integer.valueOf(textDuracion.getText());
				
				//Crea el objeto proceso con los atributos  ingresados por el usuario
				procesos = new Proceso(nombreProceso,tamanio,tiempoLlegada,duracion);
				//Inserta el proceso enviado desde la interfaz
			    cola.push(procesos);
			    cola.mostrarProcesoCola();
			    //Setear en limpio los inputs
			    textNombreProceso.setText("");
			    textTamanio.setText("");
			    textTmpLlegada.setText("");
			    textDuracion.setText("");
			    
			}
		});
		btnAgregar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnAgregar.setBounds(60, 355, 138, 25);
		contentPane.add(btnAgregar);
		
		JButton btnBitacora = new JButton("Bitacora");
		btnBitacora.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnBitacora.setBounds(302, 355, 85, 25);
		contentPane.add(btnBitacora);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(new Color(151, 0, 75));
		lblMensaje.setFont(new Font("Lucida Sans Unicode", Font.ITALIC, 10));
		lblMensaje.setBackground(new Color(64, 0, 64));
		lblMensaje.setBounds(30, 335, 381, 21);
		contentPane.add(lblMensaje);
		
		JLabel lblMemoriaT = new JLabel("Memoria total:");
		lblMemoriaT.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblMemoriaT.setBounds(60, 52, 109, 21);
		contentPane.add(lblMemoriaT);
		
		textMemoriaTotal = new JTextField();
		lblMemoriaT.setLabelFor(textMemoriaTotal);
		textMemoriaTotal.setBounds(198, 50, 164, 25);
		contentPane.add(textMemoriaTotal);
		textMemoriaTotal.setColumns(10);
		
		JLabel lblMemoriaSO = new JLabel("Memoria SO:");
		lblMemoriaSO.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblMemoriaSO.setBounds(60, 91, 119, 13);
		contentPane.add(lblMemoriaSO);
		
		textMemoriaSo = new JTextField();
		textMemoriaSo.setBounds(198, 85, 164, 25);
		contentPane.add(textMemoriaSo);
		textMemoriaSo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Uso de Memoria Dinámica");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(60, 21, 327, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btnGuardarMemoria = new JButton("Guardar Memoria");
		btnGuardarMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(textMemoriaTotal.getText().equals("") && textMemoriaSo.getText().equals("")) {
					lblMensaje.setText("Debe ingresar datos de la memoria.");
				}else {
					int memoriaTotal = Integer.valueOf(textMemoriaTotal.getText());
					int memoriaSo = Integer.valueOf(textMemoriaSo.getText());
				
					if(memoriaSo < memoriaTotal) {
						//Setea los atributos de memoria para hacer los calculos en en la clase cola 
						cola.setMemoriaT(memoriaTotal);
						cola.setMemoriaSo(memoriaSo);
						btnGuardarMemoria.setEnabled(false);
						textMemoriaTotal.setEditable(false);
						textMemoriaSo.setEditable(false);
						lblMensaje.setText("");
					}else {
						lblMensaje.setText("La memoria total a usar debe ser mayor a la del sistema operativo.");
					}
				}
				
			}
		});
		btnGuardarMemoria.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnGuardarMemoria.setBounds(60, 128, 138, 21);
		contentPane.add(btnGuardarMemoria);
		
		JLabel lblTamanioMt = new JLabel("MB.");
		lblTamanioMt.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblTamanioMt.setBounds(363, 50, 24, 25);
		contentPane.add(lblTamanioMt);
		
		JLabel lblTamanioSO = new JLabel("MB.");
		lblTamanioSO.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblTamanioSO.setBounds(363, 85, 24, 25);
		contentPane.add(lblTamanioSO);
		
		JLabel lblTamanioMb = new JLabel("MB.");
		lblTamanioMb.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		lblTamanioMb.setBounds(363, 229, 24, 25);
		contentPane.add(lblTamanioMb);
	}
}
