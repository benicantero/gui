package com.iesvirgendelcarmen.vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import com.iesvirgendelcarmen.modelo.Sexo;
import com.iesvirgendelcarmen.modelo.Usuario;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Vista {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JButton btnAceptar;
	private JButton buttonSalir;
	private JSpinner spinnerEdad;
	private ButtonGroup radioButtonGroup;
	private JLabel lblSexo;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMvc window = new LoginMvc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setTitle("Aplicacion de usuarios");
		frame.setVisible(true);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 11, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(22, 48, 46, 14);
		frame.getContentPane().add(lblApellido);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(78, 8, 86, 20);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(78, 45, 86, 20);
		frame.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(233, 11, 46, 14);
		frame.getContentPane().add(lblEdad);
		
		SpinnerModel sm = new SpinnerNumberModel(1, 1, 100, 1);
		spinnerEdad = new JSpinner(sm);
		spinnerEdad.setBounds(289, 9, 46, 17);
		frame.getContentPane().add(spinnerEdad);
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setSelected(true);
		rdbtnHombre.setBounds(289, 44, 109, 23);
		frame.getContentPane().add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(289, 70, 109, 23);
		frame.getContentPane().add(rdbtnMujer);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(233, 48, 46, 20);
		frame.getContentPane().add(lblSexo);
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(rdbtnHombre);
		radioButtonGroup.add(rdbtnMujer);
		
		JLabel lblNewLabelTextoUsuario = new JLabel("");
		lblNewLabelTextoUsuario.setBounds(22, 156, 398, 34);
		frame.getContentPane().add(lblNewLabelTextoUsuario);
		
		
		btnAceptar = new JButton("Aceptar");
		/*btnAceptar.addActionListener(new ActionListener() {
			
			//@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = textFieldNombre.getText();
				String apellido = textFieldApellido.getText();
				int edad = (int) spinnerEdad.getValue();
				Sexo sexo = Sexo.HOMBRE;
				if(rdbtnMujer.isSelected())
					sexo = Sexo.MUJER;
				
				Usuario usuario = new Usuario (nombre, apellido, edad, sexo);
				//opcion 1 sale en la frame
				lblNewLabelTextoUsuario.setText(usuario.toString());
				// opcion 2 sale una ventana adicional
				JOptionPane dialogo = new JOptionPane();
				dialogo.showMessageDialog(frame, "Creado usuario: " + usuario, "informacion de usuario" ,JOptionPane.INFORMATION_MESSAGE);
				//JOptionPan.showMessageDialog(frame, "Creado usuario: " + usuario , "Informacion de usuario" , JOptionPane.INFORMATION_MESSAGE);
			}
		});*/
		btnAceptar.setBounds(22, 107, 89, 23);
		btnAceptar.setActionCommand("aceptar");
		frame.getContentPane().add(btnAceptar);
		
		buttonSalir = new JButton("Salir");
		/*buttonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});*/
		buttonSalir.setBounds(310, 214, 70, 22);
		frame.getContentPane().add(buttonSalir);
		buttonSalir.setActionCommand("salir");
		
	}

	public JRadioButton getRdbtnMujer() {
		return rdbtnMujer;
	}

	public JSpinner getSpinnerEdad() {
		return spinnerEdad;
	}

	public ButtonGroup getRadioButtonGroup() {
		return radioButtonGroup;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellido() {
		return textFieldApellido;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public JButton getButtonSalir() {
		return buttonSalir;
	}
	public void lanzarDiagolo(Usuario usuario) {
		JOptionPane dialogo = new JOptionPane();
		dialogo.showMessageDialog(frame, "Creado usuario: " + usuario, "informacion de usuario" ,JOptionPane.INFORMATION_MESSAGE);
	}
	
}
