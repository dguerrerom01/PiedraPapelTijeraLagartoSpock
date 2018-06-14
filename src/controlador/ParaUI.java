package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utiles.Utiles;
import vista.UI;

public class ParaUI extends UI {
	
	Controlador controlador = new Controlador();
	
	int puntuacionJugador = 0, puntuacionCPU = 0, puntuacionEmpate = 0;
	boolean ganador = false;
	
	public ParaUI() {
		btnPiedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarJugada(Utiles.PIEDRA);
			}
		});

		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarJugada(Utiles.PAPEL);
			}
		});

		btnTijera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarJugada(Utiles.TIJERA);
			}
		});

		btnLagarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarJugada(Utiles.LAGARTO);
			}
		});

		btnSpock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarJugada(Utiles.SPOCK);
			}
		});
	}
	
	private void realizarJugada(int manoJugador) {
		int manoCPU = controlador.iniciarJugadaCPU();
		aplicarReglas(manoJugador, manoCPU);
		imprimirResultado(manoJugador, manoCPU);
		ganador = controlador.comprobarGanador(puntuacionJugador, puntuacionCPU);
		comprobarJugada(manoJugador, manoCPU);
		comprobarGanador();
	}

	private void aplicarReglas(int mano, int manoCPU) {
		if (mano != manoCPU) {
			if (mano == 2 && manoCPU == 1 || mano == 1 && manoCPU == 0 || mano == 0 && manoCPU == 3
					|| mano == 3 && manoCPU == 4 || mano == 4 && manoCPU == 2 || mano == 2 && manoCPU == 3
					|| mano == 3 && manoCPU == 1 || mano == 1 && manoCPU == 4 || mano == 4 && manoCPU == 0
					|| mano == 0 && manoCPU == 2) {
				// Gana el jugador
				puntuacionJugador++;
			} else {
				// Gana CPU
				puntuacionCPU++;
			}
		} else {
			// Empate
			puntuacionEmpate++;
		}
	}
	
	private void imprimirResultado(int manoJugador, int manoCPU) {
		lblMensajes.setText("Has sacado " + Utiles.manos[manoJugador] + " mientras que tu rival ha sacado "
				+ Utiles.manos[manoCPU] + ".");		
		lblPuntuacion.setText("Llevas " + puntuacionJugador + " punto/s, y tu rival lleva "
				+ puntuacionCPU + " punto/s. Habéis empatado " + puntuacionEmpate + " ronda/s.");
	}
	
	private void comprobarJugada(int manoJugador, int manoCPU) {
		if (manoJugador == manoCPU) {
			lblMensajes.setText(lblMensajes.getText() + " Empate.");
		} else {
			if (manoJugador == 2 && manoCPU == 1 || manoJugador == 1 && manoCPU == 0 || manoJugador == 0 && manoCPU == 3
					|| manoJugador == 3 && manoCPU == 4 || manoJugador == 4 && manoCPU == 2 || manoJugador == 2 && manoCPU == 3
					|| manoJugador == 3 && manoCPU == 1 || manoJugador == 1 && manoCPU == 4 || manoJugador == 4 && manoCPU == 0
					|| manoJugador == 0 && manoCPU == 2) {
				lblMensajes.setText(lblMensajes.getText() + " Has ganado esta ronda.");
			} else {
				lblMensajes.setText(lblMensajes.getText() + " Has perdido esta ronda.");
			}
		}
	}
	
	private void comprobarGanador() {
		if (puntuacionJugador == 3) {
			lblPuntuacion.setText(lblPuntuacion.getText() + " Has ganado.");
			deshabilitarBotones();
		}
		if (puntuacionCPU == 3) {
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
