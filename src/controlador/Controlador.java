package controlador;

import java.util.Random;

public class Controlador {

	public int iniciarJugadaCPU() {
		return new Random().nextInt(4);
	}

	public boolean comprobarGanador(int puntuacionJugador, int puntuacionCPU) {
		boolean ganador = false;
		if (puntuacionJugador == 3 || puntuacionCPU == 3) {
			ganador = true;
		}
		return ganador;

	}

}
