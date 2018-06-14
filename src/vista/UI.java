package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JLabel lblMensajes;
	protected JButton btnSpock;
	protected JButton btnLagarto;
	protected JButton btnTijera;
	protected JButton btnPapel;
	protected JButton btnPiedra;
	protected JLabel lblPuntuacion;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblPiedraPapelTijera = new JLabel("Piedra, papel, tijera, lagarto o Spock");
		lblPiedraPapelTijera.setFont(new Font("Tahoma", Font.BOLD, 22));
		GridBagConstraints gbc_lblPiedraPapelTijera = new GridBagConstraints();
		gbc_lblPiedraPapelTijera.gridwidth = 5;
		gbc_lblPiedraPapelTijera.insets = new Insets(0, 0, 5, 0);
		gbc_lblPiedraPapelTijera.gridx = 0;
		gbc_lblPiedraPapelTijera.gridy = 0;
		contentPane.add(lblPiedraPapelTijera, gbc_lblPiedraPapelTijera);

		btnPiedra = new JButton("Piedra");
		btnPiedra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnPiedra = new GridBagConstraints();
		gbc_btnPiedra.insets = new Insets(0, 0, 5, 5);
		gbc_btnPiedra.gridx = 0;
		gbc_btnPiedra.gridy = 1;
		contentPane.add(btnPiedra, gbc_btnPiedra);

		btnPapel = new JButton("Papel");
		btnPapel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnPapel = new GridBagConstraints();
		gbc_btnPapel.insets = new Insets(0, 0, 5, 5);
		gbc_btnPapel.gridx = 1;
		gbc_btnPapel.gridy = 1;
		contentPane.add(btnPapel, gbc_btnPapel);

		btnTijera = new JButton("Tijera");
		btnTijera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnTijera = new GridBagConstraints();
		gbc_btnTijera.insets = new Insets(0, 0, 5, 5);
		gbc_btnTijera.gridx = 2;
		gbc_btnTijera.gridy = 1;
		contentPane.add(btnTijera, gbc_btnTijera);

		btnLagarto = new JButton("Lagarto");
		btnLagarto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnLagarto = new GridBagConstraints();
		gbc_btnLagarto.insets = new Insets(0, 0, 5, 5);
		gbc_btnLagarto.gridx = 3;
		gbc_btnLagarto.gridy = 1;
		contentPane.add(btnLagarto, gbc_btnLagarto);

		btnSpock = new JButton("Spock");
		btnSpock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnSpock = new GridBagConstraints();
		gbc_btnSpock.insets = new Insets(0, 0, 5, 0);
		gbc_btnSpock.gridx = 4;
		gbc_btnSpock.gridy = 1;
		contentPane.add(btnSpock, gbc_btnSpock);

		JLabel Mensaje = new JLabel("Mensaje:");
		Mensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_Mensaje = new GridBagConstraints();
		gbc_Mensaje.insets = new Insets(0, 0, 5, 5);
		gbc_Mensaje.gridx = 0;
		gbc_Mensaje.gridy = 2;
		contentPane.add(Mensaje, gbc_Mensaje);

		lblMensajes = new JLabel("Seleccione Piedra, Papel, Tiera, Lagarto o Spock.");
		lblMensajes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMensajes = new GridBagConstraints();
		gbc_lblMensajes.gridwidth = 5;
		gbc_lblMensajes.insets = new Insets(0, 0, 5, 0);
		gbc_lblMensajes.gridx = 0;
		gbc_lblMensajes.gridy = 3;
		contentPane.add(lblMensajes, gbc_lblMensajes);

		lblPuntuacion = new JLabel(" ");
		lblPuntuacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblPuntuacion = new GridBagConstraints();
		gbc_lblPuntuacion.gridwidth = 5;
		gbc_lblPuntuacion.gridx = 0;
		gbc_lblPuntuacion.gridy = 4;
		contentPane.add(lblPuntuacion, gbc_lblPuntuacion);
	}

}
