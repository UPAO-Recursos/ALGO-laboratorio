import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido");
        // Leer un numero positivo
        int numero = LeerNumero();
        // Calcular factorial
        int resultado = Factorial(numero);
        System.out.println(numero + " - " + resultado);
        // Imprimir resultado
    }

    public static int LeerNumero() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = Integer.parseInt(br.readLine());
        return Math.abs(numero);
    }

    public static int Factorial(int numero) {
        int valor = 1;
        for (int i = numero; i > 0; i--) {
            valor *= i; // valor = valor * i
        }
        return valor;
    }
}
