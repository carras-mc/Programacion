package formulario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSwing_1 extends JFrame {

	private JPanel panel;
	private JLabel lblSaludo, lblNombre;
	private JTextField textField;
	private JButton btnNewButton;

	

	/**
	 * Create the frame.
	 */
	public FrmSwing_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		definirVentana();
		definirEventos();
		
		
		this.setVisible(true);

	}
	
	private void definirEventos() {
		// TODO Auto-generated method stub
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSaludo.setText(textField.getText());			}
		});
	}


	private void definirVentana() {
		// TODO Auto-generated method stub
		lblSaludo = new JLabel("Pedro maricon");
		lblSaludo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSaludo.setBounds(69, 86, 92, 15);
		panel.add(lblSaludo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(69, 118, 44, 12);
		panel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(118, 115, 96, 18);
		panel.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Aceptar");
		
		btnNewButton.setBounds(236, 114, 84, 20);
		panel.add(btnNewButton);
		
		
	}
}
