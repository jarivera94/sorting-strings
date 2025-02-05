# Remove Duplicates in Java

### Test task:

Given a simple String AABBCCD112233. 
All you need is to return a new String, that will not contain any duplicates. 
The code should be clean, readable and optimized.
 Also, we expect to see test coverage with different test cases.


This project provides multiple implementations to remove duplicate characters from a string while preserving the original order.

## Project Structure

```
remove-duplicates
│── .idea
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.softserve.hiring
│   │   │   │   ├── RemoveDuplicates.java
│   ├── test
│   │   ├── java
│   │   │   ├── com.softserve.hiring
│   │   │   │   ├── RemoveDuplicatesTest.java
│── target
│── pom.xml
│── README.md
```

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java 17**  
- **Maven**  
- **IDE (IntelliJ IDEA, Eclipse, or VS Code with Java support)**  

## Setup and Execution

1. Clone the repository or download the source code.
2. Navigate to the project directory.
3. Compile and run tests using Maven:
   ```sh
   mvn clean install
   ```
4. Run the test suite:
   ```sh
   mvn test
   ```

---

## **Implementation Approaches**

This project implements different approaches to remove duplicate characters while maintaining order.

### 1️ Using `LinkedHashSet`
```java
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
```
**Description:**  
- Uses `LinkedHashSet` to maintain insertion order while ensuring uniqueness.
- Skips consecutive duplicate characters.

**Time Complexity:** `O(n)` (Each character is checked and inserted once)
**Space Complexity:** `O(n)` (Stores unique characters)

---

### 2️ Using Java Streams
```java
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
```
**Description:**  
- Iterates over the string and appends characters only if they differ from the previous one.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

### 3️ Using Boolean Array (Optimized for ASCII)
```java
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
```
**Description:**  
- Uses a boolean array for quick lookups (suitable for ASCII characters).

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)` (Fixed-size boolean array)

---

### 4️ Using `HashMap`
```java
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
```
**Description:**  
- Uses a `HashMap` to track seen characters.
- Ensures no consecutive duplicates are removed.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

### 5️ Using `LinkedHashSet` (Preserving Order)
```java
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
```
**Description:**  
- Similar to `LinkedHashSet`, ensures unique characters appear in the original order.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## **Performance Comparison**

| Approach                        | Time Complexity | Space Complexity |
|---------------------------------|----------------|-----------------|
| **LinkedHashSet**               | `O(n)`        | `O(n)`          |
| **Java Streams**                | `O(n)`        | `O(n)`          |
| **Boolean Array (ASCII)**       | `O(n)`        | `O(1)`          |
| **HashMap**                     | `O(n)`        | `O(n)`          |
| **LinkedHashSet (Preserved Order)** | `O(n)`  | `O(n)`          |

---

## **Conclusion**
- If you need **fast** and **efficient** character filtering while preserving order, `LinkedHashSet` or `HashMap` are great choices.
- If the input is **ASCII only**, a **boolean array** is the most memory-efficient.
- If **stream processing** is preferred, the Java Streams approach works well.

---

