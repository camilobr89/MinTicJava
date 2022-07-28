
import java.sql.*;

public class Main {


    private Connection conexion;
    private Statement consultas;
    private ResultSet resultado;

    public Main() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/reto5", "root", "Regedit-1");
            consultas = conexion.createStatement();
            if (conexion != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos");
        }
    }

    public String consultar(){
        String salida = "";
        String consulta = "SELECT * FROM persona";

        try {
            resultado = consultas.executeQuery(consulta);
            while (resultado.next()) {
                salida += resultado.getString(1) + "\t";
                salida += resultado.getString(2) + "\t";
                salida += resultado.getString(3) + "\t";
                salida += resultado.getString(4) + "\t\n";
            }
        } catch (Exception e) {
            System.err.println("Error al consultar" + e.getMessage());
        }



        return salida;
    }

    public  void insertar(String cedula, String nombre, String apellido, String fechaNacimiento){
        String consulta = "INSERT INTO persona VALUES ('" + cedula + "', '" + nombre + "', '" + apellido + "', '" + fechaNacimiento + "')";

        try {
            consultas.executeUpdate(consulta);
        } catch (Exception e) {
            System.err.println("Error al insertar" + e.getMessage());
        }

    }


    public void eliminar(String cedula){
        String consulta = "DELETE FROM persona WHERE cedula = '" + cedula + "'";

        try {
            consultas.executeUpdate(consulta);
        } catch (Exception e) {
            System.err.println("Error al eliminar" + e.getMessage());
        }

    }

    public void actualizar(String cedula, String nombre, String apellidos, String fechaNacimiento){
        String consulta = "UPDATE persona SET nombre = '" + nombre + "', apellidos = '" + apellidos + "', fechaNacimiento = '" + fechaNacimiento + "' WHERE cedula = '" + cedula + "'";

        try {
            consultas.executeUpdate(consulta);
        } catch (Exception e) {
            System.err.println("Error al actualizar" + e.getMessage());
        }

    }



    public static void main(String[] args) {

        Main cbd = new Main();

        cbd.insertar("669898448", "Sara", "Suan", "1991-09-28");

        cbd.eliminar("669898448");

        cbd.actualizar("6565658", "Alex", "Olarte", "1991-09-28");

        System.out.println(cbd.consultar());






    }
}
