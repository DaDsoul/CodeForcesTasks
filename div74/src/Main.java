import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String element = in.next();
        int counter = 0;
        boolean checker = false;
        int number = 0;

        for(int i = 0; i<element.length();i++){

            if (element.charAt(i) == '1'){
                number = i;
                checker = true;
                break;
            }

        }

        if (checker == true){
            for(int j = number; j<element.length();j++){

                if (element.charAt(j) == '0'){
                counter++;
                }
            }

            if (counter >= 6){
                System.out.println("yes");
            } else System.out.println("no");

        } else {
            System.out.println("no");
        }

    }
}
