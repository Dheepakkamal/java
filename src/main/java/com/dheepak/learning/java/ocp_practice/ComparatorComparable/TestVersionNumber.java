package com.dheepak.learning.java.ocp_practice.ComparatorComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestVersionNumber {

    private static List<VersionNumber> getVersionNumberData() {
//        List<VersionNumber> listVno = Arrays.asList(new VersionNumber(10, 12, 13),
//                new VersionNumber(9, 8, 7),
//                new VersionNumber(1, 2, 3),
//                new VersionNumber(21, 99, 82));
        List<VersionNumber> listVno = Arrays.asList(new VersionNumber(0, 12, 13),
                new VersionNumber(9, 8, 7),
                new VersionNumber(1, 2, 3),
                new VersionNumber(21, 99, 82));
//        List<VersionNumber> listVno = new ArrayList<>( List.of(new VersionNumber(10, 12, 13),
//                new VersionNumber(9, 8, 7),
//                new VersionNumber(1, 2, 3),
//                new VersionNumber(21, 99, 82)));
//        List<VersionNumber> listVno = List.of(new VersionNumber(10, 12, 13),
//                new VersionNumber(9, 8, 7),
//                new VersionNumber(1, 2, 3),
//                new VersionNumber(21, 99, 82));
//        List<VersionNumber> listVno = List.of(new VersionNumber(10, 12, 13),
//                new VersionNumber(9, 8, 7),
//                new VersionNumber(1, 2, 3),
//                new VersionNumber(21, 99, 82)).stream().collect(Collectors.toList());
        return listVno;

    }

    public static void main(String[] args) {
        List<VersionNumber> data = getVersionNumberData();
        System.out.println(data);
        Collections.sort(data);
        System.out.println(data);
    }
}
