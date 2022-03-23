package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Color {

    public static final Map<String, String> colors = new HashMap<String, String>();

    public Color(){
        colors.put("reset", "\u001B[0m");
        colors.put("black", "\u001B[30m");
        colors.put("red", "\u001B[31m");
        colors.put("green", "\u001B[32m");
        colors.put("yellow", "\u001B[33m");
        colors.put("blue", "\u001B[34m");
        colors.put("purple", "\u001B[35m");
        colors.put("cyan", "\u001B[36m");
        colors.put("white", "\u001B[37m");
    }
}
