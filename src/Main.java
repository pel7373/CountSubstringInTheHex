import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String DELIMITER = "=====================";
    public static void main(String[] args) {
        Main main = new Main();
        main.countSubstringInTheHex(6817);
        main.countSubstringInTheHex(447355553);
        main.countSubstringInTheHex(176845);
        main.countSubstringInTheHex(4660);
        main.countSubstringInTheHex(240589);
        main.countSubstringInTheHex(160);
    }

    private void countSubstringInTheHex(int number) {
        String stringHex = Integer.toHexString(number).toUpperCase();
        Pattern pattern = Pattern.compile("\\d[A-F]+\\d");
        Matcher matcher = pattern.matcher(stringHex);
        int index = 0;
        int count = 0;
        int maxLength = 0;

        System.out.println(DELIMITER);
        System.out.printf("The decimal number %d is processed and has been converted in hex format: %s\n", number, stringHex);

        while(matcher.find(index)) {
            count++;
            int length = matcher.group().length() - 2;
            System.out.printf("The group #%d is %s, length %d\n", count, matcher.group().substring(1, length + 1), length);
            maxLength = Math.max(maxLength, matcher.group().length() - 2);
            index = matcher.end() - 1;
        }

        if(count == 1) {
            System.out.printf("One match was found with length of substring %d\n", maxLength);
        } else if(count > 1) {
            System.out.printf("%d matches were found, of which the maximum length was %d\n", count, maxLength);
        } else {
            System.out.println("Sorry, no matches were found");
        }
    }
}