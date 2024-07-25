import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String input = "nar#end^ra";
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        int i = 0;
        while (i < chars.length && Character.isLetter(chars[i])) {
            i++;
        }
        String sorted = new String(chars, i, chars.length - i) + new String(chars, 0, i);
        System.out.println(sorted);
    }
}