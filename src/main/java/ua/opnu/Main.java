package ua.opnu;

public class Main {
      public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * Example:
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     */
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }


    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     * Example:
     * in1020(12, 99) → true
     * in1020(21, 12) → true
     * in1020(8, 99) → false
     */
    public boolean in1020(int value1, int value2) {
        return (value1 >= 10 && value1 <= 20) || (value2 >= 10 && value2 <= 20);
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1
     * or more of them are teen.
     * Example:
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     */
    public boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    // ======== Boolean expressions ========

    /**
     * The parameter weekday is true if it is a weekday,
     * and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * Example:
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * We have two monkeys, a and b,
     * and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling.
     * Return true if we are in trouble.
     * Example:
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     */
    public boolean monkeyTrouble(boolean firstSmile, boolean secondSmile) {
        return firstSmile == secondSmile;
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative"
     * is true, then return true only if both are negative.
     * Example:
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     */
    public boolean posNeg(int value1, int value2, boolean negative) {
        if (negative) {
            return value1 < 0 && value2 < 0;
        } else {
            return (value1 < 0 && value2 > 0) || (value1 > 0 && value2 < 0);
        }
    }


    // ======== Loops and Arrays ========

    /**
     * Given an array of ints, return the number of 9's in the array.
     * Example:
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * Example:
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public boolean arrayFront9(int[] nums) {
        int len = Math.min(nums.length, 4);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     * Example:
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * Example:
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding"
     * yields "codign".
     * Example:
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     */
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }


    /**
     * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
     * The string length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     */
    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }


}