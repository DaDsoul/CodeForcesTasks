import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] someArray = new int[n];

        Set<Integer> someSet = new HashSet<Integer>();

        for(int i = 0; i<n;i++){
            someArray[i] = in.nextInt();
            someSet.add(someArray[i]);
        }

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.addAll(someSet);


        for(int j = someArray.length - 1; j>=0;j--) {

            if (newList.size() == 1) {
                break;
            }

            if (newList.contains(someArray[j])){
                newList.remove(newList.indexOf(someArray[j]));
            }
        }


        System.out.println(newList.get(0));
    }
}
