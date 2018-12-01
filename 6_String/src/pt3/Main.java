package pt3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// method t/f
//in main sout
public class Main {


    public static void main(String[] args) {

        String[] paterns = {"Vasa_1", "Monarx777", "f1", "Doc_57", "Lubs", "ssssssssssssssssssssssssssssssssssssssssssss"};

        for (int i = 0; i < paterns.length; i++) {
            RegularMethod.checkWithRegExp(paterns[i]);
        }
    }
}
