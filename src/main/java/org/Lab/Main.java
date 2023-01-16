package org.Lab;

import LabPart3.Player;
import LabPart3.Warrior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();
        int n=7;
        array=Laboratory.odd(10);

        System.out.println(array.toString());

        String word="Don't break my heart";

        System.out.println(Laboratory.keywords(word));

        String word2="I love to breakdance";

        System.out.println(Laboratory.keywords(word2));

        Player warr1=new Warrior(100,10,5);

        System.out.println(warr1.getLives());
        warr1.decreaseLives();
        System.out.println(warr1.getLives());












    }
}