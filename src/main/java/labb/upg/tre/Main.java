package labb.upg.tre;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();

        str.add("göran");
        str.add("Emma");
        str.add("lusthus");
        str.add("ea");
        str.add("goran");
        str.add("Snöre");
        str.add("alla");
        str.add("pol");
        str.add("fluffigare");
        str.add("kalle");
        str.add("göran");
        str.add("göran");
        str.add("göran");
        str.add("göran");
        str.add("göaran");


        Pattern p = Pattern.compile("a|e|i|o|u|y|A|E|I|O|U");
        Matcher m = p.matcher("");
        int count = 0;

        for (String s : str) {
            m = p.matcher(s);
            while (m.find()) count++;
            if (count >= 2) System.out.println(s);
            count = 0;
        }

    }
}
