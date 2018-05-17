package com.iesvirgendelcarmen.mvc2;

import java.awt.EventQueue;

import com.iesvirgendelcarmen.mvc2.vista.Calculadora1;
import com.iesvirgendelcarmen.mvc2.controlador.ControladorCalculadora;
//import com.iesvirgendelcarmen.controlador.Controlador;
//import com.iesvirgendelcarmen.modelo.Usuario;
//import com.iesvirgendelcarmen.vista.Vista;

public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Usuario usuario = new Usuario();  // inicializo el modelo
					Calculadora1 window = new Calculadora1();       // inicializo la vista
					new ControladorCalculadora(window); // creo objeto controlador

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


