public class Ut6_01_01b_b {
    public static void main(String[] args) {
        String txt = "Java";

        // Forma tradicional
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }

        // Con foreach
        System.out.println("-------------------------");
        for (char character : txt.toCharArray()) {
            System.out.println(character);
        }
    }
}
