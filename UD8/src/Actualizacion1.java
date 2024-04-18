import java.sql.*;

public class Actualizacion1 {
    public static void main(String[] args) {
        String url1 = "jdbc:mysql://localhost/concesionario";
        String user = "concesionario";
        String password = "Concesionario";

        try {
            Connection cnx = DriverManager.getConnection(url1, user, password);
            Statement statement = cnx.createStatement();

            String sql = "update coche set vendido = 1 where matricula = 'ZA7777AB'";
            int filas = statement.executeUpdate(sql);

            System.out.printf("Se ha actualizado %d coches.",filas);

            statement.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}