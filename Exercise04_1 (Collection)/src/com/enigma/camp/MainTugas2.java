
package com.enigma.camp;

import javax.swing.*;
import java.util.*;

public class MainTugas2 {
    public static void main(String[] args) {

        // Make the two lists
        List<String> Angga = Arrays.asList("irfan", "jon", "son", "roy", "putri", "nila", "sari");
        List<String> Anggi = Arrays.asList("joe", "irfan", "sam", "roy", "martin", "tuti", "mulan");
        // Prepare a union
        Set<String> union = new HashSet<String>(Angga);
        union.addAll(Anggi);
        // Prepare an intersection
        Set<String> intersection = new HashSet<String>(Angga);
        intersection.retainAll(Anggi);
        // Subtract the intersection from the union
        union.removeAll(intersection);
        // Print the result
        for (String n : intersection) {
            System.out.println(n);
        }

    }
}

        /*List<Friend> angga = new ArrayList<>();
        angga.add(new Friend("Joe"));
        angga.add(new Friend("irfan"));
        angga.add(new Friend("sam"));
        angga.add(new Friend("roy"));
        angga.add(new Friend("martin"));

        List<Friend> anggi = new ArrayList<>();
        anggi.add(new Friend("irfan"));
        anggi.add(new Friend("jon"));
        anggi.add(new Friend("son"));
        anggi.add(new Friend("roy"));
        anggi.add(new Friend("putri"));
*\
        /*
        for (int i = 0; i <angga.size() ; i++) {
            for (int j = 0; j <anggi.size() ; j++) {
                if (i == j){
                    System.out.println(angga.get(i) + "," + anggi.get(j) );
                }
            }

    }
        }

}*/

