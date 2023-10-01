package rdelatorre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;

public class salesList {

	private JFrame frmSalesList;

	/**
	 * Launch the application.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salesList window = new salesList();
					window.frmSalesList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public salesList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSalesList = new JFrame();
		frmSalesList.setFont(new Font("American Typewriter", Font.PLAIN, 18));
		frmSalesList.setTitle("SALES LIST");
		frmSalesList.setBounds(100, 100, 450, 300);
		frmSalesList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
