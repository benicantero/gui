package com.iesvirgendelcarmen.mvc3.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AplicacionMenu {

	private JFrame frame;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JMenu mnData;
	private JMenu mnAbout;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionMenu window = new AplicacionMenu();
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
	public AplicacionMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnData = new JMenu("Data");
		menuBar.add(mnData);
		mnData.setActionCommand("Data");
		
		
		mntmExit = new JMenuItem("Exit");
		mnData.add(mntmExit);
		mntmExit.setActionCommand("Exit");
		
		mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		mnAbout.setActionCommand("About");
		
		mntmAbout = new JMenuItem("About");
		mnAbout.add(mntmAbout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JMenuItem getMntmExit() {
		return mntmExit;
	}

	public JMenuItem getMntmAbout() {
		return mntmAbout;
	}

	public JMenu getMnData() {
		return mnData;
	}

	public JMenu getMnAbout() {
		return mnAbout;
	}

	public void info() {
		JOptionPane.showMessageDialog(frame, "Beni", "Info Autor", JOptionPane.INFORMATION_MESSAGE);
	}
}
