import java.sql.*;
import java.util.Scanner;

public class ConsultaParametrizada1 {
    public static void main(String[] args) {
        String url1 = "jdbc:mysql://localhost/concesionario";
        String user = "concesionario";
        String password = "Concesionario";

        Scanner sc=new Scanner(System.in);
        String marca;
        int anio;
        System.out.print("Marca:");
        marca=sc.next();
        System.out.print("Año:");
        anio=sc.nextInt();

        try {
            Connection cnx = DriverManager.getConnection(url1, user, password);
            String sql ="select * from coche where marca = ? and anio = ? and not vendido";
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, marca);
            ps.setInt(2, anio);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.printf("%s [%s del %d] : %s€\n",rs.getString("matricula"),rs.getString("modelo"),rs.getInt("anio"),rs.getBigDecimal("precio").setScale(2).toPlainString());
            }
            ps.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}