package pt3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMethod {
    public static void checkWithRegExp(String userNameString) {
        String pattern = "^[a-zA-Z0-9_]{3,15}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(userNameString);

        while (m.find()) {
            System.out.println(userNameString.substring(m.start(), m.end()) + " valid ");
        }
        if (m.matches() == false) {
            System.out.println(userNameString + " not valid");
        }
    }
}
