import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] tekrar = new int[arr.length];
        int index = 0;
        int i, j;

        int[] kacKere = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            kacKere[i] = 1;
        }
        for (i = 0; i < arr.length; i++) {

            for (j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {

                    tekrar[index++] = arr[i];
                    kacKere[i]++;
                }

            }
            if (kacKere[i] >= 1) {
                if (tekrar[i] != 0) {
                    System.out.println(tekrar[i] + " sayisi " + kacKere[i] + " kadar tekrar etmiştir.");
                }
            }

        }
        System.out.println(Arrays.toString(tekrar));

    }

}
