import java.util.Arrays;
import java.util.TreeSet;

public class Duplicate {

    public static String dup(int[] numbers) {
        TreeSet<Integer> result = new TreeSet<Integer>();
        //sort array now
        Arrays.sort(numbers);

        //iterate over the arrray
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] == numbers[i -1])
                result.add(numbers[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 12, 5, 4, 6};
        System.out.println(dup(array));


    }
}

/*


"   For Classes: " + iif(a5_getArgumentValue("Class1") = "%" .AND. a5_getArgumentValue("Class2") = "%" .AND. a5_getArgumentValue("Class3") = "%", " All Classes", "") + iif(a5_getArgumentValue("Class1")="A ", "A", "") +
iif(a5_getArgumentValue("Class2") = "B", "B ", "") + iif(a5_getArgumentValue("Class3")="C", "C ", "") + "
with Type: " +

iif(a5_getArgumentValue("Type1")="%" .AND. a5_getArgumentValue("Type2")="%" .AND.  a5_getArgumentValue("Type3")="%"  .AND. a5_getArgumentValue("Type4")="%", "All Types", "") + iif(a5_getArgumentValue("Type1")="SO", "SO ", "") + iif(a5_getArgumentValue("Type2")="IBT", "IBT ", "") +
iif(a5_getArgumentValue("Type3")="RR", "RR ", "") +
iif(a5_getArgumentValue("Type4")="SO", "RO ", "")


 */