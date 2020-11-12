package org.example;

/**
 * Interface for handling an array of integers.
 *
 *
 *
 *
 *1 Inlämningsuppgift 1
 * 1.1 Inledning
 * Den här inlämningsuppgiften innefattar JUnit 5, ett testramverk för Java.
 * 1.2 Beskrivning
 * Din uppgift är att implementera nedanstående gränssnitt och addera tester för varje metod med
 * hjälp av JUnit 5. Skapa tester i enligt med red-green-refaktorering.
 *
 *Notera följande:
 * 1. Du får lägga till understödjande metoder, men då måste de också testas.
 * 2. Du får inte använda någon annan array-typ än den primitiva.
 *
 */
public interface IIntArray {
    /**
     * Get the average value of the entire array.
     * @return Average.
     */
    double getAverage();
    /**
     * Find and return all positions where an element's value is <val>.
     * @param val Value to find positions for.
     * @return Positions.
     */
    int[] findPositions(int val);
    /**
     * Append a value after the last element.
     * @param element
     */
    void appendLast(int value);
    /**
     * Insert a value at position <pos>.
     * @param pos
     * @param value
     */
    void insertAt(int pos, int value);
    /**
     * Get value at position <pos>.
     * @param pos
     * @return value.
     */
    int getAt(int pos);
    /**
     * Set a new value at position <pos>.
     * @param pos
     * @param element
     */
    void setAt(int pos, int element);
    /**
     * Delete element at position <pos>.
     * Return the deleted element's value.
     * @param pos
     * @return
     */
    int deleteAt(int pos);
}

