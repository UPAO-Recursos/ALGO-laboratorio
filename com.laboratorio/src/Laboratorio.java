import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laboratorio {
    public static void main(String[] args) throws IOException {
        // TODO: Leer un numero entero
        int numero = LeerNumero();

        // TODO: multiplicarlo por 5
        int resultado = Multiplicacion(numero, 5);

        // TODO: Mostrar el mensaje: "Numero multiplicado por 5 es: {0}"
        System.out.println("Numero multiplicado por 5 es: " + resultado);
    }

    public static int LeerNumero() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    private static int Multiplicacion(int numero, int multiplicacion) {
        return numero * multiplicacion;
    }
}
