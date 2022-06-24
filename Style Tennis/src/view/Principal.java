package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Styles Tennis");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icones/icons.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/icones/dunk.png")));
		lblNewLabel.setBounds(640, 349, 128, 128);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New buttom");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setToolTipText("Fornecedores");
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/icones/provider.png")));
		btnNewButton.setBounds(20, 11, 128, 128);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Principal.class.getResource("/icones/clients.png")));
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Clientes");
		btnNewButton_2.setBounds(218, 11, 128, 128);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Principal.class.getResource("/icones/sobre.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setToolTipText("Sobre");
		btnNewButton_3.setBounds(610, 11, 128, 128);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/icones/products.png")));
		btnNewButton_1.setToolTipText("Produtos");
		btnNewButton_1.setBounds(424, 11, 128, 128);
		contentPane.add(btnNewButton_1);
	}// fim do construtor

}
