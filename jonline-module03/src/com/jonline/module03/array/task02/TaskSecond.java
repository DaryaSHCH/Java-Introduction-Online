package com.jonline.module03.array.task02;

/*
 * Замените в строке все вхождения 'word' на 'letter';
 */
public class TaskSecond {
	public static void main(String[] args) {
		String sentence = "Have a word. Have a last word. Render word for word";

		System.out.println("Initial string \n" + sentence);

		sentence = replaceWordToLetter(sentence);

		System.out.println("Result \n" + sentence);
	}

	private static String replaceWordToLetter(String s) {

		char[] charArray = s.toCharArray();

		String anotherSentence = "";

		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i] == 'w' && charArray[i + 1] == 'o' && charArray[i + 2] == 'r' && charArray[i + 3] == 'd') {
				anotherSentence += "letter";
				i += 3;
			} else {
				anotherSentence += charArray[i];
			}
		}

		return anotherSentence;
	}
}
