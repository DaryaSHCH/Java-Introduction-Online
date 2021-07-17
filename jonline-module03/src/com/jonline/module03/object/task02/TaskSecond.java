package com.jonline.module03.object.task02;

/*
 * . В строке вставить после каждого символа 'a' символ 'b'.
 */
public class TaskSecond {
	public static void main(String[] args) {
		String magicString = "abra cadabra";

		System.out.println(magicString);

		magicString = replaceLetter(magicString);

		System.out.println(magicString);
	}

	private static String replaceLetter(String s) {

		StringBuilder replacement = new StringBuilder(s);

		for (int i = 0; i < replacement.length(); i++) {
			if (replacement.charAt(i) == 'a') {
				replacement.insert(i + 1, 'b');
			}
		}

		return replacement.toString();

	}
}