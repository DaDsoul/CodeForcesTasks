import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        String[][] sum = new String[j][i];
        int wholeSum = 0;

        if (j == 0){
            System.out.println("0");
            return;
        }

        int[][] a = new int[j][3];

        for(int k = 0; k<j;k++){
            for(int m = 0; m<3;m++){
                a[k][m] = in.nextInt();
            }
        }

        for(int k = 0; k<j;k++){
           sum[a[k][0] - 1][a[k][1] - 1] = Integer.toString(a[k][2]);
        }


        for(int k = 0; k<j;k++){
            int number = 0;
            for(int m = 0; m<i;m++){
                if (sum[k][m] != null){
                    int num = 0;
                    number = Integer.parseInt(sum[k][m]);

                    if (m<j){

                        for(int f = 0; f<i;f++){
                            if (sum[m][f] != null) {
                                num += Integer.parseInt(sum[m][f]);
                            }
                        }
                        if (num > number){
                            wholeSum += num - number;
                        } else if (num < number){
                            wholeSum += number - num;
                        }

                    }

                }
            }

        }

       System.out.println(wholeSum);

    }
}
