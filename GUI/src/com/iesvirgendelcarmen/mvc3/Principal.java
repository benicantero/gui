package com.iesvirgendelcarmen.mvc3;

import java.awt.EventQueue;

import com.iesvirgendelcarmen.mvc3.controlador.ControladorMenu;
import com.iesvirgendelcarmen.mvc3.vista.AplicacionMenu;

public class Principal {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionMenu window = new AplicacionMenu();
					ControladorMenu controlador = new ControladorMenu(null, window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
