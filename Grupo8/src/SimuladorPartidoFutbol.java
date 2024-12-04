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
            totalGolesA += goles;
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
            totalGolesB += goles;
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

/***EQUIPO A
NOMBRE      | POSICI�N  | EDAD  | GOLES |
Jugador A1   | Posici�n1   | 21    | 1    |
Jugador A2   | Posici�n2   | 36    | 1    |
Jugador A3   | Posici�n3   | 19    | 2    |
Jugador A4   | Posici�n4   | 32    | 0    |
Jugador A5   | Posici�n5   | 31    | 1    |
Jugador A6   | Posici�n6   | 24    | 2    |
Jugador A7   | Posici�n7   | 26    | 0    |
Jugador A8   | Posici�n8   | 20    | 1    |
Jugador A9   | Posici�n9   | 38    | 2    |
Jugador A10   | Posici�n10   | 38    | 0    |
Jugador A11   | Posici�n11   | 36    | 0    |

EQUIPO B
NOMBRE      | POSICI�N  | EDAD  | GOLES |
Jugador B1   | Posici�n1   | 28    | 0    |
Jugador B2   | Posici�n2   | 21    | 0    |
Jugador B3   | Posici�n3   | 33    | 2    |
Jugador B4   | Posici�n4   | 26    | 0    |
Jugador B5   | Posici�n5   | 18    | 0    |
Jugador B6   | Posici�n6   | 33    | 2    |
Jugador B7   | Posici�n7   | 25    | 1    |
Jugador B8   | Posici�n8   | 38    | 2    |
Jugador B9   | Posici�n9   | 20    | 0    |
Jugador B10   | Posici�n10   | 26    | 1    |
Jugador B11   | Posici�n11   | 40    | 1    |

ESTAD�STICA DEL PARTIDO:
Goles Equipo A: 10
Goles Equipo B: 9
Equipo ganador: Equipo A.
 */