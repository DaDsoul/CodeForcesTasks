import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        int k = in.nextInt();
        int l = in.nextInt();

        int[] a = new int[k];
        int number;

        for(int i = 0; i<k; i++){
            a[i] = in.nextInt();
            if (l % a[i] == 0) {
                number = l / a[i];
                if (number < min){
                    min = number;
                }
            }
        }

        System.out.println(min);


    }
}
