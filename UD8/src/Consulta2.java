import java.sql.*;

public class Consulta2 {
    public static void main(String[] args) {
        String url1 = "jdbc:mysql://localhost/concesionario";
        String user = "concesionario";
        String password = "Concesionario";

        try {
            Connection cnx = DriverManager.getConnection(url1, user, password);
            Statement statement = cnx.createStatement();
            ResultSet rs = statement.executeQuery("select * from coche where marca = 'Ford' and not vendido");

            System.out.println("Coches de la marca ford.*************************");

            while(rs.next()){
                System.out.printf("%s [%s del %d] : %s€\n",rs.getString("matricula"),rs.getString("modelo"),rs.getInt("anio"),rs.getBigDecimal("precio").setScale(2).toPlainString());
            }
            System.out.println("**********************************************");


            rs = statement.executeQuery("select count(*) as total from coche where precio BETWEEN 20000 and 100000");

            rs.next();
            int total = rs.getInt(1);

            System.out.printf("Son %d la cantidad de coches que disponemos con un precio comprendido entre 20000 y 100000 euros.", total);



            statement.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}