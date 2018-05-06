import java.util.Scanner;

public class Main {

    public static boolean checker(int[][] ar){

        boolean checker = true;
        int counter = 0;

        for (int i = 0; i < ar.length; i++){
            if (ar[i][0]<0){
                counter ++;
            }
        }

        if (counter == 1 || counter == 0){
            checker = true;
        } else
            checker = false;

        return checker;
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] someArray = new int[n][2];

        for (int i = 0; i<n;i++){
            for (int j = 0; j<2;j++){
                someArray[i][j] = in.nextInt();
            }
        }

        boolean check = checker(someArray);
        if (check){
            System.out.println("Yes");
        }else
            System.out.println("No");


   }
}
