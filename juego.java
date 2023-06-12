import java.util.Scanner;

public class juego {
    public static void main(String[] args) {
        // Preguntas y respuestas
        String pregunta1 = "¿En qué año se descubrió América?";
        String[] opciones1 = {"A)1492", "B)1776", "C)1812", "D)1950"};
        int respuestaCorrecta1 = 1;

        String pregunta2 = "¿Cuál es el río más largo del mundo?";
        String[] opciones2 = {"A)Amazonas", "B)Nilo", "C)Yangtsé", "D)Misisipi"};
        int respuestaCorrecta2 = 2;

        // Puntuación
        int puntuacion = 0;

        // Mostrar primera pregunta
        System.out.println(pregunta1);
        for (int i = 0; i < opciones1.length; i++) {
            System.out.println((i + 1) + ". " + opciones1[i]);
        }

        // Leer respuesta del usuario para la primera pregunta
        Scanner scanner = new Scanner(System.in);
        int respuesta1 = scanner.nextInt();

        // Comprobar respuesta de la primera pregunta
        if (respuesta1 == respuestaCorrecta1) {
            System.out.println("¡Respuesta correcta!");
            puntuacion++;
        } else {
            System.out.println("Respuesta incorrecta.");
        }

        // Mostrar segunda pregunta
        System.out.println(pregunta2);
        for (int i = 0; i < opciones2.length; i++) {
            System.out.println((i + 1) + ". " + opciones2[i]);
        }

        // Leer respuesta del usuario para la segunda pregunta
        int respuesta2 = scanner.nextInt();

        // Comprobar respuesta de la segunda pregunta
        if (respuesta2 == respuestaCorrecta2) {
            System.out.println("¡Respuesta correcta!");
            puntuacion++;
        } else {
            System.out.println("Respuesta incorrecta.");
        }

        // Mostrar puntuación final
        System.out.println("Puntuación final: " + puntuacion + " de 2.");
    }
}
