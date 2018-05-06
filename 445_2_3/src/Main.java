public class Main {

    public static void main(String[] args) {
       System.out.println(reverse(563847412));
    }

    public static int reverse(int x) {


        int index = 0;
        int reversed = 0;
        int m;
        boolean checker = false;

        if (x>0){
            m = x;
            checker = false;
        } else {
            m = -x;
            checker = true;
        }

        while(m > 0){

            reversed += m % 10;
            m/= 10;
            index ++;

            if (index == 10){
                if (checker == true){
                    reversed *= -1;
                }
                return reversed;
            }

            int ex = reversed;

            if (ex/100000000 >= 3 && index == 9){
                return  0;
            }

            reversed *= 10;

        }

        System.out.println(reversed);
        reversed /= 10;

        if (checker == true){
            reversed *= -1;
        }

        return reversed;
    }

}

