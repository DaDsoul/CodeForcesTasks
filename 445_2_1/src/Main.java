import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] someArray = new int[6];

        boolean checker = false;

        for(int i = 0; i<6;i++){
            someArray[i] = in.nextInt();
        }

        int actualSum = 0;

        for (int i = 0; i<6;i++){
            actualSum += someArray[i];
        }

        int sum = 0;

        for(int i = 0; i<6;i++){
            for(int j = 0; j<6;j++){
                if (j!=i){
                    for(int k = 0; k<6;k++){
                        if (k!=j && k!=i){
                            sum = someArray[i] + someArray[j] + someArray[k];
                            if (sum == (actualSum/2)){
                                checker = true;
                                break;
                            } else checker = false;
                            sum = 0;
                        }
                    }
                }
            }
        }

        if (checker == false){
            System.out.println("NO");
        }else System.out.println("YES");


    }
}
