package com.iesvirgendelcarmen.contenedores;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Primera ventana"); // crea una frame invisible segun la definicion del constructor
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// para que se cierre la ventana
		frame.setLocationRelativeTo(null);//para que se quede centrada
		JButton boton = new JButton("Botón");
		frame.add(boton); // la clase JButton hereda de component
		frame.setResizable(false); // para que no se pueda redimensionar. tamaño fijo
		frame.setVisible(true); // para que se haga visible
		
		
	}

}
