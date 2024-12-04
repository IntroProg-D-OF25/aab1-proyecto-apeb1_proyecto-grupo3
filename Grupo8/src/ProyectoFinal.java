
import java.util.Scanner;
public class ProyectoFinal {
    public static void main(String[] args) {
        float acd, ape, aa, promedio;
        int curso, id, NumEstudiante = 9;
        String nombre, 
        Scanner tcl = new Scanner(System.in);
        int curso1 = 0, curso2 = 0, curso3 = 0, nAprobadoC1 = 0, nFalloc1 = 0;
        
        
        for (int i = 0; i < NumEstudiante; i++) {
            id  = 1000000000 + tcl.nextInt(NumEstudiante);
            curso1 = 1 + tcl.nextInt(3);
            acd = tcl.nextFloat(3.5F);
            ape = tcl.nextFloat(3.5F);
            aa = tcl.nextFloat(3);
            promedio = acd + ape + aa;
            
            if (curso == 1){
                curso1++;
                System.out.println("-------------------");
                System.out.println("Nombre: " + nombre);
                System.out.println("Id: " + Id);
                //System.out.println("curso: " + curso);
                //System.out.println("acd: " + acd);
                //System.out.println("ape: " + ape);
                //System.out.println("aa: " + aa);
                System.out.println("promedio: " + promedio);
                
                if (promedio >= 7)
                    nAprobadoC1++;
                else {
                    nFalloc1++;
                }
                 
            } else if (curso == 2) {
                
                curso2++;
                if (promedio >= 7)
                    nAprobadoC2++;
                else {
                    nFalloc2++;
                }
                
            } else {
                curso3++;
                nAprobadoc3++;
                else {
                        nFalloc3++;
                        }
            }
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Total de estudiantes en el curso 1: " + curso1 + "|" + nFalloc1);
        System.out.println("Total de estudiantes en el curso 2: " + curso2 + "|" + nFalloc2);
        System.out.println("Total de estudiantes en el curso 3: " + curso3 + "|" + nFalloc3);
                
                
    }

    
}