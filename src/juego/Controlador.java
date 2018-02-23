package juego;

import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

public class Controlador {

	// Piedra 0, papel 1, tijera 2, lagarto 3, spock 4
	public static String manos[] = { "piedra", "papel", "tijera", "lagarto", "spock" };
	// Puntuacion 0 = jugador, 1 = CPU, 2 = Empate
	public static int puntuacion[] = { 0, 0, 0 };
	public static boolean ganador = false;

	public static boolean comprobarGanador(int[] puntuacion) {
		boolean ganador = false;
		if (puntuacion[0] == 3) {
			System.out.println("Has ganado");
			ganador = true;
		}
		if (puntuacion[1] == 3) {
			System.out.println("Has perdido");
			ganador = true;
		}
		return ganador;

	}

	public static void mostrarPuntuacion(int[] puntuacion) {
		System.out.println("Llevas " + puntuacion[0] + " punto/s, y tu rival lleva " + puntuacion[1]
				+ " punto/s. Habeis empatado " + puntuacion[2] + " ronda/s");

	}

	public static void aplicarReglas(String[] manos, int mano, int manoCPU, int puntuacion[]) {

		if (mano == manoCPU) {
			System.out.println("Empate");
			puntuacion[2]++;
		} else {
			if (mano == 2 && manoCPU == 1 || mano == 1 && manoCPU == 0 || mano == 0 && manoCPU == 3
					|| mano == 3 && manoCPU == 4 || mano == 4 && manoCPU == 2 || mano == 2 && manoCPU == 3
					|| mano == 3 && manoCPU == 1 || mano == 1 && manoCPU == 4 || mano == 4 && manoCPU == 0
					|| mano == 0 && manoCPU == 2) {
				System.out.println("Has ganado esta ronda");
				puntuacion[0]++;
			} else {
				System.out.println("Has perdido esta ronda");
				puntuacion[1]++;
			}
		}

	}

	public static void mostrarManos(int mano, int manoCPU, String[] manos) {
		System.out.println("Has sacado " + manos[mano] + ", y tu rival ha sacado " + manos[manoCPU]);

	}

	public static int iniciarJugadaCPU() {
		return new Random().nextInt(4);
	}

	public static int iniciarJugada() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca PIEDRA, PAPEL, TIJERA, LAGARTO o SPOCK");
		boolean reconocido = false;
		int mano = 0;
		do {
			String jugada = leer.nextLine();
			jugada = jugada.toUpperCase();
			reconocido = comprobarEntrada(jugada, reconocido);
			mano = convertirEntrada(jugada);
		} while (reconocido == false);
		return mano;
	}

	private static int convertirEntrada(String jugada) {
		int mano = 0;
		switch (jugada) {
		case "PIEDRA":
			mano = 0;
			break;
		case "PAPEL":
			mano = 1;
			break;
		case "TIJERA":
			mano = 2;
			break;
		case "LAGARTO":
			mano = 3;
			break;

		case "SPOCK":
			mano = 4;
			break;
		default:
		}
		return mano;
	}

	public static boolean comprobarEntrada(String jugada, boolean reconocido) {
		switch (jugada) {
		case "PIEDRA":

			return true;

		case "PAPEL":

			return true;
		case "TIJERA":

			return true;
		case "LAGARTO":

			return true;
		case "SPOCK":

			return true;
		default:
			System.out.println("Comando no reconocido");
			return false;
		}

	}

}
