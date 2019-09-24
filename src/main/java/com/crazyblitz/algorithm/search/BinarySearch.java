package com.crazyblitz.algorithm.search;


import com.crazyblitz.utils.Constants;
import org.junit.Test;

/**
 * 二分查找
 *
 * @author liuenyuan
 **/
public class BinarySearch {

    public static int binarySearch(int[] dataList, int startIndex, int endIndex, int target) {
        rangeCheck(dataList.length, startIndex, endIndex);
        int low = startIndex;

        // high =  endIndex-1
        int high = endIndex - 1;

        // 循环条件终止 low<=high
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = dataList[mid];

            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return Constants.NOT_FOUND_INDEX;
    }

    public static int binarySearchRecursion(int[] dataList, int startIndex, int endIndex, int target) {
        if (startIndex > endIndex) {
            return Constants.NOT_FOUND_INDEX;
        }

        // mid = (startIndex+endIndex)/2
        int mid = (startIndex + endIndex) >>> 1;
        if (dataList[mid] < target) {
            return binarySearchRecursion(dataList, mid + 1, endIndex, target);
        } else if (dataList[mid] > target) {
            return binarySearchRecursion(dataList, startIndex, mid - 1, target);
        } else {
            return mid;
        }
    }


    private static void rangeCheck(int arrayLength, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            throw new IllegalArgumentException(
                    "startIndex(" + startIndex + ") > endIndex(" + endIndex + ")");
        }
        if (startIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(startIndex);
        }
        if (endIndex > arrayLength) {
            throw new ArrayIndexOutOfBoundsException(endIndex);
        }
    }


    // test module
    private final int[] dataList = {1, 2, 3, 4, 5, 6};

    @Test
    public void testBinarySearch() {
        System.out.println(binarySearch(dataList, 0, dataList.length, 6));
        System.out.println(binarySearch(dataList, 0, dataList.length, 1));
        System.out.println(binarySearch(dataList, 0, dataList.length, -6));
        System.out.println(binarySearch(dataList, 0, dataList.length, 4));
    }

    @Test
    public void testBinarySearchRecursion() {
        System.out.println(binarySearchRecursion(dataList, 0, dataList.length, 6));
        System.out.println(binarySearchRecursion(dataList, 0, dataList.length, 1));
        System.out.println(binarySearchRecursion(dataList, 0, dataList.length, -6));
        System.out.println(binarySearchRecursion(dataList, 0, dataList.length, 4));
    }
}
