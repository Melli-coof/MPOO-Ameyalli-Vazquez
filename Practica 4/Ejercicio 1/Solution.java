import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Resultado {

    /*
     * Complete the 'detectarZonaAjuste' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY vagones as parameter.
     */

    
    public static int[] detectarZonaAjuste(int[] vagones) {
        int n = vagones.length;

        if (n <= 1) {
            return new int[]{-1, -1, 0};
        }

        int left = 0;
        while (left < n - 1 && vagones[left] <= vagones[left + 1]) {
            left++;
        }

        if (left == n - 1) {
            return new int[]{-1, -1, 0};
        }

        int right = n - 1;
        while (right > 0 && vagones[right] >= vagones[right - 1]) {
            right--;
        }

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            if (vagones[i] < minVal) {
                minVal = vagones[i];
            }
            if (vagones[i] > maxVal) {
                maxVal = vagones[i];
            }
        }

        while (left > 0 && vagones[left - 1] > minVal) {
            left--;
        }

        while (right < n - 1 && vagones[right + 1] < maxVal) {
            right++;
        }

        int longitud = right - left + 1;

        return new int[]{left, right, longitud};
    }

       

}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
                new BufferedWriter(
                        new FileWriter(System.getenv("OUTPUT_PATH"))
                );

        String linea = bufferedReader.readLine();

        String[] datos = linea.trim().split("\\s+");

        int[] vagones = new int[datos.length];

        for (int i = 0; i < datos.length; i++) {
            vagones[i] = Integer.parseInt(datos[i]);
        }

        int[] result = Resultado.detectarZonaAjuste(vagones);

        for (int i = 0; i < result.length; i++) {

            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}