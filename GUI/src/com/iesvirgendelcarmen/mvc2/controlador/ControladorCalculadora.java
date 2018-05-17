package com.iesvirgendelcarmen.mvc2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.iesvirgendelcarmen.mvc2.vista.Calculadora1;
import com.iesvirgendelcarmen.mvc2.modelo.Modelo;
import com.iesvirgendelcarmen.mvc2.modelo.ModeloOperacionException;

public class ControladorCalculadora implements ActionListener {

	private Modelo modelo;
	private Calculadora1 vista;


	public ControladorCalculadora(Calculadora1 vista) {
		System.out.println("pepep");

		this.vista = vista;
		registrarBotones();
	}


	private void registrarBotones() {
		// TODO Auto-generated method stub
		vista.getBoton1().addActionListener(this);
		vista.getBoton2().addActionListener(this);
		vista.getBoton3().addActionListener(this);
		vista.getBoton4().addActionListener(this);
		vista.getBoton5().addActionListener(this);
		vista.getBoton6().addActionListener(this);
		vista.getBoton7().addActionListener(this);
		vista.getBoton8().addActionListener(this);
		vista.getBoton9().addActionListener(this);
		vista.getBotonC().addActionListener(this);
		vista.getBotonCero().addActionListener(this);
		vista.getBotonDividir().addActionListener(this);
		vista.getBotonIgual().addActionListener(this);
		vista.getBotonMas().addActionListener(this);
		vista.getBotonMenos().addActionListener(this);
		vista.getBotonPor().addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String textoCalculadora = vista.getTextField().getText();
		JButton boton = (JButton) e.getSource();
		String botonString = boton.getText();
		switch (botonString) {
		case "=":
			try {
				modelo = new Modelo(textoCalculadora);
				vista.getTextField().setText(modelo.devolverResultado()+"");
			} catch (ModeloOperacionException e1) {
				// TODO Auto-generated catch block
				vista.error();
				vista.getTextField().setText("");
			}
			break;
		case "C":
			vista.getTextField().setText("");
			
			break;

		default:
			vista.getTextField().setText(textoCalculadora + botonString);
			break;
		}

	}


}
