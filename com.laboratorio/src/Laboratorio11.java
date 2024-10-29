import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laboratorio11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = Integer.parseInt(br.readLine());
        String[] arregloCadenas = new String[cantidadEstudiantes];

        for (int i = 0; i < arregloCadenas.length; i++) {
            System.out.print("Ingresa el nombre del estudiante:");
            String value = br.readLine();
            GuardarValor(arregloCadenas, i, value);

            System.out.println("Debes ingresar las 4 notas del estudiante");
            int[] notas = new int[4];
            for (int j = 0; j < notas.length; j++) {
                int nota = Integer.parseInt(br.readLine());
                notas[j] = nota;
            }
            ImprimirObjetos(notas);
        }

        // PASO 1: INGRESA LA CANTIDAD DE ESTUDIANTES
        // PASO 2: INGRESA LAS NOTAS DEL ESTUDIANTE
        // PASO 3: CALCULA EL PROMEDIO DEL ESTUDIANTE
        // PASO 3: CALCULA LA NOTA MAS ALTA
        // PASO 3: CALCULA LA NOTA MAS BAJA
        // PASO 3: CALCULA LA MEDIA
        ImprimirObjetos(arregloCadenas);
    }

    private static void GuardarValor(String[] arreglo, int position, String value) {
        if (arreglo.length <= position) return;
        arreglo[position] = value;
    }

    private static void ImprimirObjetos(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    private static void ImprimirObjetos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
