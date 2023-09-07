import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{3, 7, 15, 6};

        int target = 9;
        int[] height = {1,8,6,2,5,4,8,3,7};
//        System.out.println(Arrays.toString(twoSum(nums, target)));
        int num = 1534236469;
        System.out.println(findMedianSortedArrays(nums, nums2));
        System.out.println(maxArea(height));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] newNums = new int[2];
        for (int index = 0; index < nums.length - 1; index++){
           if (nums[index] + nums[index + 1] == target){
               newNums[0] = index;
               newNums[1] = index + 1;
           }
        }
        return newNums;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newNum = new int[nums1.length + nums2.length];
        for (int index = 0; index < nums1.length; index+=1) {
            newNum[index] = nums1[index];
        }
        for (int index = 0; index < nums2.length; index+=1) {
            newNum[nums1.length + index] = nums2[index];
        }
        int temp = 0;
        for (int index = 0; index < newNum.length; index++) {
            for (int idx = 0; idx < newNum.length; idx++) {
                if (newNum[index] < newNum[idx]){
                    temp = newNum[idx];
                    newNum[idx] = newNum[index];
                    newNum[index] = temp;
                }
            }
        }
        int lengthOfNewNum = newNum.length;
        double median = 0;
        if (lengthOfNewNum % 2 == 1){
            median = newNum[(lengthOfNewNum + 1)/ 2 -1];
        }
        else {
            median = (double) (newNum[(lengthOfNewNum + 1) / 2 - 1] + newNum[lengthOfNewNum / 2]) / 2;
        }
        return median;
    }

    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        String newString = "";
//        for (int index = 0; index < length; index++) {
//            if (s.charAt(index) != newStr
//        }
        return 0;
    }
    public static int reverse(int x) {
//        String number = String.valueOf(x);
//        StringBuilder builder = new StringBuilder();
//        if (String.valueOf(number.charAt(0)).equals("-")){
//            builder.append(number, 1, number.length());
//            builder.append("-");
//        }
//        else {
//            builder.append(number);
//        }
//        builder.reverse();
//        return Integer.parseInt(builder.toString());

        String number = String.valueOf(x);
        int lengthOfString = number.length();
//        String result = "";
//        if (number.startsWith("-")) {
//            result = "-";
//            number = number.substring(1, lengthOfString-1);
//            lengthOfString = lengthOfString - 1;
//        }
        String[] array = new String[lengthOfString];
        for (int index = 0; index < lengthOfString - 1; index++) {
            array[index] = String.valueOf(number.charAt(index));
        }
//        for (String s : array) {
//            result += s;
//        }
//        assert result != null;
//        return Integer.parseInt(result);
        int idx = 0;
        int temp = 0;
        for (int index = 0; index < lengthOfString; index++) {
            if (array[index].startsWith("-")) idx = 1;
            for (; idx < lengthOfString / 2 + 1; idx++) {
                temp = Integer.parseInt(array[index]);
                array[index] = array[lengthOfString - idx];
                array[lengthOfString - idx] = String.valueOf(temp);
            }

        }
        System.out.println(Arrays.toString(array));
        return 0;
    }
    public static int maxArea(int[] height) {
        int lastIndex = 0;
        int unknownIndex = 0;
        for (int index = height.length- 1; index > 0; index++){
            for (int idx = 0; idx < height.length; idx++) {
                if (height[index] <= height[idx]){
                    lastIndex = index;
                    unknownIndex = idx;
                }
            }
        }
        return lastIndex * unknownIndex;
    }
}