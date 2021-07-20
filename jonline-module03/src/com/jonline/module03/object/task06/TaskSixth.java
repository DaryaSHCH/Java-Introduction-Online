package com.jonline.module03.object.task06;

/*
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class TaskSixth {
	public static void main(String[] args) {
		String sentence = "An apple is green";

		getNewString(sentence);
	}

	private static void getNewString(String s) {

		StringBuilder stringBuild = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			stringBuild.append(s.charAt(i));
			stringBuild.append(s.charAt(i));
		}

		System.out.println(stringBuild);
	}
}
