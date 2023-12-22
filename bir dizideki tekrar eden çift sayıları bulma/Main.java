import java.util.Arrays;
public class Main {
    static boolean isfind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 4, 5, 5, 6, 2, 8, 9, 8,6,4};
        int[] karar = new int[list.length];
        int indeks = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j] ) {
                    if(list[i]%2==0) {
                        if (!isfind(karar, list[i])) {
                            karar[indeks++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int value : karar) {
            if (value != 0) {
                System.out.println(value);
            }


        }
    }
}