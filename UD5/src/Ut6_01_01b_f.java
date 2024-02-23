public class Ut6_01_01b_f {
    public static void main(String[] args) {
        String txt = "ProgramacionEntornos";
        String txtPartI = txt.substring(0, 12);
        String txtPartII = txt.substring(12);
        System.out.println(txtPartI);
        System.out.println(txtPartII);
        System.out.println(txtPartI.concat(txtPartII));
    }
}
