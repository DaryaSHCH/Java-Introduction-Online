package com.jonline.module03.regex.task01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */
public class TaskFirst {
	public static void main(String[] args) {
		int start;
		String shortTale = "Как только это случилось, я поспешил домой, чтобы сообщить жене печальное известие. "
				+ "Но она, похоже, совсем меня не слушала. "
				+ "Она вообще меня не замечала. Она посмотрела прямо сквозь меня и налила себе выпить. Включила телевизор.\r\n"
				+ "\r\n" + "В этот момент раздался телефонный звонок. Она подошла и взяла трубку.\r\n" + "\r\n"
				+ "Я увидел, как сморщилось её лицо. Она горько заплакала.";
		start = inputToConsole();

		if (start == 1) {
			sortQuantitySentences(shortTale);
		} else if (start == 2) {
			sortWordsLength(shortTale);
		} else if (start == 3) {
			sortLexeme(shortTale);
		}

	}

	public static int inputToConsole() {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int numb;
		do {
			System.out.println(" Input 1 for paragraph sorting with sentences length;\n  "
					+ "Input 2 for sorting words length in every sentence; \n" + "Input 3 for lexeme sorting");

			while (!reader.hasNextInt()) {
				System.out.println("Input integer >>");
				reader.next();
			}
			numb = reader.nextInt();
		} while (numb < 0 || numb > 3);

		return numb;
	}

	public static void sortLexeme(String s) {
		String[] words;
		Pattern patternLexeme;
		Matcher matcher;
		String tempVar;

		patternLexeme = Pattern.compile("[Aa]");

		words = splitWords(s);

		for (int i = 0; i < words.length - 1; i++) {
			int counterOccurrenceI;
			int counterOccurrenceJ;
			for (int j = words.length - 1; j > i; j--) {
				counterOccurrenceI = 0;
				matcher = patternLexeme.matcher(words[i]);

				while (matcher.matches()) {
					counterOccurrenceI++;
				}

				counterOccurrenceJ = 0;
				matcher = patternLexeme.matcher(words[j]);

				while (matcher.matches()) {
					counterOccurrenceJ++;
				}

				if (counterOccurrenceJ > counterOccurrenceI) {
					tempVar = words[i];
					words[i] = words[j];
					words[j] = tempVar;

				} else if (counterOccurrenceJ == counterOccurrenceI) {

					String[] alphabetWords = { words[i], words[j] };
					Arrays.sort(alphabetWords, String.CASE_INSENSITIVE_ORDER);
					words[i] = alphabetWords[0];
					words[j] = alphabetWords[1];
				}
			}
			System.out.println(words[i]);
		}
	}

	public static void sortQuantitySentences(String s) {
		String temporaryPar;
		String[] paragraph;

		paragraph = splitParagraph(s);

		for (int i = 0; i < paragraph.length; i++) {
			String[] quantitySentenceI = splitSentences(paragraph[i]);
			for (int j = paragraph.length - 1; j > i; j--) {
				String[] quantitySentenceJ = splitSentences(paragraph[j]);
				if (quantitySentenceI.length > quantitySentenceJ.length) {
					temporaryPar = paragraph[i];
					paragraph[i] = paragraph[j];
					paragraph[j] = temporaryPar;
				}
			}
			System.out.println(paragraph[i]);
		}

	}

	public static void sortWordsLength(String s) {
		String temporaryVar;
		String[] sentences;

		sentences = splitSentences(s);

		for (String sentence : sentences) {
			String[] words = splitWords(sentence);
			for (int i = 0; i < words.length; i++) {
				for (int j = words.length - 1; j > i; j--) {
					if (words[i].length() > words[j].length()) {
						temporaryVar = words[i];
						words[i] = words[j];
						words[j] = temporaryVar;
					}
				}
				System.out.print(words[i] + " ");
			}
			System.out.println();
		}
	}

	private static String[] splitParagraph(String text) {
		Pattern pattern = Pattern.compile("\r\n");
		return pattern.split(text);
	}

	private static String[] splitSentences(String text) {
		Pattern pattern = Pattern.compile("[.!?\n]+");
		return pattern.split(text);
	}

	private static String[] splitWords(String sentence) {
		Pattern pattern = Pattern.compile("[-.!?,;:\n ]+");
		return pattern.split(sentence);
	}

}
