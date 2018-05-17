package com.iesvirgendelcarmen.mvc3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import com.iesvirgendelcarmen.mvc3.modelo.ModeloMenu;
import com.iesvirgendelcarmen.mvc3.vista.AplicacionMenu;

public class ControladorMenu implements ActionListener{

	private ModeloMenu modelo;
	private AplicacionMenu vista;


	public ControladorMenu(ModeloMenu modelo, AplicacionMenu vista) {
		this.modelo = modelo;
		this.vista = vista;
		registrarBotones();
	}


	private void registrarBotones() {
		// TODO Auto-generated method stub
		vista.getMntmExit().addActionListener(this);
		vista.getMntmAbout().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().getClass() == JMenuItem.class) {
			System.out.println("pulsado menu item");
			JMenuItem menuItem = (JMenuItem) e.getSource();
			String menuString = menuItem.getText();
			System.out.println(menuString);
			switch (menuString) {			
			case "Exit":
				System.exit(0);
				break;
			case "About":
				vista.info();
				break;
			default:

				break;
			}



		}



	}
}