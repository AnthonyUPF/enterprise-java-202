package org.Lab;

import java.util.ArrayList;
import java.util.List;

public class Laboratory {



    public static List<Integer> odd(int n){
        List<Integer> array= new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(i%2==1){
                array.add(i);
            }
        }
        return array;
    }

    public static boolean keywords(String word){
        String [] keywords={ "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };

        for(String keyword: keywords){
            if(word.contains(" "+keyword+" ")){
                return true;
            }
        }
        return false;
    }
}
