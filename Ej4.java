package com.generation;

import java.util.Scanner;

public class Codigo4 {

	public static void main(String[] args) {
		Scanner eleccion = new Scanner(System.in);

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String jugador1 = eleccion.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String jugador2 = eleccion.nextLine();

		if (jugador1.equals(jugador2)) {
			System.out.println("Empate");
		} else {

			int g = 2;

			switch (jugador1) {

			case "piedra":
				if (jugador2.equals("tijeras")) {
					g = 1;
				}
				break;

			case "papel":
				if (jugador2.equals("piedra")) {
					g = 1;
				}
				break;

			case "tijeras":
				if (jugador2.equals("papel")) {
					g = 1;
				}
				break;
				
			default:
			}
			System.out.println("Gana el jugador: " + g);
		}
	}
}