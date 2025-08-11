package logicBuildingMilestone2;

import java.util.*;

public class JumbledWords {

    public static String jumbleWord(String word, int method) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < word.length(); i += 2) {
            odd.append(word.charAt(i));
        }

        if (method == 1) {
            for (int i = word.length() - 1; i >= 0; i--) {
                if (i % 2 != 0) { 
                    even.append(word.charAt(i));
                }
            }
        } else if (method == 2) {
            for (int i = 1; i < word.length(); i += 2) {
                even.append(word.charAt(i));
            }
        }

        return odd.toString() + even.toString();
    }

    public static String jumbledWords(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(jumbleWord(word, input2)).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int method = sc.nextInt();

        System.out.println(jumbledWords(sentence, method));
        sc.close();
    }
}

