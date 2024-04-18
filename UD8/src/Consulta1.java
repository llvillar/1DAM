import java.sql.*;

public class Consulta1 {
    public static void main(String[] args) {
        String url1 = "jdbc:mysql://localhost/concesionario";
        String user = "concesionario";
        String password = "Concesionario";

        try {
            Connection cnx = DriverManager.getConnection(url1, user, password);
            String sql = "select * from coche";
            Statement statement = cnx.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()){
                System.out.println("El matricula del coche es: "+rs.getString("matricula"));
                System.out.println("El marca del coche es: "+rs.getString("marca"));
                System.out.println("El modelo del coche es: "+rs.getString("modelo"));
                System.out.println("El año del coche es: "+rs.getDate("anio"));
                System.out.println("El precio del coche es: "+rs.getDouble("precio"));
                System.out.println("Vendido: "+rs.getInt("vendido"));
                System.out.println("*****************************************");
            }

            statement.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}