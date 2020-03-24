package com.company;

/*

1714 Comparable

Implement the Comparable <Beach> interface in the Beach class. Beaches will be used by threads, so make sure that all methods are in sync.
Implement the compareTo method so that when comparing two beaches it produces a number that indicates that the first beach is better (positive number)
or the second beach is better (negative number), and how much better.

Requirements:
1. The Beach class must contain three fields: String name, float distance, int quality.
2. The Beach class must implement the Comparable interface.
3. The compareTo method of the Beach class should at least take into account the quality of the beach and the distance.
4. All methods of the Beach class, except for the main method, must be synchronized.


 */

// Solution = Beach

public class Solution implements Comparable<Solution> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Solution(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Solution o) {
        return name.compareTo(o.getName()) + (int)(distance*quality - o.getDistance()*o.getQuality());
    }
}



