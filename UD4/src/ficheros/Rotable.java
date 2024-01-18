package ficheros;

 public interface Rotable {
     int VERTICAL_A_APAISADO = 90;
     int APAISADO_A_VERTICAL = -90;
      void rotarSentidoAgujas();
      void rotarSentidoContrarioAgujas();

      default void rotar360grados(){
          System.out.println("Se queda igual");
      }

      static double radianesAGrados(double radianes){
          return radianes * 180.0 /Math.PI;
      }

     default String describir() {
         return "Rotable";
     }

}
