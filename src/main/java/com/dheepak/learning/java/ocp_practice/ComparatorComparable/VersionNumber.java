package com.dheepak.learning.java.ocp_practice.ComparatorComparable;

import java.util.Comparator;
import java.util.Objects;

public class VersionNumber implements Comparable<VersionNumber> {
    private int release;
    private int revision;
    private int patch;

    public VersionNumber(int release, int revision, int patch) {
        this.release = release;
        this.revision = revision;
        this.patch = patch;
    }

    public int getRelease() {
        return release;
    }

    public int getRevision() {
        return revision;
    }

    public int getPatch() {
        return patch;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public void setPatch(int patch) {
        this.patch = patch;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "VersionNumber{" +
                "release=" + release +
                ", revision=" + revision +
                ", patch=" + patch +
                '}';
    }

    @Override
    public int compareTo(VersionNumber o) {
//        return Integer.compare(this.release, o.getRelease());
        Comparator<VersionNumber> c1 = Comparator.comparingInt(VersionNumber::getRelease).reversed();
        Comparator<VersionNumber> c2 = c1.thenComparingInt(VersionNumber::getRevision);
        Comparator<VersionNumber> c3 = c2.thenComparingInt(VersionNumber::getPatch);
        return Objects.compare(this, o, c3);
//        return c3.compare(this, o);
    }
}
