import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio {
    public static void main(String[] args) throws IOException {
        /*
        Suma total de los números positivos: 19
        Cantidad de números pares: 1
        Promedio de los números impares: 5.0
         */
        int sumaTotalPositivos = 0;
        int numero = 0;
        do {
            numero = LeerNumero();
            sumaTotalPositivos = SumaTotalPositivos(numero, sumaTotalPositivos);
        } while (numero != 0);

        System.out.println("Suma total de numeros positivos: " + sumaTotalPositivos);
        System.out.println("Se acabó");
    }

    public static int LeerNumero() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = Integer.parseInt(br.readLine());
        return numero;
    }

    public static int SumaTotalPositivos(int numero, int sumaTotal) {
        if (numero > 0) {
            sumaTotal += 1;
        }
        return sumaTotal;
    }
}
