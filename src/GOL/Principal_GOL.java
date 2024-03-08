package GOL;

import java.util.Random;

import entrada.Teclado;

public class Principal_GOL {
	public static void main(String[] args) {
		int opcion, simulacion = 20;
		int [][] matriz;
		do {
			menu();
			opcion = Teclado.leerEntero("¿Opcion (0-6)? "+"\n");

			switch (opcion) {
			case 0:
				break;
			case 1:
				matriz = simulacion1();
				matriz = rodearMatriz(matriz);
				System.out.println("Turno 0");
				escribirMatriz(matriz);
				for (int turno = 1; turno < simulacion+1; turno++) {
					System.out.println("Turno actual " + turno);
					matriz = siguienteTurno(matriz,30,30);
					escribirMatriz(matriz);
					System.out.println();
				}
				break;
			case 2:
				matriz = simulacion2();
				matriz = rodearMatriz(matriz);
				System.out.println("Turno 0");
				escribirMatriz(matriz);
				for (int turno = 1; turno < simulacion+1; turno++) {
					System.out.println("Turno actual " + turno);
					matriz = siguienteTurno(matriz,30,30);
					escribirMatriz(matriz);
					System.out.println();
				}
				break;
			case 3:
				matriz = simulacion3();
				matriz = rodearMatriz(matriz);
				System.out.println("Turno 0");
				escribirMatriz(matriz);
				for (int turno = 1; turno < simulacion+1; turno++) {
					System.out.println("Turno actual " + turno);
					matriz = siguienteTurno(matriz,30,30);
					escribirMatriz(matriz);
					System.out.println();
				}
				break;
			case 4:
				matriz = simulacion4();
				matriz = rodearMatriz(matriz);
				System.out.println("Turno 0");
				escribirMatriz(matriz);
				for (int turno = 1; turno < simulacion+1; turno++) {
					System.out.println("Turno actual " + turno);
					matriz = siguienteTurno(matriz,30,30);
					escribirMatriz(matriz);
					System.out.println();
				}
				break;
			case 5:
				matriz = simulacion5();
				matriz = rodearMatriz(matriz);
				System.out.println("Turno 0");
				escribirMatriz(matriz);
				for (int turno = 1; turno < simulacion+1; turno++) {
					System.out.println("Turno actual " + turno);
					matriz = siguienteTurno(matriz,30,30);
					escribirMatriz(matriz);
					System.out.println();
				}
				break;
			case 6:
				int[][] matriz2 = generarMatrizAleatoria(30, 30, 0, 1);
				System.out.println("Turno 0");
				escribirMatriz(matriz2);
				for (int turno = 1; turno < simulacion+1; turno++) {
					System.out.println("Turno actual " + turno);
					matriz2 = siguienteTurno(matriz2,30,30);
					escribirMatriz(matriz2);
					System.out.println();
				}
				break;
			
			}

		} while (opcion != 0);
	}

	public static void menu() {
		System.out.println("(0) para salir");
		System.out.println("(1) realizar simulacion 1");
		System.out.println("(2) realizar simulacion 2");
		System.out.println("(3) realizar simulacion 3");
		System.out.println("(4) realizar simulacion 4");
		System.out.println("(5) realizar simulacion 5");
		System.out.println("(6) utilizar tablero aleatorio");
	}

	public static int[][] simulacion1() {
		int[][] matrizInicial = {
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }};
		return matrizInicial;

	}
	public static int[][] simulacion2() {
		int[][] matrizInicial = {
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }};
		return matrizInicial;

	}
	public static int[][] simulacion3() {
		int[][] matrizInicial = {
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }};
		return matrizInicial;

	}
	public static int[][] simulacion4() {
		int[][] matrizInicial = {
				{ 0, 0, 1, 1, 1, 0, 0, 0 ,1 ,1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
				{ 0, 0, 1, 1, 1, 0, 0, 0 ,1 ,1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0, 0 ,1 ,1, 1, 0, 0 },
				{ 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0, 0 ,1 ,1, 1, 0, 0}};
		return matrizInicial;

	}
	public static int[][] simulacion5() {
		int[][] matrizInicial = {
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }};
		return matrizInicial;

	}


	public static int[][] generarMatrizAleatoria(int filas, int columnas, int limiteInferior, int limiteSuperior) {
		int[][] matriz = new int[filas][columnas];
		Random rand = new Random();

		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				matriz[fila][columna] = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
			}
		}

		return matriz;
	}

	public static void escribirMatriz(int[][] matriz) {
		// se dividira en dos bucles que recorran la matríz y la vaya imprimiendo
		for (int fila = 0; fila < matriz.length; fila++) {
			System.out.print("[");
			for (int columna = 0; columna < matriz[0].length; columna++) {
				if (matriz[fila][columna] == 1) {
					System.out.printf("%-1s", "⬛");
				} else if (matriz[fila][columna] == 0) {
					System.out.printf("%-1s", "⬜");
				}
				if (columna < matriz[0].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
		System.out.println();
	}

	// Tendríamos conflicto en caso de encontrarnos en uno de los bordes y
	// tendríamos que subrecorrer la matriz
	public static int contarVivos(int[][] matriz, int filaActual, int columnaActual) {
		int contadorVecinosVivos = 0;
		int longFila = matriz.length;
		int longColumna = matriz[0].length;
		// asi recorreremos el alrededor de una celda
		for (int subfila = -1; subfila <= 1; subfila++) {
			for (int subcolumna = -1; subcolumna <= 1; subcolumna++) {
				int nuevaFila = filaActual + subfila;
				int nuevaColumna = columnaActual + subcolumna;
				// Comprobaremos que esta fila este dentro de los límites del tablero
				if (nuevaFila >= 0 && nuevaFila < longFila && nuevaColumna >= 0 && nuevaColumna < longColumna) {
					if (matriz[nuevaFila][nuevaColumna] == 1) {
						// si todo se cumple entonces sumaremos un vivo
						contadorVecinosVivos++;
					}
				}
			}

		}
		// restamos al contador nuestra posicion actual
		contadorVecinosVivos -= matriz[filaActual][columnaActual];
		return contadorVecinosVivos;
	}
	//perdon por lo cutre pero son las 3 am y queria irme a dormir
		public static int[][] rodearMatriz(int[][] matrizOriginal) {
			int liminf = matrizOriginal.length;
			int limSup = matrizOriginal[0].length;
	       int [][] matrizRodeada = new int[liminf + 17][limSup + 17];
	       for(int fila = 0; fila < matrizOriginal.length; fila++) {
				for(int col = 0; col < matrizOriginal[fila].length; col++) {
					matrizRodeada[fila+8][col+8] = matrizOriginal[fila][col];
				}
			}

	        return matrizRodeada;
	    }
	public static int[][] siguienteTurno(int[][] matriz, int filas, int columnas) {
		int[][] nuevoTurno = new int[filas][columnas];
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[0].length; columna++) {
				int vecinosVivos = contarVivos(matriz, fila, columna);
				//Escribimos el nuevo turno respetando el tablero anterior
				nuevoTurno[fila][columna] = matriz[fila][columna];
				
				//Reescribimos el nuevo turno segun las reglas ddel juego
				if (matriz[fila][columna] == 1) {
					if (vecinosVivos != 2 && vecinosVivos != 3) {
						nuevoTurno[fila][columna] = 0;
					}
				} else {
					if (vecinosVivos == 3) {
						nuevoTurno[fila][columna] = 1;
					}
				}
			}
		}

		return nuevoTurno;
	}
}
