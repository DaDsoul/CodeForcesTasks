import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int indexR = 0;
        double sumL = 0;
        double sumR = 0;

        ArrayList<String> word = new ArrayList<String>();

        String elem = in.next();
        int i = elem.length();

        for(int k = 0; k<elem.length();k++){
            word.add(k, Character.toString(elem.charAt(k)));
        }

        for(int j = 0; j<i;j++){
            if (word.get(j).equals("^")){
                indexR = j;
                break;
            }
        }

        for(int k = 0; k<indexR;k++){
            if (!word.get(k).equals("=")){
                sumL += (indexR - k)*Integer.parseInt(word.get(k));
            }
        }

        for(int k = indexR + 1; k<i;k++){
            if (!word.get(k).equals("=")){
                sumR += (k - indexR)*Integer.parseInt(word.get(k));
            }
        }


        if (sumL > sumR){
            System.out.println("left");
        } else if (sumL<sumR){
            System.out.println("right");
        } else
            System.out.println("balance");

    }
}
