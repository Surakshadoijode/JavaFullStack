package multithreading;

public class IdentifyWords {
	public static String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toLowerCase(); // Make case-insensitive
        String[] wordList = input2.toLowerCase().split(":");
        StringBuilder result = new StringBuilder();

        for (String word : wordList) {
            if (word.length() != input1.length()) {
                continue;
            }

            boolean match = true;
            for (int i = 0; i < input1.length(); i++) {
                char ch1 = input1.charAt(i);
                char ch2 = word.charAt(i);

                if (ch1 != '_' && ch1 != ch2) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result.append(word.toUpperCase()).append(" ");
            }
        }

        if (result.length() == 0) {
            return "ERROR-009";
        }
        return result.toString().trim();
    }


	public static void main(String[] args) {
		String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
        System.out.println(identifyPossibleWords(input1, input2));

	}

}
