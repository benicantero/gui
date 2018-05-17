package com.iesvirgendelcarmen.contenedores;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Escuchador1 {

	private JFrame frmVentanaConEventos;
	private JPasswordField passwordField;
	private JLabel labelInfo;
	private JTextField textFieldUsuario;
	private JButton btnBorrar;
	//private JTextField textFieldUsuario; 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escuchador1 window = new Escuchador1();
					window.frmVentanaConEventos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Escuchador1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentanaConEventos = new JFrame();
		frmVentanaConEventos.setTitle("Ventana con eventos");
		frmVentanaConEventos.setBounds(100, 100, 450, 300);
		frmVentanaConEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaConEventos.getContentPane().setLayout(null);  // el absolut layout no tien manejadores de posiciones. Deja los elementos en el 
		// sitio que los pongamos

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(41, 46, 46, 14);
		frmVentanaConEventos.getContentPane().add(lblUsuario);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(109, 43, 86, 20);
		frmVentanaConEventos.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(41, 90, 46, 14);
		frmVentanaConEventos.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(109, 90, 86, 20);
		frmVentanaConEventos.getContentPane().add(passwordField);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new PulsarBoton());
		/*btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nuevoUsuario = textFieldUsuario.getText();
				char[] password = passwordField.getPassword();
				System.out.println("Boton pulsado por " + ((JButton) e.getSource()).getText());
				if (password.length !=0 && nuevoUsuario.length() != 0)
				labelInfo.setText("Añadido nuevo usuario: "+ nuevoUsuario);
			}
		});*/
		btnAceptar.setBounds(41, 136, 89, 23);
		frmVentanaConEventos.getContentPane().add(btnAceptar);

		labelInfo = new JLabel("");
		labelInfo.setBounds(41, 180, 247, 14);
		frmVentanaConEventos.getContentPane().add(labelInfo);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new PulsarBoton());

		/*btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nuevoUsuario = textFieldUsuario.getText();
				char[] password = passwordField.getPassword();
				System.out.println("Boton pulsado por " + ((JButton) e.getSource()).getText());
				if (password.length !=0 && nuevoUsuario.length() != 0)
				labelInfo.setText("Usuario borrado");
				textFieldUsuario.setText("");
				passwordField.setText("");

			}
		});*/
		btnBorrar.setBounds(204, 136, 89, 23);
		frmVentanaConEventos.getContentPane().add(btnBorrar);
	}

	class PulsarBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String usuario = textFieldUsuario.getText();
			String cabecera = "Creado usuario";
			if(((JButton) (e.getSource())).getText().equals("Borrar"))
				cabecera = "Borrado usuario ";
			labelInfo.setText(cabecera + usuario);

		}

	}
}
