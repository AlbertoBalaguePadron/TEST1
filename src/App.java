import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 6;
        int suma = a + b;
        int resta = a - b;
        int multi = a * b;
        int divi = a / b;
        int valAbsulutor = Math.abs(a);
        double elevado = (Math.pow(a, b));

        Scanner leer = new Scanner(System.in);
        System.out.println(
                "Elige una opción: \n1: Sumar \n2: Restar \n3: Multiplicar \n4: Dividir \n5: Valor Absoluto \n6: Elevar exponente ");

        int operacion = leer.nextInt();

        switch (operacion) {

            case 1:
                System.out.println("La operacion la suma de: " + a + " + " + b + " es: " + suma);
            case 2:
                System.out.println("La operacion la resta de: " + a + " - " + b + " es: " + resta);
            case 3:
                System.out.println("La operacion la multiplicación de: " + a + " * " + b + " es: " + multi);
            case 4:
                System.out.println("La operacion la divición de: " + a + " / " + b + " es: " + divi);
            case 5:
                System.out.println("La operacion valor absoluto de: " + a + " es " + valAbsulutor);
            case 6:
                System.out
                        .println("La operacion elevar el exponente de: " + a + " " + b + " es " + elevado);
        }

        leer.close();

    }
}
