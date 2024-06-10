# Game of Life

Este es un proyecto de recreación del famoso juego "Game of Life" creado por John Conway en 1970. El juego es un ejemplo clásico de autómata celular y simula la evolución de células en una cuadrícula bidimensional basada en reglas simples.
Con ciertas limitaciones, las cuales son las siguientes:
  - Tablero 30 x 30
  - No hay posibilidad de crear tus propias formas

## Descripción

El "Game of Life" se juega en una cuadrícula rectangular de células, cada una de las cuales puede estar en uno de dos estados posibles: viva o muerta. La evolución del juego se determina por el estado inicial de las células y las siguientes reglas:

1. Cualquier célula viva con menos de dos vecinos vivos muere, como si fuera causada por la subpoblación.
2. Cualquier célula viva con dos o tres vecinos vivos vive en la siguiente generación.
3. Cualquier célula viva con más de tres vecinos vivos muere, como si fuera causada por la sobrepoblación.
4. Cualquier célula muerta con exactamente tres vecinos vivos se convierte en una célula viva, como si fuera por reproducción.

Estas reglas se aplican iterativamente para crear nuevas generaciones de células.

## Funcionalidades

- Representación visual del juego en una interfaz gráfica.
- Personalización de la configuración inicial del tablero.
- Ejecución paso a paso o continua de las generaciones.
- Posibilidad de pausar y reiniciar el juego en cualquier momento.
- Estadísticas en tiempo real sobre el estado de la población.

## Uso
- Clonar el repositorio y abrirlo en la máquina local
- Abrir el archivo principal en un ide de java
