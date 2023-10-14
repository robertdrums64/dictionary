package rdelatorre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class salesList {

	private JFrame frmSalesList;
	private JTextField itemField;
	private JTextField costField;
	private JTextField quantityField;

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
		frmSalesList.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(60, 10, 61, 16);
		frmSalesList.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cost:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(60, 48, 61, 16);
		frmSalesList.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(60, 86, 80, 16);
		frmSalesList.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add to list");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.setBounds(151, 120, 117, 29);
		frmSalesList.getContentPane().add(btnNewButton);
		
		itemField = new JTextField();
		itemField.setBounds(151, 6, 205, 26);
		frmSalesList.getContentPane().add(itemField);
		itemField.setColumns(10);
		
		costField = new JTextField();
		costField.setBounds(151, 44, 205, 26);
		frmSalesList.getContentPane().add(costField);
		costField.setColumns(10);
		
		quantityField = new JTextField();
		quantityField.setBounds(152, 82, 204, 26);
		frmSalesList.getContentPane().add(quantityField);
		quantityField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 159, 296, 66);
		frmSalesList.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel_3 = new JLabel("Total:");
		lblNewLabel_3.setBounds(60, 239, 61, 16);
		frmSalesList.getContentPane().add(lblNewLabel_3);
		
		JTextArea totalArea = new JTextArea();
		totalArea.setBounds(151, 239, 205, 16);
		frmSalesList.getContentPane().add(totalArea);
	}
}
