/*Procesar Comandos
En la clase Registro, se debe definir la función procesarComandos que realiza las siguientes operaciones:
Agregar estudiante: Opción 1
Se puede añadir un estudiante de pregrado con el siguiente comando:
1&Pregrado&nombreEstudiante&edad&programa&etnia&creditosAprobados

Ejemplo
1&Pregrado&Luis Parra&21&Medicina&Raizal&15
Se puede añadir un estudiante de posgrado con el siguiente comando:
1&Posgrado&nombreEstudiante&edad&programa&etnia&modalidad
 Ejemplo:
1&Posgrado&María Sarmiento&25&Maestría en economía&Ninguna&Investigación

Listar ítems del registro: Opción 2
Se debe mostrar la frase: “***Listado de estudiantes***” Seguida por los estudiantes en el orden en el que fueron agregados.
Si se trata de un estudiante de pregrado se mostrará así. Recuerde que \t implica correr el ítem unos espacios a la derecha:
\tEstudiante Pregrado
\tNombre: Luis Parra
\tEdad: 21 anios
\tPrograma: Medicina
\tEtnia: Raizal
\tCreditos aprobados: 15
Si se trata de un estudiante de posgrado se mostrará así:
\tEstudiante Posgrado
\tNombre: María Sarmiento
\tEdad: 25 anios
\tPrograma: Maestría en economía
\tEtnia: Ninguna
\tModalidad: Investigación

Salir: Opción 3
Esta opción genera que la aplicación termine su ejecución.

*/


package Reto_2;

import java.util.Scanner;
import java.util.ArrayList;

public class Registro {
    public ArrayList<Estudiante> estudiantes;

    public Registro() {
        this.estudiantes = new ArrayList<>();
    }

    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.procesarComando();
    }

    public void procesarComando() {
        Scanner teclado = new Scanner(System.in);

        while(true) {

            String comando = teclado.nextLine();
            String[] sep = comando.split("&");

            String opcion = sep[0];


            if (opcion.equals("1")) {
                String tipo = sep[1];
                String nombre = sep[2];
                int edad = Integer.parseInt(sep[3]);
                String programa = sep[4];
                String etnia = sep[5];
                String extra = sep[6];
                if (tipo.toUpperCase().equals("PREGRADO")) {
                    Pregrado pregrado = new Pregrado(nombre, edad, programa, etnia, Integer.parseInt(extra));
                    agregarEstudiante(pregrado);
                } else if (tipo.toUpperCase().equals("POSGRADO")) {
                    Posgrado posgrado = new Posgrado(nombre, edad, programa, etnia, extra);
                    agregarEstudiante(posgrado);
                }

            } else if (opcion.equals("2")) {
                this.listarEstudiantes();
            } else if (opcion.equals("3")) {
                System.exit(0);
            }
        }

        }

        public void agregarEstudiante(Estudiante estudiante) {
            this.estudiantes.add(estudiante);
        }

        public void listarEstudiantes() {
            System.out.println("***Listado de estudiantes***");
            for (Estudiante estudiante : this.estudiantes) {
                System.out.println(estudiante.toString());
            }
        }

}


