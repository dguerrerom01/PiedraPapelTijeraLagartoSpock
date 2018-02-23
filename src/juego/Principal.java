package juego;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends UI {

	Controlador controlador = new Controlador();

	public Principal() {
		super();

		btnPiedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Piedra = 0
				int mano = 0;
				realizarJugada(mano);
			}

		});

		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Papel = 1
				int mano = 1;
				realizarJugada(mano);
			}

		});

		btnTijera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tijera = 2
				int mano = 2;
				realizarJugada(mano);
			}

		});

		btnLagarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Lagarto = 3
				int mano = 3;
				realizarJugada(mano);
			}

		});

		btnSpock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Spock = 4
				int mano = 4;
				realizarJugada(mano);
			}

		});
	}

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

	private void realizarJugada(int mano) {
		int manoCPU = Controlador.iniciarJugadaCPU();
		lblMensajes.setText("Has sacado " + Controlador.manos[mano] + " mientras que tu rival ha sacado "
				+ Controlador.manos[manoCPU] + ".");
		Controlador.aplicarReglas(Controlador.manos, mano, manoCPU, Controlador.puntuacion);
		lblPuntuacion.setText("Llevas " + Controlador.puntuacion[0] + " punto/s, y tu rival lleva "
				+ Controlador.puntuacion[1] + " punto/s. Habéis empatado " + Controlador.puntuacion[2] + " ronda/s.");
		Controlador.ganador = Controlador.comprobarGanador(Controlador.puntuacion);
		if (mano == manoCPU) {
			lblMensajes.setText(lblMensajes.getText() + " Empate.");

		} else {
			if (mano == 2 && manoCPU == 1 || mano == 1 && manoCPU == 0 || mano == 0 && manoCPU == 3
					|| mano == 3 && manoCPU == 4 || mano == 4 && manoCPU == 2 || mano == 2 && manoCPU == 3
					|| mano == 3 && manoCPU == 1 || mano == 1 && manoCPU == 4 || mano == 4 && manoCPU == 0
					|| mano == 0 && manoCPU == 2) {
				lblMensajes.setText(lblMensajes.getText() + " Has ganado esta ronda.");
			} else {
				lblMensajes.setText(lblMensajes.getText() + " Has perdido esta ronda.");
			}
		}
		if (Controlador.puntuacion[0] == 3) {
			lblPuntuacion.setText(lblPuntuacion.getText() + " Has ganado.");
			deshabilitarBotones();
		}
		if (Controlador.puntuacion[1] == 3) {
			lblPuntuacion.setText(lblPuntuacion.getText() + " Has perdido.");
			deshabilitarBotones();
		}
	}

	private void deshabilitarBotones() {
		btnPiedra.setEnabled(false);
		btnPapel.setEnabled(false);
		btnTijera.setEnabled(false);
		btnLagarto.setEnabled(false);
		btnSpock.setEnabled(false);
	}

}
