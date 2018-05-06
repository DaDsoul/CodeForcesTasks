import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static Integer[] sortMe(Integer[] one, Integer[] two){

        Integer[] myResult = new Integer[one.length + two.length];

        if (one.length == 0 && two.length != 0){

            Integer[] result = new Integer[two.length];

            for(int i = 0; i< two.length; i++){
                result[i] = two[i];
            }

            return result;

        } else if (one.length != 0 && two.length == 0){

            Integer[] result = new Integer[one.length];

            for(int i = 0; i< one.length; i++){
                result[i] = one[i];
            }

            return result;

        } else {

            int k = 0;

            if (two.length >= one.length){

                for(int i = 0; i< one.length; i++){

                    while(one[i] >= two[k] || one[i] < two[k]){
                        if (one[i] >= two[k]){
                             myResult[i] = two[k];
                        }else {
                            myResult[i] = one[i];
                        }

                        k++;
                    }


                }

            } else {


            }
        }

        return myResult;

    }

    public static void main(String[] args) {

        Integer[] oneArray = {1,2,3,4,5,6};
        Integer[] anotherArray = {3,4,5,6,10,12};

        Integer[] result = sortMe(oneArray,anotherArray);
        for (int i = 0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
