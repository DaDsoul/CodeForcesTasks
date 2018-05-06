import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int result;
        int n = in.nextInt();
        int pos = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();

        if (l == 1 && r == n){
            result = 0;
        } else if (l == 1 && r<n){
            result = Math.abs(r - pos) + 1;
        } else if (r == n && l>1){
            result = Math.abs(pos - l) + 1;
        } else {
            if (Math.abs(pos - l) > Math.abs(r - pos)){
                result = Math.abs(r - pos) + r - l + 2;
            } else
                result = Math.abs(pos - l) + r - l + 2;
        }
        System.out.println(result);



    }
}
