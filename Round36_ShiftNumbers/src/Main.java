import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char[] number = a.toCharArray();
        String result = "A";

        if (b.length() > a.length()){
            Arrays.sort(number);
            for(int i = a.length() - 1; i >= 0; i--){
                System.out.print(number[i]);
            }
        } else {

        }
    }


    public void finder(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){

        for(int i = a.size(); i>0;i--){
            if (Character.getNumericValue(a.indexOf(i)) < Character.getNumericValue(b.indexOf(b.size()))){
                a.remove(i);
                b.remove(b.size());
                c.add(0,a.get(i));

                if (c.size() > 1){
                    c.add(c.size(), a.get(i));
                }

                if (a.size() == 1){
                    System.out.println(c.toString());
                    break;
                }

                finder(a,b,c);
                break;
            }
        }

    }
}
