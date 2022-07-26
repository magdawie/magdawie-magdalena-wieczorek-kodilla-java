package com.kodilla.stream.beautifier;

import java.util.Locale;

public class PoemBeautifier {
    public String beautify(String textBeautify) {
        String returnrext = ("ABC " + textBeautify + " ABC").toLowerCase(Locale.ROOT);
        return returnrext;
    }

}
