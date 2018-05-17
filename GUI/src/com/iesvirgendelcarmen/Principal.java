package com.iesvirgendelcarmen;

import java.awt.EventQueue;

import com.iesvirgendelcarmen.controlador.Controlador;
import com.iesvirgendelcarmen.modelo.Usuario;
import com.iesvirgendelcarmen.vista.Vista;

public class Principal {

	 public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Usuario usuario = new Usuario();  // inicializo el modelo
						Vista window = new Vista();  // inicializo la vista
						new Controlador(usuario, window); // creo objeto controlador
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}
