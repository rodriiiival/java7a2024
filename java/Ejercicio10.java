public class Ejercicio10{
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 20;
        int variable3 = 15;

        int mayor = variable1;

        if (variable2 > mayor && variable2 > variable3) {
            mayor = variable2;
        }

        if (variable3 > mayor && variable3 > variable2) {
            mayor = variable3;
        }

        System.out.println("La mayor variable es: " + mayor);
    }
}
