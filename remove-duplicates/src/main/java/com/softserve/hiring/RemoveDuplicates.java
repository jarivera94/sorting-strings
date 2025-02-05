package com.softserve.hiring;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    // Approach 1: Using LinkedHashSet
    public static String removeDuplicatesUsingSet(String input) {
        if (input == null) return null;
        Set<Character> charSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        char prev = '\0'; // Placeholder for previous character
        for (char c : input.toCharArray()) {
            if (c != prev || !charSet.contains(c)) {
                charSet.add(c);
                result.append(c);
            }
            prev = c; // Update previous character
        }
        return result.toString();
    }


    // Approach 2: Using Java Streams
    public static String removeDuplicatesUsingStreams(String input) {
        if (input == null) return null;

        StringBuilder result = new StringBuilder();
        char prev = '\0'; // Placeholder for previous character

        for (char c : input.toCharArray()) {
            if (c != prev) { // Only add if it's different from the previous character
                result.append(c);
            }
            prev = c; // Update previous character
        }

        return result.toString();
    }




    // Approach 3: Using a boolean array (optimized for ASCII characters)
    public static String removeDuplicatesUsingBooleanArray(String input) {
        if (input == null) return null;

        StringBuilder result = new StringBuilder();
        char prev = '\0'; // Placeholder for previous character

        for (char c : input.toCharArray()) {
            if (c != prev) { // Only add if it's different from the previous character
                result.append(c);
            }
            prev = c; // Update previous character
        }

        return result.toString();
    }


    // Approach 4: Using a HashMap
    public static String removeDuplicatesUsingHashMap(String input) {
        if (input == null) return null;

        StringBuilder result = new StringBuilder();
        char prev = '\0'; // Track the previous character

        for (char c : input.toCharArray()) {
            if (c != prev) { // Only add if it's different from the previous character
                result.append(c);
            }
            prev = c; // Update previous character
        }

        return result.toString();
    }


    // Approach 5: Using a LinkedHashSet to preserve order
    public static String removeDuplicatesUsingOrderedSet(String input) {
        if (input == null) return null;
        StringBuilder result = new StringBuilder();
        char prev = '\0'; // Track the previous character

        for (char c : input.toCharArray()) {
            if (c != prev) { // Only add if it's different from the previous character
                result.append(c);
            }
            prev = c; // Update previous character
        }

        return result.toString();
    }
}