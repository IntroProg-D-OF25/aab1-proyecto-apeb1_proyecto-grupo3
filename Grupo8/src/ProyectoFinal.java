
/***
 * Juan Guerreo
 */
import java.util.Scanner;
public class ProyectoFinal {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numEstudiantes = 9;
        int curso1 = 0, curso2 = 0, curso3 = 0;
        int nAprobadoC1 = 0, nFalloC1 = 0;
        int nAprobadoC2 = 0, nFalloC2 = 0;
        int nAprobadoC3 = 0, nFalloC3 = 0;

        for (int i = 0; i < numEstudiantes; i++) {
   
            System.out.println("Ingrese el ID del estudiante (solo números): ");
            int id = tcl.nextInt();
            tcl.nextLine(); 

            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = tcl.nextLine();

            System.out.println("Ingrese el curso (1, 2 o 3): ");
            int curso = tcl.nextInt();

            System.out.println("Ingrese la nota de Actividad Académica (0-3.5): ");
            float acd = tcl.nextFloat();

            System.out.println("Ingrese la nota de Aprendizaje Práctico (0-3.5): ");
            float ape = tcl.nextFloat();

            System.out.println("Ingrese la nota de Evaluación Académica (0-3): ");
            float aa = tcl.nextFloat();
            
            float promedio = acd + ape + aa;

            if (curso == 1) {
                curso1++;
                if (promedio >= 7) {
                    nAprobadoC1++;
                } else {
                    nFalloC1++;
                }
            } else if (curso == 2) {
                curso2++;
                if (promedio >= 7) {
                    nAprobadoC2++;
                } else {
                    nFalloC2++;
                }
            } else if (curso == 3) {
                curso3++;
                if (promedio >= 7) {
                    nAprobadoC3++;
                } else {
                    nFalloC3++;
                }
            }
            System.out.println("-------------------");
            System.out.println("Nombre: " + nombre);
            System.out.println("ID: " + id);
            System.out.println("Curso: " + curso);
            System.out.println("Promedio: " + promedio);
            System.out.println("-------------------");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Curso 1 - Total estudiantes: " + curso1 + " | Aprobados: " + nAprobadoC1 + " | Reprobados: " + nFalloC1);
        System.out.println("Curso 2 - Total estudiantes: " + curso2 + " | Aprobados: " + nAprobadoC2 + " | Reprobados: " + nFalloC2);
        System.out.println("Curso 3 - Total estudiantes: " + curso3 + " | Aprobados: " + nAprobadoC3 + " | Reprobados: " + nFalloC3);
    }
}

/***
 * Ingrese el ID del estudiante (solo n�meros): 
2
Ingrese el nombre del estudiante: 
juan
Ingrese el curso (1, 2 o 3): 
2
Ingrese la nota de Actividad Acad�mica (0-3.5): 
4
Ingrese la nota de Aprendizaje Pr�ctico (0-3.5): 
2
Ingrese la nota de Evaluaci�n Acad�mica (0-3): 
2
-------------------
Nombre: juan
ID: 2
Curso: 2
Promedio: 8.0
-------------------
Ingrese el ID del estudiante (solo n�meros): 
9
Ingrese el nombre del estudiante: 
4
Ingrese el curso (1, 2 o 3): 

2
Ingrese la nota de Actividad Acad�mica (0-3.5): 
6
Ingrese la nota de Aprendizaje Pr�ctico (0-3.5): 
6
Ingrese la nota de Evaluaci�n Acad�mica (0-3): 
5
-------------------
Nombre: 4
ID: 9
Curso: 2
Promedio: 17.0
-------------------
Ingrese el ID del estudiante (solo n�meros): 
9
Ingrese el nombre del estudiante: 
pepe
Ingrese el curso (1, 2 o 3): 
2
Ingrese la nota de Actividad Acad�mica (0-3.5): 
6
Ingrese la nota de Aprendizaje Pr�ctico (0-3.5): 
7
Ingrese la nota de Evaluaci�n Acad�mica (0-3): 
8
-------------------
Nombre: pepe
ID: 9
Curso: 2
Promedio: 21.0
-------------------
 */