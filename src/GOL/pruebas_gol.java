package GOL;



public class pruebas_gol {

	public static void main(String[] args) {
		int[][] matrizPrueba = new int[5][5];
		matrizPrueba = simulacion4();
		escribirMatriz(matrizPrueba);
		matrizPrueba =  rodearMatriz(matrizPrueba);
		escribirMatriz(matrizPrueba);
		
	}

	public static void menu() {
		System.out.println("(0) para salir");
		System.out.println("(1) usar tablero predefinido");
		System.out.println("(2) generear tablero aleatorio");
	}

	public static int[][] turno0() {
		int[][] matrizInicial = { 
				{ 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 1, 0 }, 
				{ 0, 1, 0, 1, 0 },
				{ 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 }};

		return matrizInicial;

	}

	public static void escribirMatriz(int[][] matriz) {
		//se dividira en dos bucles que recorran la matríz y la vaya imprimiendo
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
				{ 0, 0, 1, 1, 1, 0, 0, 0 ,1 ,1, 1, 0, 0 }
				};
		return matrizInicial;

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
