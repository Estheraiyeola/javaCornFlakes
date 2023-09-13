package mr_femi;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewSwap {
    public int[] swapMethod(int[] array, int firstIndex, int secondIndex){
        array[firstIndex]+= array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
        return array;
    }

    public boolean checkTextForIsogram(String text) {
        Pattern pattern = Pattern.compile("(?i)(?=.*a)(?=.*b)(?=.*c)...(?=.*z)");
        Pattern pattern2 = Pattern.compile("(?i)^[abcdefghijklmnopqrstuvwxyz]*m[abcdefghijklmnopqrstuvwxyz]*$");
        if (pattern2.matcher(text).find()  ) return true;
        else return false;
    }
}
