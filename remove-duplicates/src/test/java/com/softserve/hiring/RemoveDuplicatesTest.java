package com.softserve.hiring;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    void givenStringWithoutDuplicates_whenRemovingDuplicates_thenShouldReturnSameString() {
        assertEquals("ABC123", RemoveDuplicates.removeDuplicatesUsingSet("ABC123"));
        assertEquals("ABC123", RemoveDuplicates.removeDuplicatesUsingStreams("ABC123"));
        assertEquals("ABC123", RemoveDuplicates.removeDuplicatesUsingBooleanArray("ABC123"));
        assertEquals("ABC123", RemoveDuplicates.removeDuplicatesUsingHashMap("ABC123"));
        assertEquals("ABC123", RemoveDuplicates.removeDuplicatesUsingOrderedSet("ABC123"));
    }

    @Test
    void givenStringWithDuplicates_whenRemovingDuplicates_thenShouldReturnUniqueCharacters() {
        assertEquals("ABCD123", RemoveDuplicates.removeDuplicatesUsingSet("AABBCCD112233"));
        assertEquals("ABCD123", RemoveDuplicates.removeDuplicatesUsingStreams("AABBCCD112233"));
        assertEquals("ABCD123", RemoveDuplicates.removeDuplicatesUsingBooleanArray("AABBCCD112233"));
        assertEquals("ABCD123", RemoveDuplicates.removeDuplicatesUsingHashMap("AABBCCD112233"));
        assertEquals("ABCD123", RemoveDuplicates.removeDuplicatesUsingOrderedSet("AABBCCD112233"));
    }

    @Test
    void givenEmptyString_whenRemovingDuplicates_thenShouldReturnEmptyString() {
        assertEquals("", RemoveDuplicates.removeDuplicatesUsingSet(""));
        assertEquals("", RemoveDuplicates.removeDuplicatesUsingStreams(""));
        assertEquals("", RemoveDuplicates.removeDuplicatesUsingBooleanArray(""));
        assertEquals("", RemoveDuplicates.removeDuplicatesUsingHashMap(""));
        assertEquals("", RemoveDuplicates.removeDuplicatesUsingOrderedSet(""));
    }

    @Test
    void givenNullInput_whenRemovingDuplicates_thenShouldReturnNull() {
        assertNull(RemoveDuplicates.removeDuplicatesUsingSet(null));
        assertNull(RemoveDuplicates.removeDuplicatesUsingStreams(null));
        assertNull(RemoveDuplicates.removeDuplicatesUsingBooleanArray(null));
        assertNull(RemoveDuplicates.removeDuplicatesUsingHashMap(null));
        assertNull(RemoveDuplicates.removeDuplicatesUsingOrderedSet(null));
    }

    @Test
    void givenStringWithRepeatedCharacters_whenRemovingDuplicates_thenShouldReturnCondensedString1() {
        assertEquals("HELOWRD", RemoveDuplicates.removeDuplicatesUsingSet("HHHEELLLLOOOOWWWRRRDDD"));
        assertEquals("HELOWRD", RemoveDuplicates.removeDuplicatesUsingStreams("HHHEELLLLOOOOWWWRRRDDD"));
        assertEquals("HELOWRD", RemoveDuplicates.removeDuplicatesUsingBooleanArray("HHHEELLLLOOOOWWWRRRDDD"));
        assertEquals("HELOWRD", RemoveDuplicates.removeDuplicatesUsingHashMap("HHHEELLLLOOOOWWWRRRDDD"));
        assertEquals("HELOWRD", RemoveDuplicates.removeDuplicatesUsingOrderedSet("HHHEELLLLOOOOWWWRRRDDD"));
    }

    @Test
    void givenStringWithRepeatedCharacters_whenRemovingDuplicates_thenShouldReturnCondensedString2() {
        assertEquals("PYTHON3", RemoveDuplicates.removeDuplicatesUsingSet("PPYYTTHHOONN3333"));
        assertEquals("PYTHON3", RemoveDuplicates.removeDuplicatesUsingStreams("PPYYTTHHOONN3333"));
        assertEquals("PYTHON3", RemoveDuplicates.removeDuplicatesUsingBooleanArray("PPYYTTHHOONN3333"));
        assertEquals("PYTHON3", RemoveDuplicates.removeDuplicatesUsingHashMap("PPYYTTHHOONN3333"));
        assertEquals("PYTHON3", RemoveDuplicates.removeDuplicatesUsingOrderedSet("PPYYTTHHOONN3333"));
    }

    @Test
    void givenStringWithRepeatedCharacters_whenRemovingDuplicates_thenShouldReturnCondensedString3() {
        assertEquals("JAVA8", RemoveDuplicates.removeDuplicatesUsingSet("JJJAAAVVVAAA888"));
        assertEquals("JAVA8", RemoveDuplicates.removeDuplicatesUsingStreams("JJJAAAVVVAAA888"));
        assertEquals("JAVA8", RemoveDuplicates.removeDuplicatesUsingBooleanArray("JJJAAAVVVAAA888"));
        assertEquals("JAVA8", RemoveDuplicates.removeDuplicatesUsingHashMap("JJJAAAVVVAAA888"));
        assertEquals("JAVA8", RemoveDuplicates.removeDuplicatesUsingOrderedSet("JJJAAAVVVAAA888"));
    }

    @Test
    void givenStringWithRepeatedCharacters_whenRemovingDuplicates_thenShouldReturnCondensedString4() {
        assertEquals("CODINGFUN", RemoveDuplicates.removeDuplicatesUsingSet("CCCOOODDDIIINNNGGGFFFUUUNNN"));
        assertEquals("CODINGFUN", RemoveDuplicates.removeDuplicatesUsingStreams("CCCOOODDDIIINNNGGGFFFUUUNNN"));
        assertEquals("CODINGFUN", RemoveDuplicates.removeDuplicatesUsingBooleanArray("CCCOOODDDIIINNNGGGFFFUUUNNN"));
        assertEquals("CODINGFUN", RemoveDuplicates.removeDuplicatesUsingHashMap("CCCOOODDDIIINNNGGGFFFUUUNNN"));
        assertEquals("CODINGFUN", RemoveDuplicates.removeDuplicatesUsingOrderedSet("CCCOOODDDIIINNNGGGFFFUUUNNN"));
    }

    @Test
    void givenStringWithRepeatedCharacters_whenRemovingDuplicates_thenShouldReturnCondensedString5() {
        assertEquals("PROGRAM", RemoveDuplicates.removeDuplicatesUsingSet("PPPPRRRROOOGGGRAAAAMMMM"));
        assertEquals("PROGRAM", RemoveDuplicates.removeDuplicatesUsingStreams("PPPPRRRROOOGGGRAAAAMMMM"));
        assertEquals("PROGRAM", RemoveDuplicates.removeDuplicatesUsingBooleanArray("PPPPRRRROOOGGGRAAAAMMMM"));
        assertEquals("PROGRAM", RemoveDuplicates.removeDuplicatesUsingHashMap("PPPPRRRROOOGGGRAAAAMMMM"));
        assertEquals("PROGRAM", RemoveDuplicates.removeDuplicatesUsingOrderedSet("PPPPRRRROOOGGGRAAAAMMMM"));
    }
}

