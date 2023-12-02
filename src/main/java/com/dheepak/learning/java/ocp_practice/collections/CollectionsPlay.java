package com.dheepak.learning.java.ocp_practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsPlay {

    public static void main(String[] args) {
        Collection<String> collectionOfNames = new ArrayList<>();
        Collections.addAll(collectionOfNames, "Alice", "Bob", "Tom","Dick","Harriet");
        System.out.println(collectionOfNames);

        while(collectionOfNames.iterator().hasNext()){
            System.out.println(collectionOfNames);
        }
    }

}
