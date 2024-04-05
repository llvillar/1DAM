public class ConvertingBinaryToDecimal {
    public static void main(String args[]){
        String binaryNumber="00111";
        int decimalNumber=Integer.parseInt(binaryNumber,2);
        System.out.println(decimalNumber);
    }
}