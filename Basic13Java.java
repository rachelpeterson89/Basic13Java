import java.util.ArrayList;

public class Basic13Java {

    // 1 - Print 1-255
    public void printAllNums() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // 2 - Print Odd Numbers 1-255
    public void printOddNums() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // 3 - Print Sum
    public void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum = sum + i;
            System.out.println("New number: " + i + " | " + "Sum: " + sum);
        }
    }

    // 4 - Iterating Through an Array
    public void iterateArray(int[] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
    }

    // 5 - Find Max
    public int findMax(int[] arr5) {
        int max = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
        }
        return max;
    }

    // 6 - Get Average
    public int getAverage(int[] arr6) {
        int sum = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum += arr6[i];
        }
        int avg = sum / arr6.length;
        return avg;
    }

    // 7 - Array with Odd Numbers
    public ArrayList oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++) {
            if (i % 2 != 0) {
                y.add(i);
            }
        }
        return y;
    }

    // 8 - Greater Than Y
    public int greaterThanY(int[] arr8, int y) {
        int count = 0;
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] > y) {
                count++;
            }
        }
        // System.out.println("Number of values greater than y: " + count);
        return count;
    }

    // 9 - Square the Values
    public ArrayList squareValues(int[] arr9) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr9.length; i++) {
            Integer squared = arr9[i] * arr9[i];
            newArr.add(squared);
        }
        // System.out.println(newArr);
        return newArr;
    }

    // 10 - Eliminate Negative Numbers
    public ArrayList elimNegNums(int[] x) {
        ArrayList<Integer> newX = new ArrayList<Integer>();
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                newX.add(0);
            } else {
                newX.add(x[i]);
            }
        }
        // System.out.println(newX);
        return newX;
    }

    // 11 - Max, Min and Average
    public ArrayList maxMinAvg(int[] x11) {
        ArrayList<Integer> newX11 = new ArrayList<Integer>();
        int min = x11[0];
        int max = x11[0];
        int sum = 0;

        for (int i = 0; i < x11.length; i++) {
            sum += x11[i];
            if (x11[i] < min) {
                min = x11[i];
            } else if (x11[i] > max) {
                max = x11[i];
            }
        }
        int avg = sum / x11.length;

        newX11.add(min);
        newX11.add(max);
        newX11.add(avg);
        // System.out.println(newX11);
        return newX11;
    }

    // 12 - Shifting the Values in the Array
    public ArrayList shiftVals(int[] x12) {
        ArrayList<Integer> newX12 = new ArrayList<Integer>();
        for (int i = 0; i < x12.length - 1; i++) {
            int addVal = x12[i + 1];
            newX12.add(addVal);
        }
        newX12.add(0);
        // System.out.println(newX12);
        return newX12;
    }
}