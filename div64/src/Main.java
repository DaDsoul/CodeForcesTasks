import javax.swing.event.InternalFrameEvent;
import java.awt.*;
import java.awt.List;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] a = new int[n][6];
        boolean checker = false;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<6;j++){
                a[i][j] = in.nextInt();
            }
        }

        if (n == 1){
            int[] b = a[0];
            Arrays.sort(b);

            for(int i = 0; i < b.length - 1; i++){
                if (b[i] == b[i+1] - 1){
                    checker = true;
                } else {
                    checker = false;
                    System.out.println(b[i]);
                    break;
                }
            }

            if (checker == true){
                System.out.println(b[b.length - 1]);
            }

        } else if (n == 2){

            int[] b = a[0];
            int[] c = a[1];
            Set<Integer> mySet = new HashSet<Integer>();

            for(int i = 0; i < b.length; i++){
                mySet.add(b[i]);
                mySet.add(c[i]);
            }

                int j = 0;
                for(j = 0; j< 6; j++) {
                    for (int k = 0; k < 6; k++) {
                        mySet.add(a[0][k] * 10 + a[1][j]);
                        mySet.add(a[1][j] * 10 + a[0][k]);
                    }
                }

                int number = 1;
                ArrayList<Integer> sortSet = new ArrayList<Integer>(mySet);
                Collections.sort(sortSet);
                for(int k = 0; k < sortSet.size(); k++){
                    if (sortSet.get(k) != 0){
                        if (sortSet.get(k) == number){
                            number ++;
                        } else {
                            System.out.println(number - 1);
                             break;
                        }
                    }
                }




        } else {

            int[] b = a[0];
            int[] c = a[1];
            Set<Integer> mySet = new HashSet<Integer>();

            for(int i = 0; i < b.length; i++){
                mySet.add(b[i]);
                mySet.add(c[i]);
            }

            int j = 0;
            for(j = 0; j< 6; j++) {
                for (int k = 0; k < 6; k++) {
                    mySet.add(a[0][k] * 10 + a[1][j]);
                    mySet.add(a[1][j] * 10 + a[0][k]);
                    mySet.add(a[0][k] * 10 + a[2][j]);
                    mySet.add(a[2][j] * 10 + a[0][k]);
                    mySet.add(a[1][k] * 10 + a[2][j]);
                    mySet.add(a[2][j] * 10 + a[1][k]);
                }
            }

            int number = 1;
            ArrayList<Integer> sortSet = new ArrayList<Integer>(mySet);
            Collections.sort(sortSet);
            for(int k = 0; k < sortSet.size(); k++){
                if (sortSet.get(k) != 0){
                    if (sortSet.get(k) == number){
                        number ++;
                    } else {
                        System.out.println(number - 1);
                        break;
                    }
                }
            }


        }



    }
}
