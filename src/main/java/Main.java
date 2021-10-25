import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int r = 1;
        int[] arr_price = new int[]{10, 15, 20};
        int[] arr_length = new int[]{11, 12, 13};
        for (int i = 0; i < arr_price.length; i++) {
            for (int j = 0; j < arr_length.length; j++)
                arr_price[i] += arr_length[j];

        }
        System.out.println(Arrays.toString(arr_price));
    }

}
