package com.iesvirgendelcarmen.contenedores;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Calculadora {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				JFrame frame = new Interfaz();
				frame.setVisible(true);

			}
		});
	}
}

class Interfaz extends JFrame {

	JButton botonUno = new JButton("1");
	JButton botonDos = new JButton("2");
	JButton botonTres = new JButton("3");
	JButton botonCuatro = new JButton("4");
	JButton botonCinco = new JButton("5");
	JButton botonSeis = new JButton("6");
	JButton botonSiete = new JButton("7");
	JButton botonOcho = new JButton("8");
	JButton botonNueve = new JButton("9");
	JButton botonCero = new JButton("0");
	JButton botonMas= new JButton("+");
	JButton botonMenos = new JButton("-");
	JButton botonDividir = new JButton("/");
	JButton botonMultiplicar = new JButton("*");
	JButton botonIgual = new JButton("=");
	
	
	public Interfaz() {
		iniciarVentana();
		colocarComponentes();
	}

	private void iniciarVentana() {
		setTitle("Calculadora"); //titulo
		//setSize(300, 200); // tamaño
		setBounds(10, 10, 300, 300); // le da posicion (x,y) y tamaño a la frame
		setLocationRelativeTo(null); // centrado
		//setResizable(false);// no se puede redimensionar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // se cierra al acabar			
	}

	private void colocarComponentes() {
		
		JPanel panel = new JPanel(new GridLayout(4, 4));
		panel.add(botonCero);


	}
}