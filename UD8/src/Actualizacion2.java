import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Actualizacion2 {
    public static void main(String[] args) {
        String url1 = "jdbc:mysql://localhost/concesionario";
        String user = "concesionario";
        String password = "Concesionario";

        try {
            Connection cnx = DriverManager.getConnection(url1, user, password);
            Statement statement = cnx.createStatement();

            String sql = "update coche set precio = precio*1.05 where anio < 1965";
            int filas = statement.executeUpdate(sql);

            System.out.printf("Se ha actualizado %d coches.",filas);

            statement.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}