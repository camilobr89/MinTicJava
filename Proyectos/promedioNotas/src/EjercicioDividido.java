import java.util.Scanner;
public class EjercicioDividido {
    //declaro e inicializo un objeto tipo scanner para usar en todo el programa
    public static Scanner scan= new Scanner (System.in);
    //declaro la variable numero de estudiantes
    public static int numEst;
    //declaro un vector que contendra las notas finales de los estudiantes
    public static double notasFinales[];

    public static void main(String[] args) {
        //metodo principal
        System.out.println("*****PROMEDIO DE NOTAS ESTUDIANTE*****");
        //pedimos numero de estudiantes
        System.out.println("Numero de estudiantes: ");
        numEst=scan.nextInt();
        double acumulado=0, promedioGlobal;
        //inicializo array de notas finales de estudiantes con el tamano de el numero de estudiantes que ingreso por teclado
        notasFinales=new double[numEst];
        //
        for (int i = 0; i < numEst; i++) {
            //en este ciclo for, primero llama a la funcion pedir datos, ya que se necesita ejecutar
            //antes de porder calcular la nota final de cada alumno, el valor de la nota final es asignado
            //como elemento del vector global "notas finales" de los estudiantes
            notasFinales[i]=calcularNotaFinal(pedirDatos());
            System.out.println("Nota final del estudiante "+(i+1)+": "+notasFinales[i]);
            //sumo la nota final al acumulado
            acumulado+=notasFinales[i];
        }
        //una vez termina de pedir los datos y calcular las notas finales, halla el promedio total del curso
        promedioGlobal=acumulado/numEst;
        imprimir(promedioGlobal);
    }
    public static double[] pedirDatos(){
        //este es un  metodo con retorno, sin parametros
        //crea un array local, que contiene las notas de un estudiante
        double notas[]=new double[8];
        //pide por teclado las notas y las guarda en el vector anteriormente creado
        System.out.println("Ingresa el numero de cedula: ");
        notas[0]=scan.nextInt();
        System.out.println("\nNota Reto 1: ");
        notas[1]=scan.nextDouble();
        System.out.println("Nota Reto 2: ");
        notas[2]=scan.nextDouble();
        System.out.println("Nota Reto 3: ");
        notas[3]=scan.nextDouble();
        System.out.println("Nota Reto 4: ");
        notas[4]=scan.nextDouble();
        System.out.println("Nota Reto 5: ");
        notas[5]=scan.nextDouble();
        System.out.println("Nota Ingles: ");
        notas[6]=scan.nextDouble();
        System.out.println("Nota Habilidades: ");
        notas[7]=scan.nextDouble();
        //retorna el vector
        return notas;
    }
    public static double calcularNotaFinal(double[] notas){
        //metodo recibe el vector y retorna la nota final del alumno
        double notaFinal;
        //calcula la nota final
        notaFinal=((notas[0]*0.1)+(notas[1]*0.1)+(notas[2]*0.2)+(notas[3]*0.2)+(notas[4]*0.2)+(notas[5]*0.1)+(notas[6]*0.1));
        return notaFinal;
    }
    public static void imprimir(double promedioGlobal){
        if(numEst==1){
            System.out.println("\nPromedio del estudiante: "+promedioGlobal);
        } else{
            System.out.println("\nPromedio de los estudiantes: "+promedioGlobal);
        }
    }

    public static double[] estadistica(double[] notas){
        double[] estadistica=new double[3];
        estadistica[0]=notas[0];
        estadistica[1]=notas[1];
        estadistica[2]=notas[2];
        return estadistica;
    }

}

