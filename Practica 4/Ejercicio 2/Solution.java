import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Resultados {

    /*
     * Complete the 'cifrarMensaje' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING mensaje
     *  2. STRING alfabetoInterior
     *  3. INTEGER posicionInicial
     *  4. INTEGER intervaloRotacion
     */


    public static String cifrarMensaje(String mensaje, String alfabetoInterior, int posicionInicial, int intervaloRotacion) {
        StringBuilder resultado = new StringBuilder();
        int posActual = posicionInicial;
        int letrasProcesadas = 0;

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);

            if (c == ' ') {
                resultado.append(' ');
            } else {
                int idxExt = c - 'A';
                int idxInt = (idxExt - posActual) % 26;
                if (idxInt < 0) {
                    idxInt += 26;
                }
                
                resultado.append(alfabetoInterior.charAt(idxInt));
                letrasProcesadas++;

                if (letrasProcesadas % intervaloRotacion == 0) {
                    posActual = (posActual + 1) % 26;
                }
            }
        }

        return resultado.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String mensaje = bufferedReader.readLine();

        String alfabetoInterior = bufferedReader.readLine();

        int posicionInicial = Integer.parseInt(bufferedReader.readLine().trim());

        int intervaloRotacion = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Resultados.cifrarMensaje(mensaje, alfabetoInterior, posicionInicial, intervaloRotacion);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
