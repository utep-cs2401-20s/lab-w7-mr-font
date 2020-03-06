import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class SortOfSortTester {

    //NOTE: These tests were run with the SortOfSort class being given a temporary
    // return type of int[] to simplify testing.
    //To run SortOfSortTester first change the void return type in the sortOfSort method
    // to int[] and uncomment the return statement on line 49 of SortOfSort.java

    @org.junit.jupiter.api.Test
    //This test uses the array example included in the assignment pdf, and was used as a base test for for the method
    //
    //Result: The method passed the test with the given array
    public void testSortOfSortPDF(){

        SortOfSort testPDF = new SortOfSort();
        int[] testArrayPDF = {2,7,1,3,0,9,6,5};
        int[] testArrayPDFSortOfSorted = {6,5,1,0,2,3,7,9};
        SortOfSort.sortOfSort(testArrayPDF);

        assertArrayEquals(testArrayPDFSortOfSorted, testPDF.sortOfSort(testArrayPDF));
    }

    @org.junit.jupiter.api.Test
    //This test will see if the method works with a test array that has elements from 1 to 100, and is of even length
    //
    //Array length: 10
    //Array value range: 1 to 100
    //
    //Result: The method passed the test with given array
    public void testSortOfSort1Even(){

        SortOfSort test1 = new SortOfSort();
        int[] testArray1Even = {8,59,45,24,9,4,23,9,92,6};
        int[] testArray1EvenSortOfSorted = {45,24,9,8,4,6,9,23,59,92};
        SortOfSort.sortOfSort(testArray1Even);

        assertArrayEquals(testArray1EvenSortOfSorted, test1.sortOfSort(testArray1Even));
    }

    @org.junit.jupiter.api.Test
    //This test is almost the same as the last one, but the array length is now odd.
    //
    //Array length: 9
    //Array value range: 1 to 100
    //
    //Result: The method passed the test with the given array
    public void testSortOfSort2Odd(){

        SortOfSort test2 = new SortOfSort();
        int[] testArray2Odd = {47,28,97,60,14,26,84,14,71};
        int[] testArray2OddSortOfSorted = {71,60,26,14,14,28,47,84,97};
        SortOfSort.sortOfSort(testArray2Odd);

        assertArrayEquals(testArray2OddSortOfSorted, test2.sortOfSort(testArray2Odd));
    }

    @org.junit.jupiter.api.Test
    //In this test the array elements all have the same value, 0. This test is just to be thorough.
    //
    //Array length: 9
    //Array value range: 0 to 0
    //
    //Result: The method passed the test with the given array
    public void testSortOfSort3Same(){

        SortOfSort test3 = new SortOfSort();
        int[] testArray3Same = {0,0,0,0,0,0,0,0,0};
        int[] testArray3SameSortOfSorted = {0,0,0,0,0,0,0,0,0};
        SortOfSort.sortOfSort(testArray3Same);

        assertArrayEquals(testArray3SameSortOfSorted, test3.sortOfSort(testArray3Same));
    }

    @org.junit.jupiter.api.Test
    //This test is to see if the method functions correctly given an array filled with negative numbers
    //
    //Array length: 10
    //Array value range: -1 to -100
    //
    //Result: The method passed the test with the given array
    public void testSortOfSort4Neg(){

        SortOfSort test4 = new SortOfSort();
        int[] testArray4Neg = {-52,-100,-45,-23,-78,-99,-19,-48,-13,-70};
        int[] testArray4NegSortOfSorted = {-23,-45,-70,-78,-100,-99,-52,-48,-19,-13};
        SortOfSort.sortOfSort(testArray4Neg);

        assertArrayEquals(testArray4NegSortOfSorted, test4.sortOfSort(testArray4Neg));
    }

    @org.junit.jupiter.api.Test
    //In this test an array featuring both positive and negative elements is used
    //
    //Array length: 10
    //Array value range: -100 to 100
    //
    //Result: The method passed the test with the given array
    public void testSortOfSort5NegPos(){

        SortOfSort test5 = new SortOfSort();
        int[] testArray5NegPos = {-79,74,47,95,6,-93,-87,-48, 69,56};
        int[] testArray5NegPosSortOfSorted = {69,56,-48,-79,-93,-87,6,47,74,95};
        SortOfSort.sortOfSort(testArray5NegPos);

        assertArrayEquals(testArray5NegPosSortOfSorted, test5.sortOfSort(testArray5NegPos));
    }

    @org.junit.jupiter.api.Test
    //This test is a best case scenario, where the array is of size one, and is already sorted.
    // This would be an edge case.
    //
    //Array length: 1
    //Array value range: 1 to 1
    //
    //Result: The method passed the test with the given array
    public void testSortOfSort6size1(){

        SortOfSort test6 = new SortOfSort();
        int[] testArray6size1 = {1};
        int[] testArray6size1SortOfSorted = {1};
        SortOfSort.sortOfSort(testArray6size1);

        assertArrayEquals(testArray6size1SortOfSorted, test6.sortOfSort(testArray6size1));
    }

}