package com.iesvirgendelcarmen.mvc2.vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Calculadora1 {

	private JFrame frame;
	private JTextField textField;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton botonPor;
	private JButton boton9;
	private JButton boton1;
	private JButton boton4;
	private JButton boton2;
	private JButton boton5;
	private JButton botonDividir;
	private JButton botonMas;
	private JButton botonCero;
	private JButton boton3;
	private JButton botonC;
	private JButton botonIgual;
	private JButton botonMenos;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora1 window = new Calculadora1();
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
	public Calculadora1() {
		initialize();
	}
	
	public void error() {
		JOptionPane.showMessageDialog(frame, "formato introducido erroneo", "ERROR", 1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Apicación con windows builder");
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.RED);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.ITALIC, 16));
		panel.add(textField);
		textField.setColumns(30);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		boton7 = new JButton("7");
		panel_1.add(boton7);
		boton7.setActionCommand("boton7");

		
		boton8 = new JButton("8");
		panel_1.add(boton8);
		boton8.setActionCommand("boton8");

		
		boton9 = new JButton("9");
		panel_1.add(boton9);
		boton9.setActionCommand("boton9");

		
		botonPor = new JButton("*");
		panel_1.add(botonPor);
		botonPor.setActionCommand("botonPor");

		
		boton4 = new JButton("4");
		panel_1.add(boton4);
		boton4.setActionCommand("boton4");

		
		boton5 = new JButton("5");
		panel_1.add(boton5);
		boton5.setActionCommand("boton5");

		
		boton6 = new JButton("6");
		panel_1.add(boton6);
		boton6.setActionCommand("boton6");

		
		botonDividir = new JButton("/");
		panel_1.add(botonDividir);
		botonDividir.setActionCommand("botonDividir");

		
		boton1 = new JButton("1");
		panel_1.add(boton1);
		boton1.setActionCommand("boton1");

		
		boton2 = new JButton("2");
		panel_1.add(boton2);
		boton2.setActionCommand("boton2");

		
		boton3 = new JButton("3");
		panel_1.add(boton3);
		boton3.setActionCommand("boton3");

		
		botonMas = new JButton("+");
		panel_1.add(botonMas);
		botonMas.setActionCommand("botonMas");

		
		botonCero = new JButton("0");
		panel_1.add(botonCero);
		botonCero.setActionCommand("botonCero");

		
		botonC = new JButton("C");
		panel_1.add(botonC);
		botonC.setActionCommand("botonC");

		
		botonIgual = new JButton("=");
		panel_1.add(botonIgual);
		botonIgual.setActionCommand("botonIgual");

		
		botonMenos = new JButton("-");
		panel_1.add(botonMenos);
		botonMenos.setActionCommand("botonMenos");
	}

	public JButton getBoton6() {
		return boton6;
	}

	public JButton getBoton7() {
		return boton7;
	}

	public JButton getBoton8() {
		return boton8;
	}

	public JButton getBotonPor() {
		return botonPor;
	}

	public JButton getBoton9() {
		return boton9;
	}

	public JButton getBoton1() {
		return boton1;
	}

	public JButton getBoton4() {
		return boton4;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public JButton getBoton5() {
		return boton5;
	}

	public JButton getBotonDividir() {
		return botonDividir;
	}

	public JButton getBotonMas() {
		return botonMas;
	}

	public JButton getBotonCero() {
		return botonCero;
	}

	public JButton getBoton3() {
		return boton3;
	}

	public JButton getBotonC() {
		return botonC;
	}

	public JButton getBotonIgual() {
		return botonIgual;
	}

	public JButton getBotonMenos() {
		return botonMenos;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

}
