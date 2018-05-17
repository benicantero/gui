package com.iesvirgendelcarmen.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.iesvirgendelcarmen.modelo.Sexo;
import com.iesvirgendelcarmen.modelo.Usuario;
import com.iesvirgendelcarmen.vista.Vista;

public class Controlador implements ActionListener{

	private Usuario usuario;
	private Vista vista;



	public Controlador(Usuario usuario, Vista vista) {
		this.usuario = usuario;
		this.vista = vista;
		registrarComponentes(); // fuentes de los eventos
	}

	private void registrarComponentes() {
		// TODO Auto-generated method stub
		vista.getButtonSalir().addActionListener(this);
		vista.getBtnAceptar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String boton = e.getActionCommand();
		System.out.println(boton);
		switch (boton) {
		case "aceptar":
			//codigo para aceptar
			String nombre = vista.getTextFieldNombre().getText();
			String apellido = vista.getTextFieldApellido().getText();
			int edad = (int) vista.getSpinnerEdad().getValue();
			Sexo sexo = Sexo.HOMBRE;
			//String sexoString = vista.getRadioButtonGroup().getSelection().getActionCommand();
			if(vista.getRdbtnMujer().isSelected())
				sexo = Sexo.MUJER;
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setSexo(sexo);
			usuario.setEdad(edad);
			System.out.println(usuario);
			vista.lanzarDiagolo(usuario);
			break;
		case "salir":
			System.exit(0);
			break;

		default:
			break;
		}
	}

}
