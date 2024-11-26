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

/***
 * EQUIPO A
NOMBRE      | POSICI�N  | EDAD  | GOLES |
Jugador A1   | Posici�n1   | 34    | 2    |
Jugador A2   | Posici�n2   | 19    | 2    |
Jugador A3   | Posici�n3   | 34    | 1    |
Jugador A4   | Posici�n4   | 29    | 2    |
Jugador A5   | Posici�n5   | 35    | 2    |
Jugador A6   | Posici�n6   | 25    | 1    |
Jugador A7   | Posici�n7   | 37    | 0    |
Jugador A8   | Posici�n8   | 40    | 1    |
Jugador A9   | Posici�n9   | 22    | 0    |
Jugador A10   | Posici�n10   | 26    | 1    |
Jugador A11   | Posici�n11   | 22    | 1    |

EQUIPO B
NOMBRE      | POSICI�N  | EDAD  | GOLES |
Jugador B1   | Posici�n1   | 39    | 0    |
Jugador B2   | Posici�n2   | 26    | 2    |
Jugador B3   | Posici�n3   | 25    | 2    |
Jugador B4   | Posici�n4   | 37    | 0    |
Jugador B5   | Posici�n5   | 37    | 2    |
Jugador B6   | Posici�n6   | 23    | 1    |
Jugador B7   | Posici�n7   | 23    | 0    |
Jugador B8   | Posici�n8   | 33    | 2    |
Jugador B9   | Posici�n9   | 26    | 1    |
Jugador B10   | Posici�n10   | 19    | 2    |
Jugador B11   | Posici�n11   | 25    | 0    |

ESTAD�STICA DEL PARTIDO:
Goles Equipo A: 12
Goles Equipo B: 11
Equipo ganador: Equipo A.
 */