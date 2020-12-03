public class Basic13JavaTest {
    public static void main(String[] args) {
        // 1 - Print 1-255
        Basic13Java b13J = new Basic13Java();
        b13J.printAllNums();

        // 2 - Print Odd Numbers 1-255
        b13J.printOddNums();

        // 3 - Print Sum
        b13J.printSum();

        // 4 - Iterating Through an Array
        int[] arr4 = { 1, 3, 5, 7, 9, 13 };
        b13J.iterateArray(arr4);

        // 5 - Find Max
        int[] arr5 = { -3, -5, -7 };
        b13J.findMax(arr5);

        // 6 - Get Average
        int[] arr6 = { 2, 10, 3 };
        b13J.getAverage(arr6);

        // 7 - Array with Odd Numbers
        b13J.oddArray();

        // 8 - Greater Than Y
        int[] arr8 = { 1, 3, 5, 7 };
        int y = 1;
        b13J.greaterThanY(arr8, y);

        // 9 - Square the Values
        int[] arr9 = { 1, 5, 10, -2 };
        b13J.squareValues(arr9);

        // 10 - Eliminate Negative Numbers
        int[] x = { 1, 5, 10, -2 };
        b13J.elimNegNums(x);

        // 11 - Max, Min and Average
        int[] x11 = { 1, 5, 10, -2 };
        b13J.maxMinAvg(x11);

        // 12 - Shifting the Values in the Array
        int[] x12 = { 1, 5, 10, -2 };
        b13J.shiftVals(x12);
    }
}