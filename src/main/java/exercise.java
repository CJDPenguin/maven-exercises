import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        System.out.printf("You entered %s\n",string);
         if (StringUtils.isNumeric(string)){
             System.out.printf("%s is numeric\n", string);
         } else {
             System.out.printf("%s is not numeric\n", string);
         }
        System.out.printf("Case flipped: %s\n",StringUtils.swapCase(string));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(string));
    }
}
