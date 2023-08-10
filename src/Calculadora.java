public class Calculadora {
    public static void main(String[] args) {
        // Definición de 2 variables enteras:
        int numero1 = 11;
        int numero2 = 5;

        // Operación suma:
        int suma = numero1 + numero2;
        System.out.println("La suma es " + suma);

        // Operación resta:
        int resta = numero1 - numero2;
        System.out.println("La resta es " + resta);

        // Operación multiplicación:
        int multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación es " + multiplicacion);

        // Operación división:
        /* Es necesario que uno de los números que intervienen en la división sea double
         para que el resultado decimal sea aproximado correctamente. **/
        double division = (double)numero1 / numero2;
        System.out.println("La división es " + division);
    }
}
