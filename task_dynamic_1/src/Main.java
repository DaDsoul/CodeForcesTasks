import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] fibNumbers = new int[n];

        for(int i = 0; i<n;i++){
            fibNumbers[i] = -1;
        }
        int number = finder(fibNumbers, n-1);
        System.out.println(number);
    }

    public static int finder(int[] a, int index){

        if (index == 0 || index == 1){
            return 1;
        }

        if (a[index] != -1){
            return a[index];
        }

        a[index] = finder(a, index-1) + finder(a, index - 2);
        return  a[index];
    }
}
