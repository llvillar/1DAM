import java.sql.*;
import java.util.Scanner;

public class ConsultaParametrizada2 {
    public static void main(String[] args) throws SQLException {
        String url1 = "jdbc:mysql://localhost/concesionario";
        String user = "concesionario";
        String password = "Concesionario";

        Scanner sc=new Scanner(System.in);
        System.out.print("Matricula:");
        String matricula = sc.next();
        System.out.print("Descuento:");
        int descuento = sc.nextInt();

        Connection cnx = null;
        PreparedStatement ps = null;
        try {
            cnx = DriverManager.getConnection(url1, user, password);
            String sql ="update coche set precio = precio * ? where matricula = ?";
            ps = cnx.prepareStatement(sql);

            double des = (double) (100 - descuento)/100;

            ps.setDouble(1, des);
            ps.setString(2, matricula);

            int filas = ps.executeUpdate();

            System.out.println(filas);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
            cnx.close();
        }
    }
}