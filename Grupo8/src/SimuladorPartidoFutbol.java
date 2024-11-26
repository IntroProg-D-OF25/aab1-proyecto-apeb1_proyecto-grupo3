import java.util.Random;

public class SimuladorPartidoFutbol {
    public static void main(String[] args) {
        Random random = new Random();

        int totalGolesA = 0;
        int totalGolesB = 0;

        System.out.println("EQUIPO A");
        System.out.println("NOMBRE      | POSICIÓN  | EDAD  | GOLES |");

        int contador = 1;
        while (contador <= 11) {
            String nombre = "Jugador A" + contador;
            int edad = 18 + random.nextInt(23);
            int goles = random.nextInt(3);
            totalGolesA = goles + contador;
            System.out.println(nombre + "   | Posición" + contador + "   | " + edad + "    | " + goles + "    |");
            contador++;
        }

        System.out.println("\nEQUIPO B");
        System.out.println("NOMBRE      | POSICIÓN  | EDAD  | GOLES |");

        contador = 1; // Reiniciamos el contador para el equipo B
        while (contador <= 11) {
            String nombre = "Jugador B" + contador;
            int edad = 18 + random.nextInt(23);
            int goles = random.nextInt(3);
            totalGolesB = goles + contador;
            System.out.println(nombre + "   | Posición" + contador + "   | " + edad + "    | " + goles + "    |");
            contador++;
        }

        System.out.println("\nESTADÍSTICA DEL PARTIDO:");
        System.out.println("Goles Equipo A: " + totalGolesA);
        System.out.println("Goles Equipo B: " + totalGolesB);

        if (totalGolesA > totalGolesB) {
            System.out.println("Equipo ganador: Equipo A.");
        } else if (totalGolesB > totalGolesA) {
            System.out.println("Equipo ganador: Equipo B.");
        } else {
            System.out.println("Empate. Se realizará una simulación de penales.");
            int penalesA = random.nextInt(5) + 1;
            int penalesB = random.nextInt(5) + 1;
            System.out.println("Penales Equipo A: " + penalesA);
            System.out.println("Penales Equipo B: " + penalesB);
            if (penalesA > penalesB) {
                System.out.println("Equipo ganador: Equipo A (por penales).");
            } else {
                System.out.println("Equipo ganador: Equipo B (por penales).");
            }
        }
    }
}