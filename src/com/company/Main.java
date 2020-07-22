package com.company;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {
    public static int[] array = {1, 2, 4, -1, 5, 1, 43, 12, 98, 56, 78, 12};
    private static final String delimiter = "------------------------------------------------------------------------------------------------------------------------------------";
    private static final String string = "equal";

    public static void main(String[] args) {
        out.println("Do the array Elements located before " +
                "the first negative element form an increasing sequence?");
        out.println(isIncreasing(array));
        out.println(delimiter);
        out.println();


        out.println("You are given a lowercase alphabet string text. " +
                " Return a new string where every character in text is\n" +
                "mapped to its reverse in the alphabet, so that a becomes z, b becomes y, c becomes x, and so on.");
        out.println(reversedAlphabet(string));
        out.println(delimiter);
        out.println();

        out.println("The Reversed case of each letter: ");
        out.println(reversedCase(string));
        out.println(delimiter);
        out.println();

        out.println("Usual array: ");
        out.println(Arrays.toString(array));
        out.println("Reversed Array: ");
        out.println(Arrays.toString(reversedArray(array)));
        out.println(delimiter);
        out.println();

        String artificial = "I would like to show the magic of algorithms";

        out.println("Given a string s, return a new string where for every" +
                " word the first character is moved the end with the suffix ay added.\n");
        out.println("Our string: " + artificial);
        out.print("Our changed string: ");
        out.println(replaceAyToTheEnd(artificial));
        out.println(delimiter);
        out.println();

        out.print("Counting of sort elements in array: ");
        out.println(Arrays.toString(array));
        out.println(countSortedElements(array));
        out.println(delimiter);
        out.println();

        int num = 75671234;
        out.println("Given a positive integer num, return the sum of its digits: " + num);
        out.println(sumOfDigitsOfNumber(num));
        out.println(delimiter);
        out.println();

        out.println("Using factorial");
        out.println(factorial(10));
        out.println(delimiter);
        out.println();

        List<String> someStrings = new ArrayList<>(Arrays.asList("Opel", "Mercedes", "Toyota", "Lada"));
        out.println("We have a list: " + someStrings);
        out.println("Printing the shortest: " + theShortestStrings(someStrings));
        out.println(delimiter);
        out.println();

        out.println("Demonstration of factorial functions");
        out.println(FactorialFunctions.factorial(10));
        out.println(FactorialFunctions.recurtionFactorial(10));
        out.println("Numbers of Fibbonachi");
        out.println(FactorialFunctions.recurtionNumberOfFibonnachi(10));
        out.println(delimiter);
        out.println();

        out.println("Modified deleting");
        List<Integer> listForExample = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)); // 9 elements;
        out.print("We have a list: " + listForExample + "\n");
        out.print("List after deleting: ");
        modifiedDeleting(listForExample, 3, 4);
        out.println(delimiter);
        out.println();

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 4, 8, 8, 4, 12, 12, 14));
        out.println("What is the longest sequence of equal numbers in list: " + nums);
        out.println(theLongestSequence(nums));
        out.println(delimiter);
        out.println();

        Map<String, String> mapBully = new HashMap<>();
        mapBully.put("a", "someValue");
        out.println(" Change and return this map as follows: if the key a" +
                " has a value, set the key  b  to have this value,\n" +
                " and set the key a to have the value . Basically, b is a bully" +
                " taking a value and replacing it with an empty string.");
        out.println(AlgorithmsWithMap.mapBully(mapBully));
        out.println(delimiter);
        out.println();

        out.println("//Given a map of food keys and topping values," +
                " modify and return the map as follows: " +
                "if the key \"ice cream\" is present, set its value to \"cherry\"." +
                " In all cases, set the key \"bread\" to have the value \"butter\".");
        Map<String, String> food = new HashMap<>();
        food.put("ice cream", "banana");
        out.println(AlgorithmsWithMap.topping(food));
        out.println(delimiter);
        out.println();

        Map<String, String> ABmap = new HashMap<>();
        ABmap.put("a", "value");
        ABmap.put("b", "value");
        out.println(ABmap);
        out.println("Change and return this map as follows: " +
                "if the keys \"a\" and \"b\" are in the map and" +
                "have the same values, delete both of them.");
        out.println(AlgorithmsWithMap.mapAB2(ABmap));
        out.println(delimiter);
        out.println();

        out.println("Counts the quantity of word in the array ");
        String greka = "Ехал грека через реку видит грека в реке рак сунул грека руку в реку рак за рку греку цап";
        out.println(greka);
        String[] strings = greka.split(" ");
        out.println(AlgorithmsWithMap.wordCount(strings));
        out.println(delimiter);
        out.println();

        String number = "123456";
        out.println("Checks if the string is number: " + number);
        out.println(isNumber(number));
        String notnumber = "12h45lo";
        out.println("Checks if the string is number: " + notnumber);
        out.println(isNumber(notnumber));
        out.println(delimiter);
        out.println();


        List<String> strings1 = new ArrayList<>(Arrays.asList("aaa", "aaa", "bb", "bbb", "cc", "ccc", "ccc", "ddd", "ddd", "ddd", "ddd"));
        out.println("maximal equal consequence of elements in: " + strings1 + " is: ");
        maxEqualElems(strings1);
        out.println(delimiter);
        out.println();


    }

    public static boolean isIncreasing(int[] array) {
        boolean flag = false;
        int marker = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                marker = i;
                break;
            }
        }
        for (int i = 0; i < (marker - 1); i++) {
            if (array[i] < array[i + 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static String reversedAlphabet(String text) {
        List<Character> word = new ArrayList<>();
        for (int i = 0; i < text.length() ; i++) {
            word.add(text.charAt(i));
        }
        List<Character> alphabet = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        List<Character> modifiedList = new ArrayList<>();

        for (int i = 0; i < word.size() ; i++) {
            int index = alphabet.indexOf(word.get(i));
            modifiedList.add(alphabet.get(25-index));
        }
        String string =  modifiedList.stream().map(String::valueOf).collect(Collectors.joining());
        return string;
    }

    public static String reversedCase(String s) {
        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])) {
                ch[i] = Character.toUpperCase(ch[i]);
            } else {
                ch[i] = Character.toLowerCase(ch[i]);
            }

        }

        return String.valueOf(ch);
    }

    public static int[] reversedArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = ans.length - 1;
        for (int j = 0; j < ans.length; j++) {
            ans[j] = nums[i--];
        }
        return ans;
    }

    public static String replaceAyToTheEnd(String s) {
        String[] strings1 = s.split(" ");
        String answer = Arrays.
                stream(strings1).
                map(str -> str = str.substring(1) + str.substring(0, 1) + "ay" + " ").
                collect(Collectors.joining());

        return answer.substring(0, answer.length() - 1);

    }

    public static int countSortedElements(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = nums[i];

        }
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] == nums[i]) {
                counter++;
            }

        }
        return counter;
    }

    public static int sumOfDigitsOfNumber(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static List<String> theShortestStrings(List<String> list) {
        String min = list.get(0);
        List<String> theShortestStrings = new ArrayList<>();
        for (String s : list) {
            if (min.length() > s.length())
                min = s;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min.length()) {
                theShortestStrings.add(list.get(i));
            }
        }
        return theShortestStrings;
    }

    public static void modifiedDeleting(List<Integer> list, int position, int quantity) {
        if (list.size() >= position + quantity) {
            System.out.println(modifiedArray(list, position, quantity));
        } else {
            System.out.println("You have error in choosing positions and quantity of deleting. ArrayIndexOutOfBoundsException");
        }
    }

    public static List<Integer> modifiedArray(List<Integer> list, int position, int quantity) {

        while (quantity >= 0) {
            list.remove(position);
            quantity--;
        }
        return list;
    }

    public static int theLongestSequence(List<Integer> list) {
        int maxlength = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int counter = 1;
            int k = i + 1;
            while (true) {
                if (list.get(i).equals(list.get(k))) {
                    counter++;
                    if (k < 9) {
                        k++;
                    } else
                        break;
                } else
                    break;
            }
            if (counter > maxlength) {
                maxlength = counter;
            }

        }
        return maxlength;
    }

    public static void maxEqualElems(List<String> list) {

        int counter = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                } else break;
            }
            if (count > counter) {
                counter = count;
            }
        }
        System.out.println(counter);

    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') || (!Character.isDigit(c) && c != '-') || (chars.length == 1 && c == '-')) {
                return false;
            }
        }
        return true;
    }
}




