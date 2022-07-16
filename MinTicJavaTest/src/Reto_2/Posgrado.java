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

public class Posgrado extends Estudiante {

    public String modalidad;

    public Posgrado(String nombre, int edad, String programa, String tipo_etnia, String modalidad) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }

    public String toString() {
        String texto = "Estudiante Posgrado\n"
                + "Nombre: " + this.nombre + "\n"
                + "Edad: " + this.edad + " anios" + "\n"
                + "Programa: " + this.programa + "\n"
                + "Etnia: " + this.tipo_etnia + "\n"
                + "Modalidad: " + this.modalidad;
        return texto;
    }



}
