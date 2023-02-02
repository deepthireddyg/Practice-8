import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerArrayUtils {

    public static Integer[] add(Integer[]integerArray,Integer valueToBeAdded){
        List<Integer> ls = new ArrayList<>(Arrays.asList(integerArray));
        ls.add(valueToBeAdded);
        return ls.toArray(new Integer[0]);
    }

    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray){
        for(int i=0;i<integerArray.length;i++){
            if(integerArray[i]%2==0){
                integerArray[i]=integerArray[i]+1;
            }else{
                integerArray[i]=integerArray[i]-1;
            }
        }
        return integerArray;
    }
    public static Boolean startsWithCapitalLetter(String string){
        if(Character.isUpperCase(string.charAt(0))){
            return true;
        }
        return false;
    }
}
