package ventanaCalculadora;

import javax.swing.*;
import java.awt.event.*;// se agrega para el boton.
import java.io.File;

public class VentanaCalculadora extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField operando1, operando2, resultado;
	private JButton restar, sumar, multiplicar, dividir, cerrar, acerca;
	private JLabel titulo, texto1, texto2, result;

	public VentanaCalculadora() {
		super("Calculadora Ana");
		ImageIcon imagen1 = new ImageIcon("imagen" + File.separator + "calculadora.png");
		setIconImage(imagen1.getImage());
        setLayout(null);
		
		// text fields
		operando1 = new JTextField();
		operando1.setBounds(100, 100, 100, 20);
		add(operando1);
		operando2 = new JTextField();
		operando2.setBounds(100, 130, 100, 20);
		add(operando2);
		resultado = new JTextField();
		resultado.setBounds(100, 160, 100, 20);
		add(resultado);
		// buttons
		restar = new JButton("Restar");
		restar.setBounds(220, 100, 100, 50);
		add(restar);
		restar.addActionListener(this);

		sumar = new JButton("Sumar");
		sumar.setBounds(220, 160, 100, 50);
		add(sumar);
		sumar.addActionListener(this);

		multiplicar = new JButton("Multiplicar");
		multiplicar.setBounds(220, 220, 100, 50);
		add(multiplicar);
		multiplicar.addActionListener(this);

		dividir = new JButton("Dividir");
		dividir.setBounds(220, 280, 100, 50);
		add(dividir);
		dividir.addActionListener(this);

		cerrar = new JButton("Salir");
		cerrar.setBounds(100, 200, 100, 50);
		add(cerrar);
		cerrar.addActionListener(this);

		acerca = new JButton("Acerca");
		acerca.setBounds(100, 260, 100, 50);
		add(acerca);
		acerca.addActionListener(this);
		// labels
		titulo = new JLabel("Calculadora");
		titulo.setBounds(130, 40, 200, 30);
		add(titulo);

		texto1 = new JLabel("Primer Valor: ");
		texto1.setBounds(10, 95, 200, 30);
		add(texto1);

		texto2 = new JLabel("Segundo Valor: ");
		texto2.setBounds(10, 125, 200, 30);
		add(texto2);

		result = new JLabel("Resultado: ");
		result.setBounds(10, 155, 200, 30);
		add(result);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == restar) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 - num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}
		if (e.getSource() == sumar) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 + num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}
		if (e.getSource() == multiplicar) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 * num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}
		if (e.getSource() == dividir) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 / num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}

		if (e.getSource() == cerrar) {
			System.exit(0);
		}

		if (e.getSource() == acerca) {
			JOptionPane.showMessageDialog(null, "Calculadora Sencilla");
		}
	}

	public static void main(String[] ar) {
		VentanaCalculadora open = new VentanaCalculadora();
		open.setBounds(10, 10, 400, 400);
	    open.setLocation(450, 200);
		open.setResizable(false);
		open.setVisible(true);
	}
}
